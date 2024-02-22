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
        System.out.println("\n--------Pescaderia de la ciudad de Loja--------");
        System.out.println(info);
    }

    public static String obtenerInformacion() {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        String cadena = "";
        double multiplicacion = 0;
        double multiplicacion2 = 0;
        System.out.println("=================================\n");

        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Cuantas libras de camaron que desea vender?");
        int camaron = scanner.nextInt();
        System.out.println("Inegrese el precio por libra del camaron?");
        double precioCamaron = scanner.nextDouble();
        System.out.println("Cuantas libras de bacalao que desea vender?");
        int bacalao = scanner.nextInt();
        // scanner.nextLine();
        System.out.println("Ingrese el precio por libra del bacalao?");
        double precioBacalao = scanner.nextDouble();

        multiplicacion = precioCamaron * camaron;
        multiplicacion2 = precioBacalao * bacalao;
        total = multiplicacion + multiplicacion2;

        cadena = String.format("\nNombre: %s\nLibras de camaron: %d "
                + "||| Precio: %.1f ||| Precio total: %.1f\nLibras de bacalao: "
                + "%d ||| Precio: %.1f ||| Precio total: %.1f\nTotal a pagar: %.2f",
                nombre,
                camaron,
                precioCamaron,
                multiplicacion,
                bacalao,
                precioBacalao,
                multiplicacion2,
                total);

        System.out.println("====================================\n");
        return cadena;
    }
}
