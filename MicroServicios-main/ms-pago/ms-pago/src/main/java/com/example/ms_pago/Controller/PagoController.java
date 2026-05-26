package com.example.ms_pago.Controller;

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

import com.example.ms_pago.Model.Pago;
import com.example.ms_pago.Service.PagoService;

@RestController
@RequestMapping("/api/v1/pago")
public class PagoController {
    @Autowired
    private PagoService serv;
    
    @PostMapping
    public List<Pago> listar(){
        return serv.listarPago();
    }
    @PutMapping("/{id}")
    public Pago actualizar(@PathVariable Long id, @RequestBody Pago pago){
        return serv.actualizarPago(pago);
    }
     @GetMapping("/metodo/{metodo}")
    public List<Pago> metodo(@PathVariable String metodo){
        return serv.metodoPago(metodo);
    }
     @GetMapping("/completo/{id}")
    public Map<String, Object> completo(@PathVariable Long id){
        return serv.obtenerPagoCompleto(id);
    }


}
