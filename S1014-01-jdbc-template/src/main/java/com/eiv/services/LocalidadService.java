package com.eiv.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eiv.dtos.LocalidadDto;
import com.eiv.entities.LocalidadEntity;
import com.eiv.entities.ProvinciaEntity;
import com.eiv.repositories.LocalidadRepository;
import com.eiv.repositories.ProvinciaRepository;

@Service
public class LocalidadService {

    @Autowired private LocalidadRepository localidadRepository;
    @Autowired private ProvinciaRepository provinciaRepository;

    @Transactional
    public LocalidadEntity nueva(LocalidadDto localidadNuevoDto) {
        
        Long id = localidadRepository.maxId().orElse(0L) + 1;
        String nombre = localidadNuevoDto.getNombre();
        ProvinciaEntity provincia = provinciaRepository
                .findById(localidadNuevoDto.getProvinciaId())
                .orElseThrow(() -> new RuntimeException(
                        String.format(
                                "El ID de Provincia %s no existe!", 
                                localidadNuevoDto.getProvinciaId())));
        
        LocalidadEntity localidadEntity = new LocalidadEntity(id, nombre, provincia);
        localidadRepository.save(localidadEntity);
        
        return localidadEntity;
    }
    
    public LocalidadEntity actualizar(Long id, LocalidadDto localidadNuevoDto) {
        return null;
    }
       
}
