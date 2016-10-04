package co.edu.eam.biblioteca.persistencia.modelo.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="prestamo")
@NamedQueries({
	@NamedQuery(name=Prestamo.LISTA_PRESTAMOS_USUARIO, query = "SELECT p FROM Prestamo p WHERE p.usuario=?1")	
})
public class Prestamo implements Serializable{
	
	public static final String LISTA_PRESTAMOS_USUARIO = "Prestamo.listarPrestamosUsuario";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="libro")
	private Libro libro;
	
	
	@ManyToOne
	@JoinColumn(name="usuario")
	private Usuario usuario;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	
	private boolean entregado;
	
	public Prestamo() {
		entregado=false;
		fecha=new Date();
	}

	public Prestamo(Libro libro, Usuario usuario) {
		this();
		this.libro = libro;
		this.usuario = usuario;
	}

	/**
	 * @return the libro
	 */
	public Libro getLibro() {
		return libro;
	}

	/**
	 * @param libro the libro to set
	 */
	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean isEntregado() {
		return entregado;
	}
	
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	
	

}
