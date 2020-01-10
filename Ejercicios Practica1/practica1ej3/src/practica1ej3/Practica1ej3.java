// Jose Antonio Gómez Piñero -- 1ºDAM -- 21/12/2019
/*
3. Leer 5 números por teclado y a continuación realizar la media de los números
positivos, la media de los negativos y contar el número de ceros.
 */
package practica1ej3;

import java.util.Scanner;

public class Practica1ej3 {

    public static void main(String[] args) {
        int suma=0;
        int negativos=0;
        short contador=0;
        Scanner input=new Scanner(System.in);
        for (int i=0; i<5; i++){ // recorremos y hacemos que nos agregue al array lo que dijita
            System.out.println("Dame un número");
            short numero=input.nextShort(); // resultado del input
            System.out.print("\n"); // salto de linea
            suma+=numero; //variable que nos sumara los inputs
            negativos+=(-numero);
            if (numero%10==0){
                contador+=1;
            }
        }
        System.out.println(suma/5); //media de los numeros
        System.out.println(negativos/5); //media negativa, tambien -(suma/5)y no haria falta la var negativos
        System.out.println(contador); //contador de 0s
    }
    }
