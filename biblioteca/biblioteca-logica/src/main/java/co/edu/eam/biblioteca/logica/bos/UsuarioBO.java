package co.edu.eam.biblioteca.logica.bos;

import co.edu.eam.biblioteca.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.biblioteca.persistencia.dao.definiciones.IDAOUsuario;
import co.edu.eam.biblioteca.persistencia.dao.implementaciones.jpa.DAOUsuarioJPA;
import co.edu.eam.biblioteca.persistencia.modelo.entidades.Usuario;

public class UsuarioBO {
	
private IDAOUsuario daoUsuario;
	
	public UsuarioBO() {
		// TODO Auto-generated constructor stub
		daoUsuario = new DAOUsuarioJPA();
	}
	
	public Usuario buscarUsuario(String ced) throws Exception {
		Usuario usu = daoUsuario.buscar(ced);
		if (usu != null) {
			return daoUsuario.buscar(ced);
		} else {
			throw new ExcepcionNegocio("El usuario no existe");
		}
	}
}
