package com.kapu.cinestar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kapu.cinestar.models.PeliculaCine;

@Repository
public interface IPeliculaCine extends JpaRepository<PeliculaCine,String>{
    @Query(value = "{call sp_getCinePeliculas(:id)}", nativeQuery = true )
    List<PeliculaCine> getCinePeliculas(@Param("id")String id);
} 