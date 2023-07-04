
package main;

import entidades.Alumno;
import java.util.ArrayList;
import servicios.AlumnoServicios;


public class Main {
    public static void main(String[] args) {
        AlumnoServicios as = new AlumnoServicios();
        ArrayList<Alumno> alumnos = as.crearListaAlumnos;
        
        System.out.println(alumnos);
        
        System.out.println("El promedio del alumno es " + as.buscarAlumno(alumnos));
    }
}
