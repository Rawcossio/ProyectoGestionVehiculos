package GestionVehicular;

import java.util.Scanner;

//una empresa de transporte que maneja una flota de vehículos.
// Necesitas crear un sistema que permita gestionar esta flota de vehículos.
// El programa debe ofrecer las siguientes opciones:
//Registrar un nuevo vehículo.
//Mostrar todos los vehículos registrados.
//Buscar un vehículo por su número de placa.
//Eliminar un vehículo por su número de placa.
//Salir del programa.
//Se debe hacer uso de funciones para cada opción.

public class Vehiculos {
        static Scanner sc = new Scanner(System.in);

        static String[] nuevovehiculo = new String[2];
        static String[] numeroplaca = new String[2];
        static String inputplaca;
        static String inputvehiculo;

        public static void main(String[] args) {

            int iniciar = 1;

            while (iniciar != 0) {

                System.out.println("Gestión de vehiculos:Seleccione una opcion" +
                        '\n' + "1.Registrar un nuevo vehículo" +
                        '\n' + "2.Mostrar todos los vehículos registrados" +
                        '\n' + "3.Buscar un vehículo por su número de placa" +
                        '\n' + "4.Salir");

                int opcion = sc.nextInt();

                switch (opcion) {

                    case 1:
                        registrovehiculo(nuevovehiculo,numeroplaca);
                        System.out.println("vehiculo registrado con exito");
                        break;
                    case 2:
                        mostrarvehiculos(nuevovehiculo,numeroplaca);
                        break;
                    case 3:
                        buscarplaca(numeroplaca);
                        break;
                    case 4:
                        iniciar=0;
                        break;
                    default:
                        System.out.println("Escoja una opcion valida");

                }
            }
        }

        public static void registrovehiculo(String[] nuevovehiculo, String[] numeroplaca) {

            for (int i=0;i<nuevovehiculo.length;i++){
                System.out.println("ingrese el tipo de vehiculo a registrar");
                nuevovehiculo[i]=sc.next();
                System.out.println("ingrese la placa del vehiculo");
                numeroplaca[i]= sc.next();
            }
        }
        public static void mostrarvehiculos(String[] nuevovehiculo, String[] numeroplaca){
            System.out.println("los vehiculos registrados son: ");
            for(int i=0;i<nuevovehiculo.length;i++){
                System.out.println((i+1)+":"+nuevovehiculo[i]+" con placa: "+numeroplaca[i]);
            }
        }
        public static void buscarplaca(String[] numeroplaca){

            for (int i=0;i<nuevovehiculo.length;i++){
                System.out.println("ingrese el numero de placa a buscar: ");
                inputplaca=sc.next();
                if(numeroplaca[i].equals(inputplaca)){
                    System.out.println("placa encontrada:"+numeroplaca[i]);
                }else{
                    System.out.println("ingrese un numero de placa valido");
                }
            }
        }
}
