package com.kapu.onpe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kapu.onpe.models.Departamento;

@Repository
public interface IDepartamento extends JpaRepository<Departamento,Integer>{
    @Query(value = "{call sp_getDepartamentos(:id, :id2)}", nativeQuery = true )
	List<Departamento> getDepartamentos(@Param("id")String id, @Param("id2")String id2);
}