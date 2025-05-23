

package menuagencia;

import java.util.Objects;


public abstract class Nave implements Comparable<Nave>{
    private String nombre;
    private int capacidad;
    private int anioLanzamiento;

    public Nave(String nombre, int capacidad, int anioLanzamiento) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    @Override
    public String toString() {
        return   "nombre=" + nombre + ", capacidad=" + capacidad + ", anioLanzamiento=" + anioLanzamiento + " ";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + this.anioLanzamiento;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nave other = (Nave) obj;
        return Objects.equals(this.nombre, other.nombre) && Objects.equals(this.anioLanzamiento, other.anioLanzamiento);
    }
    
    @Override
    public int compareTo(Nave n) {/*modifico el compareTo en publicacion para que pueda ordenar las publicaciones por año*/
        if (this.anioLanzamiento < n.getAnioLanzamiento()) {
            return 1;
        } else if (this.anioLanzamiento == n.getAnioLanzamiento()) {
            return 0;
        } else {
            return -1;
        }
    } /*Si llegasen a tener el mismo año el sistema lo ordenaria automaticamente por capacidad*/

    public int compareTo(String anotherString) {
        return nombre.compareTo(anotherString);
    }
    
    
    


    }
