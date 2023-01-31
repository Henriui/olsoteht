package entity;
import jakarta.persistence.*;

@Entity
@Table(name="tyohuone")
public class Työhuone {
    @Id
    private int huonenumero;
    private int henkilökapasiteetti;

    public Työhuone(){}
    public Työhuone(int huonenumero, int henkilökapasiteetti){
        this.huonenumero = huonenumero;
        this.henkilökapasiteetti = henkilökapasiteetti;
    }
@Override
	public String toString() {
		return "Työhuone huonenumero = " + huonenumero + ", henkilökapasiteetti = " + henkilökapasiteetti;
	}
}
