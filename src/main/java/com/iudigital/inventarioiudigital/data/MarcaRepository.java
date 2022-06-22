package com.iudigital.inventarioiudigital.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iudigital.inventarioiudigital.domain.Marca;

@Repository
public interface MarcaRepository extends CrudRepository<Marca, Integer> {
    
}
