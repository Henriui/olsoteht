package controller;

import model.Valuuttakone;
import view.IValuuttakoneenUI;

public class ValuuttakoneenOhjain implements IValuuttakoneenOhjain {

    private IValuuttakoneenUI view;
    private Valuuttakone kone;

    public ValuuttakoneenOhjain(IValuuttakoneenUI view) {
        this.view = view;
        kone = new Valuuttakone();
    }
    @Override
    public void muunnos() {
        int mista = view.getMistäIndeksi();
        int mihin = view.getMihinIndeksi();
        double maara = view.getMäärä();
        double tulos = kone.muunna(mista, mihin, maara);
        view.setTulos(tulos);
    }

    @Override
    public String[] getValuutat() {

        return kone.getVaihtoehdot();
    }
    
}
