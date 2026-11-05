package com.example.EjercicioJava.repository;

import com.example.EjercicioJava.model.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface articuloRepository extends JpaRepository<Articulo, Long> {
}
