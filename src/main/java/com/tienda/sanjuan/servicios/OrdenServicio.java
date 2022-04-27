package com.tienda.sanjuan.servicios;

import java.util.List;
import com.tienda.sanjuan.entidades.Orden;
import com.tienda.sanjuan.entidades.Usuario;
import com.tienda.sanjuan.repositorios.OrdenRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenServicio {

    @Autowired
    private OrdenRepositorio ordenRepositorio;

    public Orden guardar(Orden orden) {
        return ordenRepositorio.save(orden);
    }

    public Orden buscarPorId(String id) {
        return ordenRepositorio.getById(id);
    }

    public List<Orden> buscarPorUsuario(Usuario usuario) {
        return ordenRepositorio.buscarPorUsuario(usuario);
    }
}
