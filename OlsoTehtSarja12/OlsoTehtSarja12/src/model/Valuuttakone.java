package model;

import java.util.ArrayList;
import java.util.Arrays;

import entity.Valuutta;

public class Valuuttakone implements IValuuttakone {

    IValuuttaDAO valuuttaDAO = new ValuuttaAccessObject();
    private ArrayList<Valuutta> valuutta;
    public Valuuttakone(){
        valuutta = new ArrayList<>(Arrays.asList(valuuttaDAO.readValuutat()));
    }
    @Override
    public String[] getVaihtoehdot() {
        String[] valuutat = new String[valuutta.size()];
        int i = 0;
        for (Valuutta val : valuutta) {
            valuutat[i] = val.getNimi();
            i++;
        }
        System.out.println(valuutat);
        return valuutat;
    }

    @Override
    public double muunna(int mistäIndeksi, int mihinIndeksi, double määrä) {
        
        double muunnos = valuutta.get(mihinIndeksi).getVaihtokurssi() / valuutta.get(mistäIndeksi).getVaihtokurssi() * määrä;
        return muunnos;
    }
    
}
