package com.kapu.onpe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kapu.onpe.models.Distrito;

@Repository
public interface IDistrito extends JpaRepository<Distrito,Integer>{
    @Query(value = "{call sp_getDistritosByProvincia(:id)}", nativeQuery = true )
	List<Distrito> getDistritos(@Param("id")String id);
}