/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recuperacion;

import java.util.Scanner;

/**
 *
 * @author KEVIN
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        boolean bandera = true;
        String info = "";
        while (bandera) {

            System.out.println("Desea agregar un nuevo vendedor?");
            System.out.println("1) SI");
            System.out.println("2) NO");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    bandera = true;
                    info = info + obtenerInformacion();
                    break;
                case 2:
                    bandera = false;
                    System.out.println("El ingreso de datos termino");
                    break;
                default:
                    bandera = false;
                    System.out.println("ERROR!!");
            }
        }
        System.out.println(info);
    }

    public static String obtenerInformacion() {
        Scanner scanner = new Scanner(System.in);
        double precioCamaron = 0;
        double precioBacalao = 0;
        double total = 0;
        String cadena = "";
        System.out.println("=================================\n");

        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Cuantas libras de camaron desea vender?");
        int camaron = scanner.nextInt();
        System.out.println("Cuantas libras de bacalao desea vender?");
        int bacalao = scanner.nextInt();
        scanner.nextLine();
        precioCamaron = 1.1 * camaron;
        precioBacalao = 1.20 * bacalao;
        total = precioCamaron + precioBacalao;

        cadena = String.format("\nNombre: %s\nLibras de camaron: %d ||| "
                + "Precio: %.1f\nLibras de bacalao: %d ||| Precio: %.1f\n"
                + "Total a pagar: %.2f",
                nombre,
                camaron,
                precioCamaron,
                bacalao,
                precioBacalao,
                total);
        
        System.out.println("====================================\n");
        return cadena;
    }
}
