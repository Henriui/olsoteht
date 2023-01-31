package tehtava4;

import eduni.distributions.ContinuousGenerator;

public class Saapumisprosessi {

    private Tyyppi tyyppi = Tyyppi.SAAPUMINEN;
    private Tapahtuma tapahtuma;
    private Kello kello;
    TapahtumaLista lista;
    ContinuousGenerator gene;
    
    public Saapumisprosessi(TapahtumaLista lista, ContinuousGenerator gene){
        kello = Kello.getInstance();
        this.lista = lista;
        this.gene = gene;
    }
    
    public void luoTapahtuma(){
        tapahtuma = new Tapahtuma(tyyppi,(int) (kello.getAika() + gene.sample()));
        lista.addTapahtuma(tapahtuma);
        kello.setAika(tapahtuma.getAika());
    }

}
