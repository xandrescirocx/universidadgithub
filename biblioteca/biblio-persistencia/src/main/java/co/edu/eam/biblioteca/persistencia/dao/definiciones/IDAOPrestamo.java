package co.edu.eam.biblioteca.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.biblioteca.persistencia.modelo.entidades.Prestamo;
import co.edu.eam.biblioteca.persistencia.modelo.entidades.Usuario;

public interface IDAOPrestamo {

	public void crear (Prestamo p) throws Exception;
	
	public List<Prestamo> prestamosUsuario(Usuario usu) throws Exception;
}
