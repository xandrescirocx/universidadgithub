package co.edu.eam.biblioteca.logica.bos;

import java.util.List;

import co.edu.eam.biblioteca.persistencia.dao.definiciones.IDAOPrestamo;
import co.edu.eam.biblioteca.persistencia.dao.implementaciones.jpa.DAOPrestamoJPA;
import co.edu.eam.biblioteca.persistencia.modelo.entidades.Prestamo;
import co.edu.eam.biblioteca.persistencia.modelo.entidades.Usuario;

public class PrestamoBO {

	private IDAOPrestamo daoPrestamo;

	public PrestamoBO() {
		daoPrestamo = new DAOPrestamoJPA();
	}
	
	/**
	 * Crea un prestamo 
	 * @param p prestamo que se desea crear
	 * @throws Exception Si falla la operación
	 */
	public void crearPrestamo (Prestamo p) throws Exception{
		daoPrestamo.crear(p);
	}
	
	public List<Prestamo> listarPrestamosUsuario (Usuario usu) throws Exception{
		return daoPrestamo.prestamosUsuario(usu);
	}
}
