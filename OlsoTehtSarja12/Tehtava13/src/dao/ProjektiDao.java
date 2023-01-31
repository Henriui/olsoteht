package dao;

import jakarta.persistence.*;

import entity.*;

public class ProjektiDao {
    public void lisääProjekti(Projekti tt) {
		EntityManager em = datasource.MariaDbJpaConn.getInstance();
		em.getTransaction().begin();
		em.persist(tt);
        em.getTransaction().commit();
	}

	public Projekti haeProjekti(int projektinumero) {
		EntityManager em = datasource.MariaDbJpaConn.getInstance();
		em.getTransaction().begin();
		Projekti t = em.find(Projekti.class, projektinumero);
        em.getTransaction().commit();
        return t;
	}
}
