
package menuagencia;

public class NaveExploracion extends Nave implements Explorable {
    
    private Mision mision;

    public NaveExploracion(Mision mision, String nombre, int capacidad, int anioLanzamiento) {
        super(nombre, capacidad, anioLanzamiento);
        this.mision = mision;
    }

    @Override
    public void iniciarExploracion() {
        System.out.println("Nave de exploracion explorando....");
    }

    @Override
    public String toString() {
        return "NaveExploracion" + super.toString()+ "mision=" + mision ;
    }

    public Mision getMision() {
        return mision;
    }

    public void setMision(Mision mision) {
        this.mision = mision;
    }
    
    
    
    
}
