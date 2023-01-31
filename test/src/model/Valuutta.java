package model;

/**
 * @author Oma nimesi
 */
 
public class Valuutta {
	// Nämä rajoitteet tulevat tietokannan schemasta
	public final int TUNNUS_MAX = 3;
	public final int NIMI_MAX = 50;
	  
    private String nimi;
    private double vaihtokurssi;

    public Valuutta(String nimi, double vaihtokurssi) {
        this.nimi = nimi;
        this.vaihtokurssi = vaihtokurssi;
    }

    public String getNimi() {
        return nimi;
    }

    public double getVaihtokurssi() {
        return vaihtokurssi;
    }

    public void setVaihtokurssi(double vaihtokurssi) {
        this.vaihtokurssi = vaihtokurssi;
    }
    
}
