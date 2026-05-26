package com.example.ms_descuento.Controller;

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

import com.example.ms_descuento.Model.Descuento;
import com.example.ms_descuento.Service.DescuentoService;

@RestController
@RequestMapping("/api/v1/descuentos")
public class DescuentoController {
    @Autowired
    private DescuentoService serv;

    @GetMapping
    public List <Descuento>listar(){
        return serv.listar();
    }
    @PostMapping
    public Descuento agregargarDescuento (@RequestBody Descuento descuento){
        return serv.agregarDescuento(descuento);
    }
    @PutMapping("/{id}")
    public Descuento actualizar(@PathVariable Long id, @RequestBody Descuento descuento){
        return serv.actualizar(descuento);
    }
    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id){
        return serv.eliminar(id);
    }
    @GetMapping("/{id}}")
    public Descuento buscar(@PathVariable Long id){
        return serv.buscarporId(id);
    }
}