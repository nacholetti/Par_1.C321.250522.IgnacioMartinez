
package menuagencia;


public class Crucero extends Nave  {
    
    private int cantidadPasajeros;

    public Crucero(int cantidadPasajeros, String nombre, int capacidad, int anioLanzamiento) {
        super(nombre, capacidad, anioLanzamiento);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String toString() {
        return "Crucero "+ " " + super.toString() +"cantidadPasajeros=" + cantidadPasajeros ;
    }

    
    
   

    
    
    
}
