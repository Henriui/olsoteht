package controller;

import com.tehtava8.IView;
import com.tehtava8.model.Noppa;

import javafx.scene.image.Image;

public class NoppaController {

    IView view;

    public NoppaController(IView view){
        this.view = view;
    }
    // Tehtävä 2 ja 3
    
    public String heitaNoppa(){
        Noppa noppa = new Noppa();
            return "Nopista tuli: " + noppa.heita(6) + "\n Heittokerrat:" + noppa.getHeittojenLkm();
        }

    // Tehtävä 4
    public void heitaNoppia(){
        int sivut = 6;
        Noppa noppa1 = new Noppa();
        Noppa noppa2 = new Noppa();
        Noppa noppa3 = new Noppa();
        Noppa noppa4 = new Noppa();
        Noppa noppa5 = new Noppa();

        int[] tulos = {0,0,0,0,0};

        tulos[0] = noppa1.heita(sivut);
        tulos[1] = noppa2.heita(sivut);
        tulos[2] = noppa3.heita(sivut);
        tulos[3] = noppa4.heita(sivut);
        tulos[4] = noppa5.heita(sivut);

        int summa = 0;

        for (int i : tulos) {
            summa += i;
        }

    view.setTulos("Nopista tuli: " + tulos[0] + ", " + tulos[1] + ", " + tulos[2] + ", " + tulos[3] + ", " + tulos[4] + ", Summa: "+ summa +"\n Heittojen määrä: " + noppa1.getHeittojenLkm());
    }


    // Tehtävä 5
    /*
     * Kontrollerissa tulee uusi funktio kolikon esittämiseen viewissä.
     * View pyytää eri funktiolla päivityksen näkymään.
     * 
     * Periaatteessa vain kontrollerin tarvitsee muuttua, jos view:n painike ei olisi kovakoodattu näyttämään "heitä noppaa".
     * 
     * Noppa (model) pysyy samana.
     */


    public void heitaKolikko(){
        int sivut = 2;
        Noppa noppa = new Noppa();

        int tulos = noppa.heita(sivut);

        if (tulos == 1)
            view.setTulos("Kruuna");
        else
            view.setTulos("Klaava");
    }


    Noppa noppa = new Noppa();
    public void imageHeitaNoppa() {
        int sivut = 6;
        Image image = null;
        int tulos = noppa.heita(sivut);

        switch(tulos){
            case 1:
            image = new Image("file:src/main/java/com/tehtava8/resources/dice-six-faces-five.png");
            break;

            case 2:
            image = new Image("file:src/main/java/com/tehtava8/resources/dice-six-faces-two.png");
            break;

            case 3:
            image = new Image("file:src/main/java/com/tehtava8/resources/dice-six-faces-three.png");
            break;

            case 4:
            image = new Image("file:src/main/java/com/tehtava8/resources/dice-six-faces-four.png");
            break;

            case 5:
            image = new Image("file:src/main/java/com/tehtava8/resources/dice-six-faces-five.png");
            break;

            case 6:
            image = new Image("file:src/main/java/com/tehtava8/resources/dice-six-faces-six.png");
            break;
        }

        view.setKuvaTulos(image);

        view.setTulos(Integer.toString(noppa.getHeittojenLkm()));
    }

}
