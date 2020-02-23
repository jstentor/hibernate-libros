package es.micasa.biblio.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="libros")
public class Libro {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;

	@Column(name="titulo")
	private String titulo;

	@Column(name="traductor")
	private String traductor;

	@Column(name="ciudad")
	private String ciudad;

	@Column(name="anio_edicion")
	private Integer anioEdicion;

	@Column(name="edicion")
	private String edicion;

	@Column(name="primera_edicion")
	private Integer primeraEdicion;

	@Column(name="editorial")
	private String editorial;

	@Column(name="tipo")
	private String tipo;

	@Column(name="topografia")
	private String topografia;

	@Column(name="paginas")
	private Integer paginas;

	@Column(name="tomos")
	private Integer tomos;

	@Column(name="idioma")
	private String idioma;

	@Column(name="observaciones")
	private String observaciones;

	@Column(name="baja")
	private boolean baja;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_at")
	private Date updatedAt;
	
	// Relaciones
	// Tema
	@ManyToOne(cascade={CascadeType.DETACH, CascadeType.MERGE, 
			CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name="tema_id")
	private Tema tema;
	
		// Subtema
		// Autor/es
		
	public Libro() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTraductor() {
		return traductor;
	}

	public void setTraductor(String traductor) {
		this.traductor = traductor;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Integer getAnioEdicion() {
		return anioEdicion;
	}

	public void setAnioEdicion(Integer anioEdicion) {
		this.anioEdicion = anioEdicion;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public Integer getPrimeraEdicion() {
		return primeraEdicion;
	}

	public void setPrimeraEdicion(Integer primeraEdicion) {
		this.primeraEdicion = primeraEdicion;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTopografia() {
		return topografia;
	}

	public void setTopografia(String topografia) {
		this.topografia = topografia;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	public Integer getTomos() {
		return tomos;
	}

	public void setTomos(Integer tomos) {
		this.tomos = tomos;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public boolean isBaja() {
		return baja;
	}

	public void setBaja(boolean baja) {
		this.baja = baja;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", editorial=" + editorial + ", baja=" + baja + ", Tema="
				+ tema + "]";
	}
	
			
}
