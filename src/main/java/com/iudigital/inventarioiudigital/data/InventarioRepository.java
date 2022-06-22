package com.iudigital.inventarioiudigital.data;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.iudigital.inventarioiudigital.domain.Inventario;

@Repository
public interface InventarioRepository extends PagingAndSortingRepository<Inventario, Integer> {
    
    List<Inventario> findAllByPrice(double price, Pageable pageable);

    static Optional<Inventario> findByPrice(Double precio) {
        return null;
    }
}
