package com.example.ms_mod.Controller;

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

import com.example.ms_mod.Model.Mod;
import com.example.ms_mod.Service.ModService;

@RestController
@RequestMapping("/api/v1/mods")
public class ModController {

    @Autowired
    private ModService serv;

    @GetMapping
    public List<Mod> listar() {
        return serv.listar();
    }

    @PostMapping
    public Mod subir(@RequestBody Mod mod) {
        return serv.subir(mod);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        return serv.eliminar(id);
    }

    @PutMapping("/aprobado/{aprobado}")
    public Mod aprobado(@PathVariable Long id) {
        return serv.aprobado(id);
    }

    @GetMapping("/{id}")
    public Mod buscar(@PathVariable Long id) {
        return serv.buscarporId(id);
    }

}
