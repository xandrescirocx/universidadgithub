package co.edu.eam.biblioteca.controladores;

import java.util.List;

import co.edu.eam.biblioteca.logica.bos.LibroBO;
import co.edu.eam.biblioteca.logica.bos.PrestamoBO;
import co.edu.eam.biblioteca.logica.bos.UsuarioBO;
import co.edu.eam.biblioteca.persistencia.modelo.entidades.Libro;
import co.edu.eam.biblioteca.persistencia.modelo.entidades.Prestamo;
import co.edu.eam.biblioteca.persistencia.modelo.entidades.Usuario;

public class ControladorPrestamos {

	private LibroBO libroBo;
	private UsuarioBO usuarioBo;
	private PrestamoBO prestamoBo;
	/**
	 * 
	 */
	public ControladorPrestamos() {
		libroBo = new LibroBO();
		usuarioBo = new UsuarioBO();
		prestamoBo = new PrestamoBO();
	}
	
	/**
	 * Busca un usuario 
	 * @param ced cédula del usuario que se desea buscar
	 * @return el usuario si  lo encuentra, de lo contrario null
	 * @throws Exception si falla la operación
	 */
	public Usuario buscarUsuario(String ced) throws Exception{
		return usuarioBo.buscarUsuario(ced);
	}
	
	/**
	 * Busca un libro 
	 * @param cod codigo del libro que se desea buscar
	 * @return el libro si  lo encuentra, de lo contrario null
	 * @throws Exception si falla la operación
	 */
	public Libro buscarLibro(String cod) throws Exception{
		return libroBo.buscarLibro(cod);
	}
	
	/**
	 * edita un libro
	 * @param lib libro que se desea crear
	 * @throws Exception si falla la operación
	 */
	public void editarLibro (Libro lib) throws Exception{
		libroBo.editar(lib);
	}
	
	/**
	 * Crea un prestamo
	 * @param p prestamo que se desea crear
	 * @throws Exception si falla la operación
	 */
	public void crearPrestamo (Prestamo p) throws Exception{
		prestamoBo.crearPrestamo(p);
	}
	
	public List<Prestamo> listarPrestamos (Usuario usu) throws Exception{
		return prestamoBo.listarPrestamosUsuario(usu);
	}
}
