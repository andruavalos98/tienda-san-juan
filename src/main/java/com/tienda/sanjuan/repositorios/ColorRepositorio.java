/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.sanjuan.repositorios;

import com.tienda.sanjuan.entidades.Color;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Equipo6
 */
public interface ColorRepositorio extends JpaRepository<Color, String> {
    
}
