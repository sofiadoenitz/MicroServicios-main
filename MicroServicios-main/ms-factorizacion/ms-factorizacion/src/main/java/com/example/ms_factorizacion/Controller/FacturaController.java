package com.example.ms_factorizacion.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms_factorizacion.Model.Factura;
import com.example.ms_factorizacion.Service.FacturaService;

@RestController
@RequestMapping("/api/v1/factura")
public class FacturaController {
    @Autowired
    private FacturaService serv;

    // Listar
    @GetMapping
    public List<Factura> listar(){
        return serv.listarFactura();
    }

    //Guardar
    @PostMapping
    public Factura guardar(@RequestBody Factura fac){
        return serv.guardarFactura(fac);
    }

    //Actualizar
    @PutMapping("/{id}")
    public Factura actualizar(@PathVariable Long id, @RequestBody Factura fac){
        return serv.actualizarFactura(fac);
    }

    //Metodo pago
    @GetMapping("/metodo/{metodo}")
    public List<Factura> metodo(@PathVariable String metodo){
        return serv.metodoPago(metodo);
    }

    //Conexion
    @GetMapping("/completa/{id}")
    public Map<String, Object> completa(@PathVariable Long id){
        return serv.obtenerFacturaCompleta(id);
    }

}
