package com.facundoauciello.portfolio.Service;

import com.facundoauciello.portfolio.Model.Proyecto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProyectoService {

    //crea y guarda la lista

    private List<Proyecto> listaProyectos = new ArrayList<>();

    public ProyectoService() {
        listaProyectos.add(new Proyecto(
                1L,
                "ConectarDocentes",
                "url imagen",
                "Plataforma para conectar instituciones con docentes mediante ofertas laborales y postulaciones (Plataforma Web)",
                List.of("JAVA" , "SPRINGBOOT")
        ));

        listaProyectos.add(new Proyecto(
                2L,
                "Gestion de Consultorio Odontologico",
                "url imagen",
                "Sistema para administrar pacientes, turnos y el seguimiento de los tratamientos realizados en un consultorio odontológico (Sistema interno Administrativo)",
                List.of("JAVA", "SPRINGBOOT")
        ));

        listaProyectos.add(new Proyecto(
                3L,
                "Gestion de Productos y Stock",
                "url imagen",
                "Sistema interno para administrar productos, controlar el stock disponible y registrar entradas y salidas de mercadería, facilitando la organización y el seguimiento del inventario del negocio (Sistema interno para Comercios)",
                List.of("JAVA", "SPRINGBOOT")
        ));

        listaProyectos.add(new Proyecto(
                4L,
                "Sistema que usa el negocio + sus clientes",
                "url imagen",
                "Aplicación web que permite a los clientes consultar horarios disponibles y reservar turnos, mientras el negocio administra su agenda, las reservas y el estado de cada turno",
                List.of("JAVA", "SPRINGBOOT")
                ));
    }


    //devuelve la lista de proyectos

    public List<Proyecto> obtenerProyectos() {
        return listaProyectos;
    }


}
