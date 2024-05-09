package com.kapu.onpe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kapu.onpe.models.Provincia;

@Repository
public interface IProvincia extends JpaRepository<Provincia,Integer>{
    @Query(value = "{call sp_getProvinciasByDepartamento(:id)}", nativeQuery = true )
	List<Provincia> getProvincias(@Param("id")String id);
}