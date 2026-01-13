package controllers;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import models.Maquina;

public class MaquinasController {
    
    //Metodo que ordene un listado de maquinas
    //Por su subred y luego por el nombre
    //si ambas son iguales se consideren
    //y se descarten

    public Set<Maquina> ordenarPorSubred(List<Maquina> maquinas){
        Set<Maquina> maquinas0 = new TreeSet<>();
        for (Maquina maquina : maquinas0) {
            maquinas0.add(maquina);
        }
        return maquinas0;
    }
}
