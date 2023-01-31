package dao;

import jakarta.persistence.*;

import entity.*;

public class TyöntekijäDao {
	
	
	public void lisääTyöntekijä(Työntekijä tt) {
		EntityManager em = datasource.MariaDbJpaConn.getInstance();
		em.getTransaction().begin();
		em.persist(tt);
        em.getTransaction().commit();
	}
	
	public Työntekijä haeTyöntekijä(int id) {
		EntityManager em = datasource.MariaDbJpaConn.getInstance();
		em.getTransaction().begin();
		Työntekijä t = em.find(Työntekijä.class, id);
        em.getTransaction().commit();
        return t;
	}
	
	public void muutaNimi(int id, String etunimi, String sukunimi) {
		EntityManager em = datasource.MariaDbJpaConn.getInstance();
		em.getTransaction().begin();
		Työntekijä t = em.find(Työntekijä.class, id);
		t.setEtunimi(etunimi);
		t.setSukunimi(sukunimi);
        em.getTransaction().commit();
	}
	
	public void poistaTyöntekijä(int id) {
		EntityManager em = datasource.MariaDbJpaConn.getInstance();
		em.getTransaction().begin();
		Työntekijä t = em.find(Työntekijä.class, id);
		if (t!=null) {
			em.remove(t);
		}
        em.getTransaction().commit();
	}
}
