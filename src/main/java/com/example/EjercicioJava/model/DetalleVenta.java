package com.example.EjercicioJava.model;

import jakarta.persistence.*;


/**
 * Representa una línea o detalle de una venta realizada en el supermercado.
 *
 * Cada detalle relaciona una venta con un artículo e indica
 * la cantidad vendida y el precio unitario aplicado.
 *
 * Una venta puede contener varios detalles y un artículo
 * puede aparecer en diferentes detalles de venta.
 */

@Entity
public class DetalleVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Venta a la que pertenece este detalle. */
    @ManyToOne
    private Venta venta;

    /** Artículo incluido en este detalle de venta. */
    @ManyToOne
    private Articulo articulo;
    private  int cantArt;
    private  Double precio;


    public DetalleVenta() {;
    }

    public DetalleVenta(Long id, int cantArt, Double precio, Venta venta, Articulo articulo) {
        this.id = id;
        this.cantArt = cantArt;
        this.precio = precio;
        this.venta = venta;
        this.articulo = articulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCantArt() {
        return cantArt;
    }

    public void setCantArt(int cantidad) {
        this.cantArt = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}
