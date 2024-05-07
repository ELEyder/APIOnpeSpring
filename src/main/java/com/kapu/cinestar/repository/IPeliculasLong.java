package com.kapu.cinestar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kapu.cinestar.models.PeliculaLong;

@Repository
public interface IPeliculasLong extends JpaRepository<PeliculaLong,Integer>{
    @Query(value = "{call sp_getPelicula(:id)}", nativeQuery = true )
    List<PeliculaLong> getPelicula(@Param("id")String id);
} 