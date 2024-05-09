package com.kapu.onpe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kapu.onpe.models.Acta;

@Repository
public interface IActa extends JpaRepository<Acta,String>{
    @Query(value = "{call sp_getGrupoVotacion(:id)}", nativeQuery = true )
	List<Acta> getActaNum(@Param("id")String id);
}