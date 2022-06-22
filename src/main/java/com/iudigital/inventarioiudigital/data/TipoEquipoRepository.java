package com.iudigital.inventarioiudigital.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iudigital.inventarioiudigital.domain.TipoEquipo;

@Repository
public interface TipoEquipoRepository extends CrudRepository<TipoEquipo, Integer> {
    
}
