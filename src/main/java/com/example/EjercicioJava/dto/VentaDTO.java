package com.example.EjercicioJava.dto;

import java.time.LocalDate;
import java.util.List;

/**
 * DTO que permite transferir los datos de una venta entre las
 * distintas capas de la aplicación.
 *
 * Incluye los datos principales de la venta, el identificador
 * de la sucursal asociada, una lista de sus detalles y el importe
 * total de la operación.
 */

public class VentaDTO {

    //datos de la venta
    private Long idVenta;
    private LocalDate fecha;
    private String estado;

    //datos de la sucursal
    private Long idSucursal;

    //lista de detalles de la venta
    private List<DetalleVentaDTO> detalle;

    //total de la venta
    private double total;


    public VentaDTO() {
    }

    public VentaDTO(Long idVenta, LocalDate fecha, String estado, Long idSucursal, List<DetalleVentaDTO> detalle, double total) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.estado = estado;
        this.idSucursal = idSucursal;
        this.detalle = detalle;
        this.total = total;
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

    public Long getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Long idSucursal) {
        this.idSucursal = idSucursal;
    }

    public List<DetalleVentaDTO> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<DetalleVentaDTO> detalle) {
        this.detalle = detalle;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
