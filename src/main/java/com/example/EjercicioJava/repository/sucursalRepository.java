package com.example.EjercicioJava.repository;

import com.example.EjercicioJava.model.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface sucursalRepository extends JpaRepository <Sucursal, Long> {
}
