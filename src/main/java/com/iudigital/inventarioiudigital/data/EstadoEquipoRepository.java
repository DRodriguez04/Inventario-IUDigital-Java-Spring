package com.iudigital.inventarioiudigital.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iudigital.inventarioiudigital.domain.EstadoEquipo;

@Repository
public interface EstadoEquipoRepository extends CrudRepository<EstadoEquipo, Integer> {
    
}
