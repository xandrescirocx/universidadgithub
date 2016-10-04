package co.edu.eam.biblioteca.logica.bos;

import co.edu.eam.biblioteca.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.biblioteca.persistencia.dao.definiciones.IDAOLibro;
import co.edu.eam.biblioteca.persistencia.dao.implementaciones.jpa.DAOLibroJPA;
import co.edu.eam.biblioteca.persistencia.modelo.entidades.Libro;

public class LibroBO {

	private IDAOLibro daoLibro;
	
	public LibroBO() {
		// TODO Auto-generated constructor stub
		daoLibro = new DAOLibroJPA();
	}
	
	public Libro buscarLibro(String cod) throws Exception {
		Libro libro = daoLibro.buscar(cod);
		if (libro != null) {
			return daoLibro.buscar(cod);
		} else {
			throw new ExcepcionNegocio("El libro no existe");
		}
	}
	
	public void editar(Libro lib) throws Exception {
		daoLibro.editar(lib);
	}
}
