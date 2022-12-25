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

        String[] vendedores = new String[2];
        double[][] ventas = new double[2][5];
        double suma = 0;
        String reporte = "";
       

        for (int i = 0; i < vendedores.length; i++) {
            System.out.println("Ingrese el nombre del " + i + " vendedor: ");
            vendedores[i] = entrada.nextLine();
            reporte = String.format("%sVendedor(a) %s\n",
                    reporte,
                    vendedores[i]);
        }

        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.println("Ingresa las ventas del dia "+ vendedores[i] +"[" + i + "]"
                        + "[" + j + "]" + " :");
                ventas[i][j] = entrada.nextDouble();
                suma = suma + ventas[i][j];

            }

        }
        System.out.printf("%sHa realizado un total de %.2f en ventas\n"
                , reporte
                , suma);

    }
}
