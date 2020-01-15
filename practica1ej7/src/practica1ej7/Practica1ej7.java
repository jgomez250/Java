// Jose Antonio Gómez Piñero -- 1ºDAM -- 10/01/2020
/*
 Incluye los 6 ejercicios anteriores en métodos, y realiza un programa principal
que pida al usuario que método quiere ejecutar y llame a este. Ejemplos de
métodos:
 */
package practica1ej7;

import java.util.Scanner;

public class Practica1ej7 {
        public static void leerNum() {
        Scanner input = new Scanner(System.in); // clase para que el usuario nos de inputs
        short[] lista=new short [5]; //array de 5 elementos( 1 dimension )
        for (int i=0; i<5; i++){ // recorremos y hacemos que nos agregue al array lo que dijita
            System.out.println("Dame un número");
            short numero=input.nextShort(); // resultado del input
            System.out.print("\n"); // salto de linea
            lista[i]= numero; //agregamos el input del usuario
        }
        for (int j=0; j<5; j++){
            System.out.print(lista[j]+" ");
        }
    }
        public static void leerNumInverso() {
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
        public static void mostrarMediaNumContador() {
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
        public static void mostrarArray() {
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
        public static void mostrarArrayAlt() {
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
        public static void mostrarArrayTres() {
        Scanner input = new Scanner(System.in);
        int[] lista1 = new int[12]; // primera lista
        int[] lista2 = new int[12]; // segunda lista
        int[] lista12 = new int[24]; // lista del conjunto de ellas
        int j;
        int i;
        System.out.println("Dame 12 numeros");
        for (i = 0; i < 12; i++) {
            lista1[i] = input.nextInt();
        }
        System.out.println("Dame otros 12 numeros");
        for (i = 0; i < 12; i++) {
            lista2[i] = input.nextInt();
        }
        j = 0;
        i = 0;
        while (i < 12) {
            for (int k = 0; k < 3; k++) {
                lista12[j] = lista1[i + k];
                j++;
            }
            for (int k = 0; k < 3; k++) {
                lista12[j] = lista2[i + k];
                j++;
            }
            i += 3;
        }
        System.out.println("El resultado es: ");
        for (i = 0; i < 24; i++) {
            System.out.print(lista12[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("'1' - Para leer 5 numeros en el mismo orden");
            System.out.println("'2' - Para leer 5 numeros en el orden inverso");
            System.out.println("'3' - Para leer 5 numeros hacer la media + y - y contador de 0s");
            System.out.println("'4' - Para leer 10 numeros en el orden: 1º, 10º, 2º, 9º...");
            System.out.println("'5' - Para leer 10 numeros en dos listas en el orden: 1ºA, 1ºB...");
            System.out.println("'6' - Para leer 12 numeros en dos listas en el orden: 3num de la A, 3num de la B...");
            System.out.println("\n Que opcion deseas?");
            opcion=input.nextInt();
            switch (opcion){
            case 1:
                leerNum();
                break;
            case 2:
                leerNumInverso();
                break;
            case 3:
                mostrarMediaNumContador();
                break;
            case 4:
                mostrarArray();
                break;
            case 5:
                mostrarArrayAlt();
                break;
            case 6:
                mostrarArrayTres();
                break;
            default: // si el valor no esta dentro del menu, salta a este apartado
                System.out.println("Introduce un numero dentro de las possibilidades");
    }
        }
        while (opcion>=7 || opcion<=0);
        }
    }