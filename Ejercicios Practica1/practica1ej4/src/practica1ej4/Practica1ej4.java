// Jose Antonio Gómez Piñero -- 1ºDAM -- 21/12/2019
/*
Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el
último, el segundo, el penúltimo, el tercero, etc.
 */
package practica1ej4;

import java.util.Scanner;

public class Practica1ej4 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] lista=new int [10];
        System.out.println("Dame 10 numeros enteros\n");
        for(int i=0; i<10; i++){
            System.out.println("\nDame un numero entero");
            lista[i]= input.nextInt(); // no hace falta una variable nueva
        }
        System.out.print("El resultado es: ");
        for (int j=0; j<5; j++){ //recorre la lista dos veces
            System.out.print(lista[j]+" "); // por delante
            System.out.print(lista[9-j]+" "); //por detras
        }
    }
    
}
