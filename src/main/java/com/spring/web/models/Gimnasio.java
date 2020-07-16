package com.spring.web.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="gimnasio")
public class Gimnasio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;

    @OneToMany(mappedBy="gimnasio", fetch = FetchType.LAZY)
    private List<Deportista> listaDeportista;

    @OneToMany(mappedBy="gimnasio", fetch = FetchType.LAZY)
    private List<Persona> listaPersona;

	public Gimnasio() {
    }

    @PrePersist
    public void prePersist() {
        createdAt = new Date();
        updatedAt = new Date();
    }

    @PreUpdate
    public void preUpdate() {
        updatedAt = new Date();
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

    public List<Deportista> getListaDeportista() {
        return listaDeportista;
    }

    public void setListaDeportista(List<Deportista> listaDeportista) {
        this.listaDeportista = listaDeportista;
    }
    public List<Persona> getListaPersona() {
		return listaPersona;
	}

	public void setListaPersona(List<Persona> listaPersona) {
		this.listaPersona = listaPersona;
	}
}
