/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.collections;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Collections {

    public static void main(String[] args) {
        
        
        Scanner lectura = new Scanner (System.in);
        int op = 0;
        
        do {
            System.out.println("COLEECIONES \n\n");
            System.out.println("1. Pilas \n");
            System.out.println("2. Colas \n");
            System.out.println("3. Tablas de Hash \n");
            System.out.println("4. Árboles Binarios \n");
            System.out.println("5. Terminar \n");
            
            op = Integer.parseInt(lectura.next());
            
            switch (op) {
                case 1:
                        new Pilas().Begin();
                    break;
                case 2:
                        new Colas().Begin();
                    break;
                case 3:
                        new TablasHash().Begin();
                    break;
                case 4:
                        new ArbolesBinarios().Begin();
                    break;
            }
        } while (op <= 4);
    }
}
