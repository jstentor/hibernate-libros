package es.micasa.biblio.discos.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="discos")
public class Disco {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="autor")
	private String autor;

	@Column(name="titulo")
	private String titulo;

	@Column(name="coleccion")
	private String coleccion;

	@Column(name="estilo")
	private String estilo;

	@Column(name="localizacion")
	private String localizacion;

	@Column(name="interpretes")
	private String interpretes;

	@Column(name="formato")
	private String formato;

	@Column(name="calificacion")
	private String calificacion;

	@Column(name="volumenes")
	private String volumenes;

	@Column(name="anio_grabacion")
	private Integer anioGrabacion;

	@Column(name="anio_edicion")
	private Integer anioEdicion;

	@Column(name="sello")
	private String sello;

	@Column(name="productor")
	private String productor;

	@Column(name="caratulas")
	private String caratulas;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_at")
	private Date updatedAt;
	
	public Disco() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getColeccion() {
		return coleccion;
	}

	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public String getInterpretes() {
		return interpretes;
	}

	public void setInterpretes(String interpretes) {
		this.interpretes = interpretes;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}

	public String getVolumenes() {
		return volumenes;
	}

	public void setVolumenes(String volumenes) {
		this.volumenes = volumenes;
	}

	public Integer getAnioGrabacion() {
		return anioGrabacion;
	}

	public void setAnioGrabacion(Integer anioGrabacion) {
		this.anioGrabacion = anioGrabacion;
	}

	public Integer getAnioEdicion() {
		return anioEdicion;
	}

	public void setAnioEdicion(Integer anioEdicion) {
		this.anioEdicion = anioEdicion;
	}

	public String getSello() {
		return sello;
	}

	public void setSello(String sello) {
		this.sello = sello;
	}

	public String getProductor() {
		return productor;
	}

	public void setProductor(String productor) {
		this.productor = productor;
	}

	public String getCaratulas() {
		return caratulas;
	}

	public void setCaratulas(String caratulas) {
		this.caratulas = caratulas;
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
	

}
