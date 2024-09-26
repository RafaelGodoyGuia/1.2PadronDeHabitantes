package comprobaciones;

import dominio.*;
import java.util.ArrayList;

public class Comprobacion
{
    public static void realizarComprobacion(){
        OficinaPadron padron = new OficinaPadron();
        ArrayList<Habitantes> habitantes = padron.getHabitantesPadron();
        for(Habitantes habitante : habitantes){
            System.out.println(habitante.getNombre() + " " + habitante.getApellido1() + " " + habitante.getApellido2());
        }
        System.out.println("El número total de habitantes es " + padron.calcularNumeroHabitantes());
    }
}