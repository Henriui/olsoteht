package model;

/**
 * @author Oma nimesi
 */
 
public class Valuutta {
	// Nämä rajoitteet tulevat tietokannan schemasta
	public final int TUNNUS_MAX = 3;
	public final int NIMI_MAX = 50;
	  
    private String nimi;
    private String tunnus;
    private double vaihtokurssi;

    public Valuutta(String tunnus, double vaihtokurssi, String nimi) {
        setNimi(nimi);
        setTunnus(tunnus);
        setVaihtokurssi(vaihtokurssi);
    }

    public String getTunnus() {
        return tunnus;
    }
    public void setTunnus(String tunnus) {
        if (tunnus.length() <= TUNNUS_MAX)
            this.tunnus = tunnus.toUpperCase();
        else{
            this.tunnus = tunnus.substring(0, TUNNUS_MAX).toUpperCase();
        }
    }
    public String getNimi() {
        
        return nimi;
    }
    public void setNimi(String nimi) {
        if (nimi.length() <= NIMI_MAX)
            this.nimi = nimi;
        else{
            this.nimi = nimi.substring(0, NIMI_MAX);
        }
    }
    public double getVaihtokurssi() {
        return vaihtokurssi;
    }

    public void setVaihtokurssi(double vaihtokurssi) {
        this.vaihtokurssi = vaihtokurssi;
    }
    @Override
    public String toString() {
        return tunnus + ", " + vaihtokurssi + ", " + nimi;
    }
}
