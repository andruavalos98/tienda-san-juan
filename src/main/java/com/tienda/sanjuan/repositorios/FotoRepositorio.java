package com.tienda.sanjuan.repositorios;

import com.tienda.sanjuan.entidades.Foto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FotoRepositorio extends JpaRepository<Foto, String>{
    
}
