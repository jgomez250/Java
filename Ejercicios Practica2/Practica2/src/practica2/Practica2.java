// Jose Antonio Gómez Piñero -- 1ºDAM -- 15/01/2020
/*
 Arrays bidimensionales
 */
package practica2;

import java.util.Scanner;

public class Practica2 {

    public static void sumarPosicionT() {
        int x = 5, y = 5;
        int[][] tabla = new int[x][y];
        /*System.out.println(tabla.length); // las columnas
        System.out.println(tabla[0].length); // Las filas */
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i == 0) {
                    tabla[i][j] = i + j;
                } else if (j == 2) {
                    tabla[i][j] = i + j;
                }
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void simetrica() {
        try (Scanner input = new Scanner(System.in)) {
            int x = 4, y = 4, z = 1;
            int[][] tabla = new int[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    System.out.print("Fila " + (i + 1) + " columna " + (j + 1) + " --> ");
                    tabla[i][j] = input.nextInt();
                }
            }
            int i = 0, j = 0;
            while (i < x && z == 1) { // recorre nuestra tabla hasta el punto de ver si hay algun numero diferente girando filas y columnas
                while (j < y && z == 1) {
                    if (tabla[i][j] != tabla[j][i]) {
                        z = 0;
                    }
                    j++;
                }
                i++;
            }
            if (z == 1) {
                System.out.println("Es simetrica");
            } else {
                System.out.println("No es simetrica");
            }
        }
    }

    public static void sumaTabla() {
        try (Scanner input = new Scanner(System.in)) {
            int x = 3, y = 3;
            int[][] tabla1 = new int[x][y], tabla2 = new int[x][y];
            System.out.println("Escribe la primera tabla");
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    System.out.print("Fila " + (i + 1) + " columna " + (j + 1) + " --> ");
                    tabla1[i][j] = input.nextInt();
                }
            }
            System.out.println("Escribe la segunda tabla");
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    System.out.print("Fila " + (i + 1) + " columna " + (j + 1) + " --> ");
                    tabla2[i][j] = input.nextInt();
                }
            }
            int[][] total = new int[x][y]; // creacion de la tabla total y sumar las dos tablas
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    total[i][j] = tabla1[i][j] + tabla2[i][j];
                }
            }
            System.out.println("\nLa suma es: \n"); // imprimimos la tabla sumada
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    System.out.print(total[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }

    public static void diagonal7X7() {
        int x = 7, y = 7;
        int[][] tabla = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i == j) {
                    tabla[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void bordes8X6() {
        int x = 6, y = 8;
        int[][] tabla = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i == 0 || i == 5) {
                    tabla[i][j] = 1;
                } else if (j == 0 || j == 7) {
                    tabla[i][j] = 1;
                }
            }// todos los elementos de una array son 0 siempre y cuando no tengan un valor determinado por nosotros
        }
        System.out.println("El resultado es: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void bordesUsuario() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Para rellenar la tabla, dime cuantas filas quieres:");
            int x = input.nextShort();
            System.out.println("Y cuantas columnas:");
            int y = input.nextShort();
            int[][] tabla = new int[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    if (i == 0 || i == tabla.length - 1) {
                        tabla[i][j] = 1;
                    } else if (j == 0 || j == tabla[0].length - 1) {
                        tabla[i][j] = 1;
                    }
                }// todos los elementos de una array son 0 siempre y cuando no tengan un valor determinado por nosotros
            }
            System.out.println("El resultado es: ");
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    System.out.print(tabla[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) { // Esto hace que cierre un objeto
            // en este caso Scanner, el cual hay que cerrar siempre los objetos,
            // mayoritariamente los de leer datos.
            int opcion;
            do {
                System.out.println("'1'- Suma de posiciones en forma T, tabla de 5x5");
                System.out.println("'2'- Simetrica o no tabla de 4x4");
                System.out.println("'3'- Suma tabla de 3x3");
                System.out.println("'4'- Tabla de 7x7 diagonal(1), resto(0)");
                System.out.println("'5'- Tabla 8x6 bordes(1), resto(0)");
                System.out.println("'6'- Tabla creada por usuario, bordes(1), resto(0)");
                System.out.println("\n Que opcion deseas?");
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        sumarPosicionT();
                        break;
                    case 2:
                        simetrica();
                        break;
                    case 3:
                        sumaTabla();
                        break;
                    case 4:
                        diagonal7X7();
                        break;
                    case 5:
                        bordes8X6();
                        break;
                    case 6:
                        bordesUsuario();
                        break;
                    default: // si el valor no esta dentro del menu, salta a este apartado
                        System.out.println("Introduce un numero dentro de las possibilidades");
                }
            } while (opcion >= 7 || opcion <= 0);

        }
    }
}
