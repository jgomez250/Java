// Jose Antonio Gómez Piñero -- 1ºDAM -- 29/01/2020
/*
Escribe una clase Cuenta para representar una cuenta bancaria.

1-Debe permitir pasar dinero de una cuenta a otra siempre que en la cuenta de 
origen haya dinero suficiente para poder hacerla.

2-Clase main. Desarrolla otra clase que tenga el main, y ponga a prueba todos 
los métodos de la clase Cuenta mediante un menú de usuario que se ejecutará 
indefinidamente hasta que este quiera salir.
 */
package practica3;

import java.util.Scanner;

public class Practica3 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) { // con try scanner fuera del main hay que tener cuidado o puede dar error que no encuentra
            // el dato por el hecho de cerrarlo en otra clase, metodo.
            Cuenta c1 = new Cuenta();
            //Cuenta c2 = new Cuenta(); esto deberia ir en transferencia
            c1.solicitarDatos();
            //c2.solicitarDatos(); esto deberia ir en transferencia

            // Menu
            byte opcion;
            do {
                System.out.println("\n1.- Ingresar dinero a tu cuenta bancaria");
                System.out.println("2.- Sacar dinero de tu cuenta bancaria");
                System.out.println("3.- Transferencia de dinero hacia otra cuenta");
                System.out.println("\n 0.-Salir.");
                opcion = input.nextByte();
                switch (opcion) {
                    case 1:
                        c1.realizarIngreso();
                        if (c1.isValidacion() == true) {
                            System.out.println("La operacion ha sido completada correctamente"
                                    + ".El saldo de su cuenta es: " + c1.getSaldo());
                        } else {
                            System.out.println("La operacion ha sido cancelada."
                                    + "No se puede ingresar un valor mas bajo a 0");
                        }
                        break;
                    case 2:
                        c1.realizarReintegro();
                        if (c1.isValidacion() == true) {
                            System.out.println("La operacion ha sido completada correctamente"
                                    + ".El saldo de su cuenta es: " + c1.getSaldo());
                        } else {
                            System.out.println("La operacion ha sido cancelada."
                                    + "No se puede retirar un valor mas alto a tu saldo.");
                        }
                        break;
                    case 3:
                        Cuenta c2 = new Cuenta();
                        c2.solicitarDatos2();
                        System.out.println("Cuanto quieres transferir?");
                        double importe = input.nextDouble();
                        c1.transferirDinero(c2, importe);
                        break;
                    default: // si el valor no esta dentro del menu, salta a este apartado
                        System.out.println("Introduce un numero dentro de las possibilidades");
                }
            } while (opcion <= 0 || opcion > 3);

        }
    }
}
