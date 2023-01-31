package valtiot;

import java.io.Serializable;

/**
* @author Henri Uimonen 5.9.2022
*/

public class Valtio implements Serializable {
	
	// Selvitä itsellesi www-haulla mikä on merkitys/tarve
	private static final long serialVersionUID = 1L;
	private String nimi;
	private String pääkaupunki;
	private int asukasluku;
	
	public Valtio(String nimi, String pääkaupunki, int asukasluku) {
		this.nimi = nimi;
		this.pääkaupunki = pääkaupunki;
		this.asukasluku = asukasluku;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getPääkaupunki() {
		return pääkaupunki;
	}

	public void setPääkaupunki(String pääkaupunki) {
		this.pääkaupunki = pääkaupunki;
	}

	public int getAsukasluku() {
		return asukasluku;
	}

	public void setAsukasluku(int asukasluku) {
		this.asukasluku = asukasluku;
	}
	
	// Lisää getterit ja setterit
	
	// Lisää toString()
	// Saat tiedot sarakkeittain String-luokan staattisella format-metodilla
	// esim. String.format("%-10s %-10s %-10d", nimi, pääkaupunki, asukasluku);

	@Override
	public String toString() {
		String string = String.format("%-10s %-10s %-10d", nimi, pääkaupunki, asukasluku);
		return string;
	}

}
