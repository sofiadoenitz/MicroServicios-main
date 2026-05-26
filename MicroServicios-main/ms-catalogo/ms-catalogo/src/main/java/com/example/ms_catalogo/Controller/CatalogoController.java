package com.example.ms_catalogo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms_catalogo.Model.Catalogo;
import com.example.ms_catalogo.Service.CatalogoService;

@RestController
@RequestMapping("/api/v1/catalogo")
public class CatalogoController {

    @Autowired
    private CatalogoService serv;

    @GetMapping
    public List <Catalogo> listar(){
        return serv.listar();
    }

    @GetMapping("/{id}")
    public Catalogo buscarId(@PathVariable Long id){
        return serv.buscarId(id);
    }

    @PostMapping
    public Catalogo guardar(@RequestBody Catalogo catalogo){
        return serv.guardar(catalogo);
    }
    @GetMapping ("/categoria/{categoria}")
    public Catalogo buscarCategoria(@PathVariable String categoria){
        return serv.buscarCategoria(categoria);
    } 
    @GetMapping("/plataforma/{plataforma}")
    public Catalogo buscarPlataformas(@PathVariable String plataforma){
        return serv.buscarPlataformas(plataforma);
    }
}