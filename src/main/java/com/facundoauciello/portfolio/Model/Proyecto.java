package com.facundoauciello.portfolio.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Proyecto {

    private Long idProyecto;
    private String nombre;
    private String fotoUrl;
    private String descripcion;
    private List tecnologias;

}
