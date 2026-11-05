package com.example.EjercicioJava.model;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


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
    private double total;

    // Sucursal a la que pertenece la venta
    @ManyToOne
    private Sucursal sucursal;

    /**
     * Lista de detalles asociados a esta venta.
     * Una venta puede contener varios detalles, cada uno de ellos
     * correspondiente a un artículo incluido en la venta.
     */
    @OneToMany(mappedBy = "venta")
    private List<DetalleVenta> detalle = new ArrayList<>();

    public Venta() {
    }

    public Venta(Long idVenta, LocalDate fecha, String estado, double total, Sucursal sucursal, List<DetalleVenta> detalle) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.estado = estado;
        this.total = total;
        this.sucursal = sucursal;
        this.detalle = detalle;
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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public List<DetalleVenta> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<DetalleVenta> detalle) {
        this.detalle = detalle;
    }
}