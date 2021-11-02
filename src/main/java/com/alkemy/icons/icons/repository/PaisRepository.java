package com.alkemy.icons.icons.repository;

import com.alkemy.icons.icons.entidades.PaisEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaisRepository extends JpaRepository<PaisEntity, Long> {

    List<PaisEntity> findAll();

    PaisEntity save(PaisEntity entity);
}
