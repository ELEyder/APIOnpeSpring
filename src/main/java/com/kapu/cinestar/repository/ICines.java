package com.kapu.cinestar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kapu.cinestar.models.Cine;

@Repository
public interface ICines extends JpaRepository<Cine,Integer>{
    @Query(value = "{call sp_getCines()}", nativeQuery = true )
	List<Cine> getCines();

    @Query(value = "{call sp_getCine(:id)}", nativeQuery = true )
	List<Cine> getCine(@Param("id")String id);
}
