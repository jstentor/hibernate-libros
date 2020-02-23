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
@Table(name="piezas")
public class Musico {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="nombre")
	private String nombre;
	
	@Column(name="nombre_completo")
	private String nombreCompleto;
	
	@Column(name="fecha_nac")
	private Date fechaNac;
	
	@Column(name="instrumento")
	private String instrumento;
	
	@Column(name="estilos")
	private String estilos;
	
	@Column(name="comentario")
	private String comentario;
	
	@Column(name="biografia")
	private String biografia;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_at")
	private Date updatedAt;
	
	public Musico() {}
	
}