package tehtava5;

import eduni.distributions.ContinuousGenerator;

public class Saapumisprosessi {

    private Tyyppi tyyppi = Tyyppi.SAAPUMINEN;
    private Tapahtuma tapahtuma;
    private Kello kello = Kello.getInstance();
    TapahtumaLista lista;
    ContinuousGenerator gene;
    
    public Saapumisprosessi(TapahtumaLista lista, ContinuousGenerator gene){
    
        this.lista = lista;
        this.gene = gene;
    }
    
    public void luoTapahtuma(){
        tapahtuma = new Tapahtuma(tyyppi,(int) (kello.getAika() + gene.sample()));
        lista.addTapahtuma(tapahtuma);
        kello.setAika(tapahtuma.aika);
    }

}
