package com.example.EjercicioJava.dto;


/**
 * DTO que representa un detalle de una venta.
 *
 * Contiene la información de un artículo incluido en una venta,
 * incluyendo su nombre, cantidad, precio unitario y subtotal.
 */

public class DetalleVentaDTO {


    private Long id;
    private String nombArt;
    private  int cantArt;
    private  Double precio;
    private double subtotal;

    public DetalleVentaDTO() {
    }

    public DetalleVentaDTO(Long id, String nombArt, int cantArt, Double precio, double subtotal) {
        this.id = id;
        this.nombArt = nombArt;
        this.cantArt = cantArt;
        this.precio = precio;
        this.subtotal = subtotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombArt() {
        return nombArt;
    }

    public void setNombArt(String nombArt) {
        this.nombArt = nombArt;
    }

    public int getCantArt() {
        return cantArt;
    }

    public void setCantArt(int cantArt) {
        this.cantArt = cantArt;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
