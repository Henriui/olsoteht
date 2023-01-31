package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Henri Uimonen
 */

public class ValuuttaAccessObject implements IValuuttaDAO {
    private Connection connection;

    public ValuuttaAccessObject(){
            openDbConnection();
    }

    public boolean openDbConnection()   {
        System.out.println("Opening connection...");
        try {
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/olso", "olso", "olso");
        return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    public boolean closeDbConnection()  {
        try {
            connection.close();
            System.out.println("Connection closed.");
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;

    }

    @Override
    public boolean createValuutta(Valuutta valuutta)  {
        String tunnus = valuutta.getTunnus();
        
        if (readValuutta(tunnus) != null){
            System.out.println("Valuutta on jo olemassa.");
            return false;
        }
        
        Double vaihtokurssi = valuutta.getVaihtokurssi();
        String nimi = valuutta.getNimi();

        try (PreparedStatement statement = connection.prepareStatement( "INSERT INTO valuutta (Tunnus, Vaihtokurssi, Nimi) values (? , ? , ?)" )) {
            statement.setString(1, tunnus);    
            statement.setDouble(2, vaihtokurssi);    
            statement.setString(3, nimi); 
            if (statement.executeUpdate() >= 1);
                return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }   
        return false;
    }
    @Override
    public boolean updateValuutta(Valuutta valuutta){
        String tunnus = valuutta.getTunnus();

        if (readValuutta(tunnus) == null){
            System.out.println("Valuuttaa ei ole tietokannassa");
            return false;
        }

        Double vaihtokurssi = valuutta.getVaihtokurssi();
        String nimi = valuutta.getNimi();
        try (PreparedStatement statement = connection.prepareStatement( "UPDATE valuutta SET vaihtokurssi = ( ? ), nimi = ( ? ) WHERE tunnus LIKE ( ? )" )) {
            statement.setDouble(1, vaihtokurssi);    
            statement.setString(2, nimi); 
            statement.setString(3, tunnus); 
            int done = statement.executeUpdate();
            if (done >= 1)
                return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }   
        System.out.println("jotain meni vituiks");
        return false;
    }
    @Override
    public boolean deleteValuutta(String tunnus)  {
        try (PreparedStatement statement = connection.prepareStatement( "DELETE FROM valuutta WHERE tunnus LIKE ( ? )" )) {
            statement.setString(1, tunnus);
            int rows = statement.executeUpdate();
            if (rows >= 1)
                return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        return false;
    }
    @Override
    public Valuutta readValuutta(String tunnus){
        try (PreparedStatement statement = connection.prepareStatement( "Select * FROM valuutta WHERE tunnus LIKE ( ? )" )) {
            statement.setString(1, tunnus);

            ResultSet result = statement.executeQuery();

            while(result.next()){
                String tunnnus = result.getString("Tunnus");
                Double vaihtokurssi = result.getDouble("Vaihtokurssi");
                String nimi = result.getString("Nimi");
                Valuutta valuutta = new Valuutta(tunnnus, vaihtokurssi, nimi);

                return valuutta;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Valuutta[] readValuutat() {
        ArrayList<Valuutta> valuutatAL = new ArrayList<>();
        Valuutta[] valuuttaLista;

        try (PreparedStatement statement = connection.prepareStatement( "Select * FROM valuutta" )) {

            ResultSet result = statement.executeQuery();

            while(result.next()){
                String tunnus = result.getString(1);
                Double vaihtokurssi = result.getDouble(2);
                String nimi = result.getString(3);
                Valuutta valuutta = new Valuutta(tunnus, vaihtokurssi, nimi);

                valuutatAL.add(valuutta);
            }       
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        valuuttaLista = new Valuutta[valuutatAL.size()];
        int i = 0;
        for (Valuutta valuutta : valuutatAL) {
                    valuuttaLista[i] = valuutta;
                    i++;
    
        }
        return valuuttaLista;
    }
    
}
