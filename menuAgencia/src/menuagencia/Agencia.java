package menuagencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agencia {

    private List<Nave> naves = new ArrayList<>();

    public void mostrarNaves() {
        for (Nave n : naves) {
            System.out.println(n);

        }
    }

    public void agregarNave(Nave nave) {
        for (Nave n : naves) {
            if (n.equals(nave)) {
                System.out.println("Esta nave ya existe en el sistema");
                return;
            }
        }
        naves.add(nave);
        System.out.println("Nave agregada con exito");

    }

    public void exploracion() {
        for (Nave n : naves) {
            if (n instanceof Explorable) {
                ((Explorable) n).iniciarExploracion();
            } else {
                System.out.println("La nave '" + n.getNombre() + "' no puede iniciar exploracion, es un crucero.");
            }
        }
    }

    public void ordenarPorAnio() {
        /*uso collections para ordenar las publicaciones por año creando un metodo nuevo en la biblioteca*/
        if (naves.isEmpty()) {
            System.out.println("No hay naves.");
            return;
        }

        Collections.sort(naves);
        System.out.println("Publicaciones ordenadas por año:");
        mostrarNaves(); // <-- Mostrarlas después de ordenar
    }
    
    public void ordenarPorNombre(){
        Collections.sort(naves);
        System.out.println("Publicaciones ordenadas por letra:");
        mostrarNaves(); // <-- Mostrarlas después de ordenar
    }

}
