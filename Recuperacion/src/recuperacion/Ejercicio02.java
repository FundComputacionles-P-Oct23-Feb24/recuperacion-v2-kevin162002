/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recuperacion;

/**
 *
 * @author KEVIN
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String equipos[] = {"Barcelona", "Emelec", "Liga de Quito",
            "Independiente del Valle", "Delfin",
            "Macará", "Deportivo Cuenca", "Orense"};
        int goles[][] = {{1, 2, 2, 5}
                , {4, 1, 1, 4}
                , {8, 0, 1, 3}
                , {7, 1, 1, 2}
                , {6, 0, 1, 2}
                , {5, 2, 1, 1}
                , {4, 0, 3, 2}
                , {3, 1, 2, 1}};

        for (int i = 0; i < equipos.length; i++) {
            obtenerReporte(equipos[i], goles[i][0], goles[i][1], goles[i][2], goles[i][3]);
        }
    }

    public static void obtenerReporte(String equipo, int a, int b, int c, int d) {
        int suma = 0;
        suma = a + b + c + d;
        System.out.printf("%s con puntos %d,%d,%d,%d tiene un total de puntos de: %d\n", equipo, a, b, c, d, suma);
    }
}
