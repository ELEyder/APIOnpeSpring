package com.kapu.onpe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kapu.onpe.models.LocalVotacion;

@Repository
public interface ILocalVotacion extends JpaRepository<LocalVotacion,Integer>{
    @Query(value = "{call sp_getLocalesVotacionByDistrito(:id, :id2)}", nativeQuery = true )
	List<LocalVotacion> getLocalVotacion(@Param("id")String id,@Param("id2")String id2);
}