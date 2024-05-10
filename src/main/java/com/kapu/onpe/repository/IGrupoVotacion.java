package com.kapu.onpe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kapu.onpe.models.GrupoVotacion;

@Repository
public interface IGrupoVotacion extends JpaRepository<GrupoVotacion,String>{
    @Query(value = "{call sp_getGruposVotacionByProvinciaDistritoLocal(:id, :id2, :id3)}", nativeQuery = true )
	List<GrupoVotacion> getGrupoVotacion(@Param("id")String id, @Param("id2")String id2, @Param("id3")String id3);
}