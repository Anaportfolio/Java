package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gamil.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gamil.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "anamaria@gamil.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		em.getTransaction().commit();
		System.out.print("Pronto!");

		em.close();
		emf.close();
	}

}
