package entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="tyontekija")
public class Työntekijä {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int ttnumero;
	private String etunimi;
	private String sukunimi;
	
	@ManyToOne
	private Työhuone työhuone;
	
	@ManyToMany
	private List<Projekti> projektit = new ArrayList<>();
	
	public Työntekijä() {}
	public Työntekijä(String etunimi, String sukunimi, Työhuone huone, Projekti projekti) {
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.työhuone = huone;
		this.projektit.add(projekti);
	}

	
	public void annaProjekti(Projekti projektit) {
		this.projektit.add(projektit);
	}

	public String getEtunimi() {
		return etunimi;
	}

	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}

	public String getSukunimi() {
		return sukunimi;
	}

	public void setSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}
	
	public String tulostaTiedot() {
		Projekti projekti = new Projekti();
		System.out.println(toString() + ", " + työhuone.toString() + ",  projektit : " );
		for(Projekti pr : projektit) {
			System.out.println(pr.toString());
		}
		return toString() + ", " + työhuone.toString() + ", projekti " + projekti.toString();
	}

	@Override
	public String toString() {
		return "Työntekijä ttnumero = " + ttnumero + ", etunimi = " + etunimi + ", sukunimi = " + sukunimi;
	}
}
