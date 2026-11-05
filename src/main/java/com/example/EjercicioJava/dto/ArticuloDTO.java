package com.example.EjercicioJava.dto;


/**
 * DTO que permite transferir los datos de un artículo
 * entre las distintas capas de la aplicación.
 *
 * Contiene la información básica del artículo, incluyendo
 * su identificador, nombre, categoría, precio y cantidad disponible.
 */

public class ArticuloDTO {

    private Long idArticulo;
    private String nombre;
    private  String categoria;
    private Double precio;
    private  int cantidad;

    public ArticuloDTO() {
    }

    public ArticuloDTO(Long idArticulo, String nombre, String categoria, Double precio, int cantidad) {
        this.idArticulo = idArticulo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Long getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Long idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
