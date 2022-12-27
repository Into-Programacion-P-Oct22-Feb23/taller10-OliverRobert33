/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Locale;

/**
 *
 * @author Oliver Saraguro
 */
public class Problema06 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}};

        String salida = "";
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                if (estudiantes[i][j].length() > 10) {
                    salida = String.format("%s(%s)",
                            estudiantes[i][j], estudiantes[i][j].length());
                }
                System.out.printf("%s\n", salida);
            }
        }
    }
}
