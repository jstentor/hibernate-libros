package es.micasa.biblio.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PostLoad;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="autores")
public class Autor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="nombre")
	private String nombre;

	@Column(name="apellidos")
	private String apellido;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_at")
	private Date updatedAt;
	
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="instructor_detail_id")
//	private InstructorDetail instructorDetail;
	
	@Transient
	private String apeNom;

	@PostLoad
	private void onLoad() {
	    this.apeNom = apellido.trim() + 
	    		(nombre.trim().contentEquals("") ? "" : (", " + nombre.trim())) ;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", apeNom=" + apeNom
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
