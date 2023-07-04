
package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> razaPerros = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean salir = false;
        do {
            System.out.println("Ingrese la raza de perro a agregar: ");
            String raza = leer.next();
            razaPerros.add(raza);
            System.out.println("Agrega otro perro S/N?");
            if (leer.next().equalsIgnoreCase("N")) {
                salir = true;
            }
        } while (salir==false);
        System.out.println("Las Razas que fueron ingresadas: " +razaPerros);
    }
}
