package com.iudigital.inventarioiudigital.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "inventarios")
public class Inventario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String serialArticulo;

    private String modelo;

    private String descripcion;

    private String foto;

    private double precio;

    @Column(name = " fecha_compra")
    private LocalDateTime fechaCompra;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    @Column(name = "fecha_actualizacion")
    private LocalDateTime fechaActualizacion;

    @JoinColumn(name = "FK", referencedColumnName = "PK usuarios")
    private int usuarioId;

    @JoinColumn(name = "FK", referencedColumnName = "PK marcas")
    private int marcaId;

    @JoinColumn(name = "FK", referencedColumnName = "PK estados_equipos")
    private int estadoEquipoId;

    @JoinColumn(name = "FK", referencedColumnName = "PK tipos_equipos")
    private int tipoEquipoId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerialArticulo() {
        return serialArticulo;
    }

    public void setSerialArticulo(String serialArticulo) {
        this.serialArticulo = serialArticulo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDateTime getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDateTime fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(int marcaId) {
        this.marcaId = marcaId;
    }

    public int getEstadoEquipoId() {
        return estadoEquipoId;
    }

    public void setEstadoEquipoId(int estadoEquipoId) {
        this.estadoEquipoId = estadoEquipoId;
    }

    public int getTipoEquipoId() {
        return tipoEquipoId;
    }

    public void setTipoEquipoId(int tipoEquipoId) {
        this.tipoEquipoId = tipoEquipoId;
    }

}

