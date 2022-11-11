/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collections;

import Classes.Stack;
import Classes.Utilities;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Pilas {
    
    public static void Iniciar(){
        Scanner lectura = new Scanner (System.in);
        Stack sk = new Stack();
        int op = 0;
        
        do {
            System.out.println("PILA \n\n");
            System.out.println("1. Ingresar Valor \n");
            System.out.println("2. Quitar Último Valor \n");
            System.out.println("3. Verificar vacío \n");
            System.out.println("4. Mostrar Pila \n");
            
            op = Integer.parseInt(lectura.next());
            
            switch (op) {
                case 1:
                        System.out.print("Ingrese valor: ");
                        int valor = Integer.parseInt(lectura.next());
                        sk.Push(valor);
                    break;
                case 2:
                        System.out.println(String.format("Valor eliminado: %d",  sk.Pop()));
                    break;
                case 3:
                        System.out.println(String.format("La pila %s está vacía",  (sk.stack_empty() ? "sí" : "no") ));
                    break;
                case 4:
                        sk.ShowStructure();
                    break;
            }
            
            System.out.println("1. Continuar");
            System.out.println("2. Terminar");
            op = Integer.parseInt(lectura.next());
            
        } while (op == 1);
    }
    
}
