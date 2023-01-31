package olsotehtsarj9.model;

import java.util.ArrayList;

public class Valuuttakone implements IValuuttakone {

    private ArrayList<Valuutta> valuutta;
    public Valuuttakone(){
        valuutta = new ArrayList<Valuutta>();
        valuutta.add(new Valuutta("Euroopan euro", 1));
        valuutta.add(new Valuutta("Ruotsin kruunu", 9.4780));
        valuutta.add(new Valuutta("Norjan kruunu", 8.9018));
        valuutta.add(new Valuutta("Yhdysvaltain dollari", 1.0629));
    }
    @Override
    public String[] getVaihtoehdot() {
        String[] valuutat = {"", "", "", ""};
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
