/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[][] datos = new double[2][2];
        System.out.println("Ingrese datos decimales");
        

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.print("Ingrese[" + i + "]" + "[" + j + "]=");
                datos[i][j] = entrada.nextDouble();

            }
        }

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.println("El numero [" + i + "] es: " + datos[i][j]);

            }
        }
    }
}
