/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collections;

import Classes.Queue;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Colas {
    
    public static void Iniciar(){
        Scanner lectura = new Scanner (System.in);
        Queue que = new Queue();
        int op = 0;
        
        do {
            System.out.println("COLA \n\n");
            System.out.println("1. Encolar \n");
            System.out.println("2. Desencolar \n");
            System.out.println("3. Mostrar Queue \n");
            System.out.println("4. Terminar \n");
            
            op = Integer.parseInt(lectura.next());
            
            switch (op) {
                case 1:
                        System.out.print("Ingrese valor: ");
                        int valor = Integer.parseInt(lectura.next());
                        que.enQueue(valor);
                    break;
                case 2:
                        Integer valorCola = que.deQueue();
                        if(valorCola != null)
                            System.out.println(String.format("Valor %d sacado de la Cola", valorCola));
                    break;
                case 3:
                        que.ShowStructure();
                    break;
            }
        } while (op < 4);
    }
}
