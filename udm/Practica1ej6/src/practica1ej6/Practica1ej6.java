// Jose Antonio Gómez Piñero -- 1ºDAM -- 6/01/2020
/*
 Leer los datos correspondientes a dos series de 12 elementos numéricos, y
mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3
de la B, etc.
 */
package practica1ej6;

import java.util.Scanner;

public class Practica1ej6 {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] lista1=new int [12]; // primera lista
        int[] lista2=new int [12]; // segunda lista
        int[] lista12=new int [24]; // lista del conjunto de ellas
        int j;
        int i;
        System.out.println("Dame 12 numeros");
        for (i=0;i<12;i++){
            lista1[i]=input.nextInt();
        }
        System.out.println("Dame otros 12 numeros");
        for (i=0;i<12;i++){
            lista2[i]=input.nextInt();
    }
        j=0;
        i=0;
        while(i<12){
            for(int k=0;k<3;k++){
                lista12[j]=lista1[i+k];
                j++;
            }
            for(int k=0;k<3;k++){
                lista12[j]=lista2[i+k];
                j++;
        }
            i+=3;
            
    }
        System.out.println("El resultado es: ");
        for(i=0;i<24;i++){
            System.out.print(lista12[i]+" ");
        }
}
}
