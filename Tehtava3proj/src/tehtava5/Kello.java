package tehtava5;

public class Kello {

    private static Kello kello = null;
    
    private int aika;
    
    private Kello(){
        aika = 0;
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
