package com.kapu.cinestar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kapu.cinestar.models.Tarifas;

@Repository
public interface ITarifas extends JpaRepository<Tarifas,String>{
    @Query(value = "{call sp_getCineTarifas(:id)}", nativeQuery = true )
    List<Tarifas> getCineTarifas(@Param("id")String id);
} 