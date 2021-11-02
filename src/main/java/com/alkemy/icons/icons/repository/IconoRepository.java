package com.alkemy.icons.icons.repository;

import com.alkemy.icons.icons.entidades.IconoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IconoRepository extends JpaRepository<IconoEntity, Long>, JpaSpecificationExecutor<IconoEntity> {

    //List<IconoEntity> findall(specification<IconoEntity> spec);
}
