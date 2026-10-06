package com.facundoauciello.portfolio.Controller;

import com.facundoauciello.portfolio.Model.Proyecto;
import com.facundoauciello.portfolio.Service.ProyectoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProyectoController {

    private final ProyectoService proyectoService;

    public ProyectoController(ProyectoService proyectoService) {
        this.proyectoService = proyectoService;
    }

    @GetMapping("/proyectos")
    public List<Proyecto> obtenerProyectos() {
        return proyectoService.obtenerProyectos();
    }
}
