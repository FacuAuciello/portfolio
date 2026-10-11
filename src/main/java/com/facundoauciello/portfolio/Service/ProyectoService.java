package com.facundoauciello.portfolio.Service;

import com.facundoauciello.portfolio.Model.Proyecto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProyectoService {

    private final List<Proyecto> listaProyectos = new ArrayList<>();

    public ProyectoService() {

        listaProyectos.add(new Proyecto(
                1L,
                "ConectarDocentes",
                List.of(
                        "/imagenes/conectar-docentes/1.png",
                        "/imagenes/conectar-docentes/2.png",
                        "/imagenes/conectar-docentes/3.png"
                ),
                "Plataforma para conectar instituciones con docentes mediante ofertas laborales y postulaciones.",
                List.of(
                        "JAVA",
                        "SPRING BOOT",
                        "MYSQL",
                        "REACT",
                        "TYPESCRIPT"
                )
        ));

        listaProyectos.add(new Proyecto(
                2L,
                "Gestion de Consultorio Odontologico",
                List.of(
                        "/imagenes/consultorio/1.png",
                        "/imagenes/consultorio/2.png",
                        "/imagenes/consultorio/3.png"
                ),
                "Sistema para administrar pacientes, turnos y el seguimiento de tratamientos realizados en un consultorio odontologico.",
                List.of(
                        "JAVA",
                        "SPRING BOOT",
                        "MYSQL"
                )
        ));

        listaProyectos.add(new Proyecto(
                3L,
                "Gestion de Productos y Stock",
                List.of(
                        "/imagenes/stock/1.png",
                        "/imagenes/stock/2.png",
                        "/imagenes/stock/3.png"
                ),
                "Sistema para administrar productos, controlar el stock disponible y registrar entradas y salidas de mercaderia.",
                List.of(
                        "JAVA",
                        "SPRING BOOT",
                        "MYSQL",
                        "REACT",
                        "TYPESCRIPT"
                )
        ));

        listaProyectos.add(new Proyecto(
                4L,
                "Sistema de Turnos y Reservas Online",
                List.of(
                        "/imagenes/turnos/1.png",
                        "/imagenes/turnos/2.png",
                        "/imagenes/turnos/3.png"
                ),
                "Aplicacion web que permite consultar horarios disponibles y reservar turnos, mientras el negocio administra su agenda y reservas.",
                List.of(
                        "JAVA",
                        "SPRING BOOT",
                        "MYSQL",
                        "REACT",
                        "TYPESCRIPT"
                )
        ));
    }

    public List<Proyecto> obtenerProyectos() {
        return listaProyectos;
    }

    public Optional<Proyecto> obtenerProyecto(Long id) {
        return listaProyectos.stream()
                .filter(proyecto -> proyecto.getIdProyecto().equals(id))
                .findFirst();
    }

}
