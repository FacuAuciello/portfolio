package com.facundoauciello.portfolio.Controller;

import com.facundoauciello.portfolio.Model.Proyecto;
import com.facundoauciello.portfolio.Service.ProyectoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/proyectos/{idProyecto}")
    public ResponseEntity<Proyecto> obtenerProyecto(@PathVariable Long idProyecto) {

        Optional<Proyecto> proyecto = proyectoService.obtenerProyecto(idProyecto);

        if (proyecto.isPresent()) { //si tiene un valor adentro
            return new ResponseEntity<>(proyecto.get(), HttpStatus.OK);
        } else  {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
