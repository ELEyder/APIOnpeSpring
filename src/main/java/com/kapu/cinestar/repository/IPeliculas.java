package com.kapu.cinestar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kapu.cinestar.models.Pelicula;

@Repository
public interface IPeliculas extends JpaRepository<Pelicula,Integer>{
    @Query(value = "{call sp_getPeliculas(:id)}", nativeQuery = true )
    List<Pelicula> getPeliculas(@Param("id")String id);
} 