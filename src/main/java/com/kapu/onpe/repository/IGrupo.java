package com.kapu.onpe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kapu.onpe.models.Acta;

@Repository
public interface IGrupo extends JpaRepository<Acta,String>{
    @Query(value = "{call sp_getGrupoVotacionByProvinciaDistritoLocalGrupo(:id, :id2, :id3, :id4, :id5)}", nativeQuery = true )
	List<Acta> getGrupo(@Param("id")String id,@Param("id2")String id2, @Param("id3")String id3, @Param("id4")String id4, @Param("id5")String id5);
}