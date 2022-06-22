package com.iudigital.inventarioiudigital.controller.dto;

import java.time.LocalDateTime;

public class InventarioDTO {
    
    private int id;
    private String serialArticulo;
    private String modelo;
    private String descripcion;
    private String foto;
    private double precio;
    private LocalDateTime fechaCompra;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;
    private int usuarioId;
    private int marcaId;
    private int tipoEquipoId;
    private int estadoEquipoId;
    
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
    public int getTipoEquipoId() {
        return tipoEquipoId;
    }
    public void setTipoEquipoId(int tipoEquipoId) {
        this.tipoEquipoId = tipoEquipoId;
    }
    public int getEstadoEquipoId() {
        return estadoEquipoId;
    }
    public void setEstadoEquipoId(int estadoEquipoId) {
        this.estadoEquipoId = estadoEquipoId;
    }

}
