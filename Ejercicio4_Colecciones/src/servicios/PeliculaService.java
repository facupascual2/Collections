    /*Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.*/
package servicios;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class PeliculaService {


    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Pelicula> crearPelicula() {
        ArrayList<Pelicula> peliculas = new ArrayList();
        boolean salir = true;

        do {
            Pelicula pelicula = new Pelicula();
            System.out.println("Ingrese el Título de la Película: ");
            pelicula.setTitulo(leer.next());
            System.out.println("Ingrese el Director de la Película:");
            pelicula.setDirector(leer.next());
            System.out.println("Ingrese la Duración de la Película: ");
            pelicula.setDuración(leer.nextDouble());
            peliculas.add(pelicula);

            System.out.println("Desea ingresar una nueva película?(S/N): ");
            if (leer.next().equalsIgnoreCase("N")) {
                salir = false;
            }
        } while (salir);
        return peliculas;
    }

    
    public void mostrarTodas(ArrayList<Pelicula> pelis) {
        System.out.println("-------------------------");
        System.out.println(pelis);
        System.out.println("-------------------------");
    }

    public void mostrarMayorUnaH(ArrayList<Pelicula> pelis) {
        ArrayList<String> mayorH = new ArrayList();
        for (Pelicula pelicula : pelis) {
            if (pelicula.getDuración() > 1) {
                mayorH.add(pelicula.getTitulo());
            }
        }
        System.out.println("-------------------------");
        System.out.println("Las películas con una duración mayor a una hora son: " + mayorH);
        System.out.println("-------------------------");
    }

   
    public void ordenarMayorDuracion(ArrayList<Pelicula> pelis) {
        pelis.sort(Pelicula.compararDuracion);
        Collections.reverse(pelis);
        System.out.println("-------------------------");
        System.out.println("Peliculas ordenadas de mayor a menor duración: ");
        mostrarTodas(pelis);
        System.out.println("-------------------------");
    }

 
    public void ordenarMenorDuracion(ArrayList<Pelicula> pelis) {
        pelis.sort(Pelicula.compararDuracion);
        System.out.println("-------------------------");
        System.out.println("Peliculas ordenadas de menor a mayor duración: ");
        mostrarTodas(pelis);
        System.out.println("-------------------------");
    }


    public void ordenarTitulo(ArrayList<Pelicula> pelis) {
        pelis.sort(Pelicula.compararTitulo);
        System.out.println("-------------------------");
        System.out.println("Peliculas ordenadas alfabéticamente por Título son: ");
        mostrarTodas(pelis);
        System.out.println("-------------------------");
    }

   
    public void ordenarDirector(ArrayList<Pelicula> pelis) {
        pelis.sort(Pelicula.compararDirector);
        System.out.println("-------------------------");
        System.out.println("Peliculas ordenadas alfabéticamente por Director son: ");
        mostrarTodas(pelis);
        System.out.println("-------------------------");
    }
}
