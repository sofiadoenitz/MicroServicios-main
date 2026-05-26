package com.example.ms_catalogo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ms_catalogo.Model.Catalogo;
import com.example.ms_catalogo.Repository.CatalogoRepository;

@Service
public class CatalogoService {
    @Autowired
    private CatalogoRepository repo;

    public List <Catalogo> listar(){
        return repo.findAll();
    }

    public Catalogo buscarId(Long id){
        return repo.findById(id).orElse(null);
    }

    public Catalogo guardar (Catalogo catalogo){
        return repo.save(catalogo);
    }

    public Catalogo buscarCategoria(String categoria){
        return repo.findByCategoria(categoria);
    }

    public Catalogo buscarPlataformas(String plataforma){
        return repo.findByPlataforma(plataforma);
    }
    
}