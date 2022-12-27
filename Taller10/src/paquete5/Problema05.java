/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}};

        String nombres = " ";
        char inicialLetra;
        int i;
        int j;

        for (i = 0; i < estudiantes.length; i++) {
            for (j = 0; j < estudiantes[i].length; j++) {
                inicialLetra = estudiantes[i][j].charAt(0);
                String inicial = estudiantes[i][j].valueOf(inicialLetra);

                if (inicial.equals("S")) { //Se comprueba si la inicial empiza con la letra "S"
                    nombres = String.format("%s%s\t", nombres,
                            estudiantes[i][j]);//esta cadena sirve para ir guardando loa elementos
                                               //y presentar al final cuando se termine el proceso.
                }
                if (inicial.equals("P")) {//Se comprueba si la inicial empiza con la letra "P"
                    nombres = String.format("%s%s\t", nombres,
                            estudiantes[i][j]);//esta cadena sirve para ir guardando loa elementos
                                               //y presentar al final cuando se termine el proceso.
                }
                if (inicial.equals("T")) {//Se comprueba si la inicial empiza con la letra "T"
                    nombres = String.format("%s%s\t", nombres,
                            estudiantes[i][j]);//esta cadena sirve para ir guardando loa elementos
                                               //y presentar al final cuando se termine el proceso.
                }
            }
        }
        System.out.printf("%s\n", nombres);
    }
}
