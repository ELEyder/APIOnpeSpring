package com.kapu.onpe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kapu.onpe.models.Participacion;

@Repository
public interface IParticipacion extends JpaRepository<Participacion,String>{
    @Query(value = "{call sp_getVotos(:id, :id2)}", nativeQuery = true )
	List<Participacion> getParticipacion(@Param("id")String id, @Param("id2")String id2);

    @Query(value = "{call sp_getVotosDepartamento(:id)}", nativeQuery = true )
	List<Participacion> getParticipacionDepartamento(@Param("id")String id);
    
    @Query(value = "{call sp_getVotosProvincia(:id)}", nativeQuery = true )
	List<Participacion> getVotosProvincia(@Param("id")String id);
}