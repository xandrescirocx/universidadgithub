package co.edu.eam.biblioteca.persistencia.dao.implementaciones.jpa;

import javax.persistence.EntityManager;

import co.edu.eam.biblioteca.persistencia.dao.definiciones.IDAOLibro;
import co.edu.eam.biblioteca.persistencia.modelo.entidades.Libro;
import co.edu.eam.ingesoft.desarrollo.biblioteca.persistencia.utilidades.AdministradorEntityManager;

public class DAOLibroJPA implements IDAOLibro{

	public Libro buscar(String cod) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();;
		return em.find(Libro.class, cod);
		
	}

	public void editar(Libro l) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(l);
		em.getTransaction().commit();
		
	}

}
