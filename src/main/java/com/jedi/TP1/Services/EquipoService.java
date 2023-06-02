package com.jedi.TP1.Services;

import com.jedi.TP1.models.Equipo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EquipoService {

    private List<Equipo> listaEquipo;



    public EquipoService(){
        this.listaEquipo= new ArrayList<>();
    }


    public void agregarAlumno(Equipo equipo){
        //comprobar si es el unico en la lista
        if (listaEquipo.contains(equipo)){
            System.out.println("Este equipo ya se encuentra en la lista");
        } else {
            listaEquipo.add(equipo);
        }
    }

    public void listarEquipos(){
        for (Equipo equipo:listaEquipo) {
            System.out.println(equipo.getNombre());
            System.out.println(equipo.getFechaCreacion());
        }
    }

}