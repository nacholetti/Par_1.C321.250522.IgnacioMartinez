
package menuagencia;

import java.util.Scanner;

public class MenuAgencia {

    
    public static void main(String[] args) {
        Agencia agencia1 = new Agencia();
        NaveExploracion exploradora = new NaveExploracion(Mision.CONTACTO, "Andromeda", 4000, 2005);
        Crucero crucero1 = new Crucero(1000, "CostaGalana", 1000, 2005);
        agencia1.agregarNave(exploradora);
        agencia1.agregarNave(crucero1);
        agencia1.mostrarNaves();
       
        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Menu opciones");
            System.out.println("1.Agregar nave");
            System.out.println("2.Mostrar todas las naves");
            System.out.println("3.Iniciar exploracion");
            System.out.println("4.Mostrar naves ordenadas por nombre");
            System.out.println("5.Mostrar naves ordenadas por año de lanzamiento");
            System.out.println("6.Mostrar naves ordenadas por tripulacion");
            System.out.println("0.Salir");
            System.out.println("Ingrese la opcion que desea");

            opcion = sc.nextInt();
            Mision mision = null;
            switch (opcion) {
                case 1:/*Perdon por toda esta parte del menu la pense sobre la marcha podria haberlo realizado mucho mejor*/
                    sc.nextLine();
                    System.out.println("Ingrese el tipo de nave que desee");
                    String nave = sc.nextLine();
                    if(nave.contains("NaveExploracion")){
                        System.out.println("Ingrese el numero para elegir la mision de la nave de exploracion 1.CARTOGRAFIA 2.INVESTIGACION 3.CONTACTO");
                        int numeroMision = sc.nextInt();
                        if(numeroMision==1){
                            mision = Mision.CARTOGRAFIA;
                        }else if(numeroMision==2){
                            mision = Mision.INVESTIGACION;
                        }
                        else{
                            mision = Mision.CONTACTO;
                        }
                        sc.nextLine();
                         System.out.println("Ingrese el nombre de la nave");
                         String nombre = sc.nextLine();
                         System.out.println("Ingrese la capacidad de la nave");
                         int capacidad = sc.nextInt();
                         System.out.println("Ingrese el año de lanzamiento");
                         int anio = sc.nextInt();
                    
                         NaveExploracion exploradora2 = new NaveExploracion(mision, nombre, capacidad, anio);
                         agencia1.agregarNave(exploradora2);
                         break;
                        
                    }else{
                        System.out.println("No es una nave de exploracion");
                    }
                    if(nave.contains("Carguero")){
                        System.out.println("Ingrese la capacidad de carga del carguero");
                        int capacidadCarga = sc.nextInt();
                        if(capacidadCarga<100 || capacidadCarga>500){
                            System.out.println("La capacidad de carga es poca o excede el limite");
                            break;
                         }
                         sc.nextLine();
                         System.out.println("Ingrese el nombre de la nave");
                         String nombre = sc.nextLine();
                         System.out.println("Ingrese la capacidad de la nave");
                         int capacidad = sc.nextInt();
                         System.out.println("Ingrese el año de lanzamiento");
                         int anio = sc.nextInt();
                         Carguero carguero2 = new Carguero(capacidadCarga, nombre, capacidad, anio);
                         agencia1.agregarNave(carguero2);
                         break;
                        
                    }
                    if(nave.contains("Crucero")){
                        System.out.println("Ingrese la cantida de pasajeros");
                        int cantidadPasajeros = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Ingrese el nombre de la nave");
                         String nombre = sc.nextLine();
                         System.out.println("Ingrese la capacidad de la nave");
                         int capacidad = sc.nextInt();
                         System.out.println("Ingrese el año de lanzamiento");
                         int anio = sc.nextInt();
                         Crucero crucero2 = new Crucero(cantidadPasajeros, nombre, capacidad, anio);
                         agencia1.agregarNave(crucero2);
                         break;
                    }
                    break;
                    
                case 2:
                    agencia1.mostrarNaves();
                    
                    
                    break;
                case 3:
                    agencia1.exploracion();
                    break;
                case 4:
                   agencia1.ordenarPorNombre();
                    break;
                case 5:
                    agencia1.ordenarPorAnio();
                    
                    break;
                case 6:
                    agencia1.ordenarPorAnio();
                    
                    break;

                case 0:
                    System.out.println("Saliendo del menu");

                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 0);
        sc.close();

    }
    }
    

