package co.edu.eam.biblioteca.persistencia.dao.implementaciones.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.biblioteca.persistencia.dao.definiciones.IDAOPrestamo;
import co.edu.eam.biblioteca.persistencia.modelo.entidades.Prestamo;
import co.edu.eam.biblioteca.persistencia.modelo.entidades.Usuario;
import co.edu.eam.ingesoft.desarrollo.biblioteca.persistencia.utilidades.AdministradorEntityManager;

public class DAOPrestamoJPA implements IDAOPrestamo{

	public void crear(Prestamo p) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
	}

	public List<Prestamo> prestamosUsuario(Usuario usu) throws Exception {
		// TODO Auto-generated method stub
		EntityManager en = AdministradorEntityManager.getEntityManager();
		Query q = en.createNamedQuery(Prestamo.LISTA_PRESTAMOS_USUARIO);
		q.setParameter(1, usu);
		List<Prestamo> prestamos = q.getResultList();
		return prestamos;
	}

	

}
