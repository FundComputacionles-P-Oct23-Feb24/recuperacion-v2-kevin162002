/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recuperacion;

/**
 *
 * @author KEVIN
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int contador = 0;
        int contador2 = 0;
        double operacion = 0;
        obtenerOperacion(contador, contador2, operacion);
    }

    public static void obtenerOperacion(int cont, int cont2, double ope) {
        double suma = 0;
        for (int i = 1; i < 7; i++) {
            cont = cont + 2;
            cont2 = cont2 + 7;
            ope = (i * cont);
            ope = ope / cont2;
            suma = suma + ope;
            System.out.printf("%d * %d / %d = %.1f\n", i, cont, cont2, ope);
        }
        System.out.printf("La suma de todos los valores es: %.1f\n", suma);
    }

}
