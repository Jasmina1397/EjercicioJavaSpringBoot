package com.example.EjercicioJava.model;
import jakarta.persistence.*;
import java.time.LocalDate;


/**
 * Representa una venta realizada en una sucursal del supermercado.
 *
 * Cada venta contiene una fecha, un estado y una referencia a la
 * sucursal donde se ha realizado.
 * Una sucursal puede estar asociada a varias ventas.
 */

@Entity
public class Venta {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVenta;

    private LocalDate fecha;
    private String estado;


    /** Sucursal a la que pertenece la venta. */
    @ManyToOne
    private Sucursal sucursal;


    public Venta() {
    }

    public Venta(Long idVenta, LocalDate fecha, String estado, Sucursal sucursal) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.estado = estado;
        this.sucursal = sucursal;
    }

    public Long getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Long idVenta) {
        this.idVenta = idVenta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Venta(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
}
