// Jose Antonio Gómez Piñero -- 1ºDAM -- 18/12/2019
/*
2. Leer 5 números y mostrarlos en orden inverso al introducido.
*/
package practica1ej2;

import java.util.Scanner;

public class Practica1ej2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // clase para que el usuario nos de inputs
        short[] lista=new short [5]; //array de 5 elementos( 1 dimension )
        for (int i=0; i<5; i++){ // recorremos y hacemos que nos agregue al array lo que dijita
            System.out.println("Dame un número");
            short numero=input.nextShort(); // resultado del input
            System.out.print("\n"); // salto de linea
            lista[i]= numero; //agregamos el input del usuario
        }
        for (int j=4; j>-1; j--){ //recorre la lista al reves
            System.out.print(lista[j]+" ");
            
        }
    }
}
