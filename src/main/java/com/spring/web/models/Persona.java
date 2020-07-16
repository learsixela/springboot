package com.spring.web.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="personas")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;

    @Column(updatable=false)
    private Date createdAt;

    private Date updatedAt;
    private Date deletedAt;

    @OneToOne(mappedBy="persona", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private Licencia licencia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="gimnasio_id")
    private Gimnasio gimnasio;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "clases_personas",
			joinColumns = @JoinColumn(name = "persona_id"),
			inverseJoinColumns = @JoinColumn(name = "clase_id")
	)
	private List<Clase> clases;

	public List<Clase> getClases() {
		return clases;
	}

	public void setClases(List<Clase> clases) {
		this.clases = clases;
	}

	public Persona() {

    }

	@PrePersist
	protected void onCreate() {
		setCreatedAt(new Date());
		setUpdatedAt(new Date());
	}

	@PreUpdate
	protected void onUpdate() {
		setUpdatedAt(new Date());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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

	public Date getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	public Licencia getLicencia() {
		return licencia;
	}

	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}
	
    public Gimnasio getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Gimnasio gimnasio) {
        this.gimnasio = gimnasio;
    }
}
