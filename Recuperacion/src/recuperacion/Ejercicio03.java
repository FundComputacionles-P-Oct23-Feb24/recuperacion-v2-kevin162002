/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recuperacion;

/**
 *
 * @author KEVIN
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int ventaNumeroTelevisores[] = {100, 130, 150, 200, 100, 190, 200, 200, 300, 100, 400, 1000};
        int ventaNumeroCelulares[] = {20, 30, 22, 50, 100, 35, 90, 80, 10, 40, 50, 60};
        generarReporte(meses, ventaNumeroTelevisores, ventaNumeroCelulares);
    }

    public static void generarReporte(String[] meses, int[] televisores, int[] celulares) {
        System.out.println("El reporte de meses es:\n");
       
        for (int i = 0; i < meses.length; i++) {
           if (celulares[i] <= 35) {
              System.out.printf("%s: televisores %d - celulares: %d\n", meses[i], televisores[i], celulares[i]);
           }
        }
    }
}
