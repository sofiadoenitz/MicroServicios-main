package com.example.ms_amigos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms_amigos.Model.Amigos;
import com.example.ms_amigos.Service.AmigosService;

@RestController
@RequestMapping("/api/v1/amigos")
public class AmigosController {

    @Autowired
    private AmigosService serv;

    @GetMapping
    public List<Amigos>listar(){
        return serv.listar();
    }

    @PostMapping
    public Amigos guardar(@RequestBody Amigos amigos){
        return serv.agregar(amigos);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id){
        return serv.eliminar(id);
    }
    @GetMapping("/estado/{estado}")
    public List <Amigos>buscarEstado(@PathVariable String estado){
        return serv.buscarEstado(estado);
    }
    @PutMapping("/{id}")
    public Amigos actualizar(@PathVariable Long id, @RequestBody Amigos amigo) {
    return serv.actualizar(id, amigo);
}
    @GetMapping("/{id}")
    public Amigos buscar(@PathVariable Long id){
        return serv.buscarPorId(id);
}
}
