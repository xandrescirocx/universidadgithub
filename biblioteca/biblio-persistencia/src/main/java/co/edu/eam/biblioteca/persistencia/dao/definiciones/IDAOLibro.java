package co.edu.eam.biblioteca.persistencia.dao.definiciones;

import co.edu.eam.biblioteca.persistencia.modelo.entidades.Libro;

public interface IDAOLibro {
	
	public Libro buscar(String cod) throws Exception;
	
	public void editar(Libro l) throws Exception;
}
