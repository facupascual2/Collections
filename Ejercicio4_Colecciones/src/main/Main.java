
package main;

import entidades.Pelicula;
import java.util.ArrayList;
import servicios.PeliculaService;

public class Main {

    public static void main(String[] args) {

        PeliculaService ps = new PeliculaService();
        ArrayList<Pelicula> pelis = ps.crearPelicula();

        ps.mostrarTodas(pelis);
        
        ps.mostrarMayorUnaH(pelis);
        
        ps.ordenarMayorDuracion(pelis);
        
        ps.ordenarMenorDuracion(pelis);
        
        ps.ordenarTitulo(pelis);
        
        ps.ordenarDirector(pelis);
    }
}
