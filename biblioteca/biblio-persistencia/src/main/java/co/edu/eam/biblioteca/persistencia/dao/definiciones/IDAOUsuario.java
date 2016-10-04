package co.edu.eam.biblioteca.persistencia.dao.definiciones;

import co.edu.eam.biblioteca.persistencia.modelo.entidades.Usuario;

public interface IDAOUsuario {
	
	public Usuario buscar(String ced) throws Exception;
}
