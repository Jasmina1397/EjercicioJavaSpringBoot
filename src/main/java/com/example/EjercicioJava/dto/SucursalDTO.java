package com.example.EjercicioJava.dto;

/**
 * DTO que permite transferir los datos de una sucursal
 * entre las distintas capas de la aplicación.
 *
 * Contiene el identificador, nombre y dirección de la sucursal,
 * sin exponer directamente la entidad JPA.
 *
 */

public class SucursalDTO {

    private Long idSucursal;
    private String nombre;
    private String direccion;

    public SucursalDTO() {
    }

    public SucursalDTO(Long idSucursal, String nombre, String direccion) {
        this.idSucursal = idSucursal;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Long getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Long idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
