package com.tehtava8.model;

import java.util.Random;

public class Noppa {

    private int luku;
    private static int heittoLkm;

    public Noppa(){
        
    }

    public int heita(int sivuLkm){
        Random rand = new Random();
        luku = rand.nextInt(sivuLkm) + 1;
        heittoLkm++;
        return luku;
    }

    public int getHeittojenLkm(){
        return heittoLkm;
    }
}
