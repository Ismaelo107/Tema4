package Actividad5.Ejercicio2;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        Asignatura matematica = new Asignatura(1,"mates","10-febrero2000");
        Asignatura fisica = new Asignatura(2,"fisica","10-febrero2000");
        Asignatura quimica = new Asignatura(3,"quimica","10-febrero2000");
        Asignatura lengua = new Asignatura(4,"lengua","10-febrero2000");
        Asignatura tic = new Asignatura(5,"tic","10-febrero2000");

        Set<Asignatura> asignaturas = new HashSet<Asignatura>();
            asignaturas.add(matematica);
            asignaturas.add(fisica);
            asignaturas.add(quimica);
            asignaturas.add(lengua);
            asignaturas.add(tic);

        for (Asignatura materias :
                asignaturas) {
            System.out.println(materias);
        }

    }
}
