package olsotehtsarj9.model;

/**
 * @author silas
 */

public interface IValuuttakone {
	public abstract String[] getVaihtoehdot();
	public abstract double muunna(int mistäIndeksi, int mihinIndeksi, double määrä);
}
