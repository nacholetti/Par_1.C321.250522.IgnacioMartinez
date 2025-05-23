
package menuagencia;

public class Carguero extends Nave implements Explorable  {
    private int capacidadCarga;
    private static final int CARGAMIN =100;
    private static final int CARGAMAX = 500;

    public Carguero(int capacidadCarga, String nombre, int capacidad, int anioLanzamiento) {
        super(nombre, capacidad, anioLanzamiento);
        if(capacidadCarga<100 || capacidadCarga>500){
            System.out.println("La capacidad de carga es poca o excede el limite");
        }
        this.capacidadCarga = capacidadCarga;
    }

        
    @Override
    public void iniciarExploracion() {
        System.out.println("Carguero explorando...");
    }

    @Override
    public String toString() {
        return "Carguero"+ super.toString() + "capacidadCarga = " + capacidadCarga ;
    }

   
    
    
    
}
