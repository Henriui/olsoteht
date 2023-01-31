package tehtava3;

public class Kello {

    private static Kello kello = null;
    
    private int aika = 0;
    
    private Kello(){

    }

    public static Kello getInstance() {
        if (kello == null) {
        	kello = new Kello();
        }
        return kello;
    }

    public int getAika() {
        return aika;
    }

    public void setAika(int aika) {
        this.aika = aika;
    }

}
