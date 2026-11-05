package com.example.EjercicioJava.repository;

import com.example.EjercicioJava.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ventaRepository extends JpaRepository<Venta, Long> {
}
