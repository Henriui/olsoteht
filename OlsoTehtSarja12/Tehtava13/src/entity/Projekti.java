package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name="projekti")
public class Projekti {

    @Id
    private int projektinumero;
    private String nimi;
    @Temporal(TemporalType.DATE)
    private Date alkamispäivä;
    @Temporal(TemporalType.DATE)
    private Date loppumispäivä;

	@ManyToMany(mappedBy = "projektit")
	private List<Työntekijä> tyontekijat = new ArrayList<>();

    public Projekti(){}
    public Projekti(int projektinumero, String nimi, Date alkamispäivä, Date loppumispäivä){
        this.projektinumero = projektinumero;
        this.nimi = nimi;
        this.alkamispäivä = alkamispäivä;
        this.loppumispäivä = loppumispäivä;
    }

    @Override
	public String toString() {
		return "Projektin  projektinumero = " + projektinumero + ", nimi = " + nimi
				+ ", alkamispäivä = " + alkamispäivä + ", loppumispäivä = " + loppumispäivä;
	}
}
