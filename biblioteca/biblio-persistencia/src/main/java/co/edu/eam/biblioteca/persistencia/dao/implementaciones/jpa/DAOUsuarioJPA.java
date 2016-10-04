package co.edu.eam.biblioteca.persistencia.dao.implementaciones.jpa;

import javax.persistence.EntityManager;

import co.edu.eam.biblioteca.persistencia.dao.definiciones.IDAOUsuario;
import co.edu.eam.biblioteca.persistencia.modelo.entidades.Usuario;
import co.edu.eam.ingesoft.desarrollo.biblioteca.persistencia.utilidades.AdministradorEntityManager;


public class DAOUsuarioJPA implements IDAOUsuario{

	public Usuario buscar(String ced) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();;
		return em.find(Usuario.class, ced);
	}

	
}
