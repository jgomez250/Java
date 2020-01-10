// Jose Antonio Gómez Piñero -- 1ºDAM -- 6/01/2020
/*
 Leer por teclado dos series de 10 números enteros y mezclarlas en una tercera de
la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.
 */
package practica1ej5;

import java.util.Scanner;

public class Practica1ej5 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] lista1=new int [10]; // primera lista
        int[] lista2=new int [10]; // segunda lista
        int[] lista12=new int [20]; // lista del conjunto de ellas
        int j=0;
        int i;
        System.out.println("Dame 10 numeros");
        for (i=0;i<10;i++){
            lista1[i]=input.nextInt();
        }
        System.out.println("Dame otros 10 numeros");
        for (i=0;i<10;i++){
            lista2[i]=input.nextInt();
    }
        for (i=0;i<10;i++){
            lista12[j]=lista1[i]; // primera lista
            j++;
            lista12[j]=lista2[i]; // segunda lista
            j++;
        }
        System.out.println("El resultado es: ");
        for (i=0;i<20;i++){
            System.out.print(lista12[i]+" ");
        }
    
}
}