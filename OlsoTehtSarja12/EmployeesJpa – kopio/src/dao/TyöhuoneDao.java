package dao;
import jakarta.persistence.*;

import entity.*;

public class TyöhuoneDao {

    public void lisääTyöhuone(Työhuone tt) {
		EntityManager em = datasource.MariaDbJpaConn.getInstance();
		em.getTransaction().begin();
		em.persist(tt);
        em.getTransaction().commit();
	}

	public Työhuone haeTyöhuone(int huonenumero) {
		EntityManager em = datasource.MariaDbJpaConn.getInstance();
		em.getTransaction().begin();
		Työhuone t = em.find(Työhuone.class, huonenumero);
        em.getTransaction().commit();
        return t;
	}
}
