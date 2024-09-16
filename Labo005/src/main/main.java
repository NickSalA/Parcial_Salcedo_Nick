/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package main;
import Modelo.Usuario;
import java.util.Scanner;
/**
 *
 * @author Nick Emanuel Salcedo Alfaro
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte el apellido paterno del usuario: ");
        String paterno = scanner.next();

        System.out.println("Inserte el apellido materno del usuario: ");
        String materno = scanner.next();

        System.out.println("Inserte los nombres del usuario: ");
        String nombres = scanner.next();

        System.out.println("Inserte el documento del usuario: ");
        String documento = scanner.next();

        System.out.println("Inserte el saldo inicial de su tarjeta");
        float saldo = scanner.nextFloat();
        Usuario usuario = new Usuario(paterno, materno, nombres, documento, 1632045460, saldo, "Cliente", true);
        
        boolean continuar = true;
        while (continuar) {
            System.out.println("Menu de opciones:");
            System.out.println("1. Recargar");
            System.out.println("2. Consumir");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nInserte el monto a recargar: ");
                    float montoR = scanner.nextFloat();
                    usuario.recargar(montoR);
                    System.out.println("Usuario: " + usuario.getNombreCompleto() + "\t\tSaldo: " + usuario.getSaldo() + "\n");
                    break;
                case 2:
                    System.out.println("\nInserte el monto a consumir: ");
                    float montoC = scanner.nextFloat();
                    usuario.consumir(montoC);
                    System.out.println("Usuario: " + usuario.getNombreCompleto() + "\t\tSaldo: " + usuario.getSaldo() + "\n");
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();

    }
}
