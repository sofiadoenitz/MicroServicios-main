package com.example.ms_notificacion.Controller;

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

import com.example.ms_notificacion.Model.Notificacion;
import com.example.ms_notificacion.Service.NotificacionService;

@RestController
@RequestMapping("/api/v1/notificaciones")
public class NotificacionController {
    @Autowired
    private NotificacionService service;

    @PostMapping
    public Notificacion enviarNotificacion(@RequestBody Notificacion notificacion) {
        return service.enviarNotificacion(notificacion);
    }

    @GetMapping
    public List<Notificacion> listarNotificaciones() {
        return service.listarNotificaciones();
    }

    @PutMapping("/leida/{leida}")
    public String marcarLeida(@PathVariable int id) {
        return service.marcarLeida(id);
    }

    @DeleteMapping("/{id}")
    public String eliminarNotificacion(@PathVariable Long id) {
        return service.eliminarNotificacion(id);
    }
    @GetMapping("/{id}")
    public Notificacion buscar(@PathVariable Long id){
        return service.buscarPorId(id);
}
}