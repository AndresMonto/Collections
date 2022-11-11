/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collections;

import Classes.HashTable;
import Classes.Start;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class TablasHash extends Start{
        
    @Override
    public void Begin() {
        Scanner lectura = new Scanner (System.in);
        HashTable table = new HashTable();
        int op = 0;
        
        do {
            System.out.println("TABLA DE HASH \n\n");
            System.out.println("1. Insertar \n");
            System.out.println("2. Buscar \n");
            System.out.println("3. Eliminar \n");
            System.out.println("4. Mostrar Tabla \n");
            System.out.println("5. Terminar \n");
            
            op = Integer.parseInt(lectura.next());
            
            if(op != 4 && op < 5){
                System.out.print("Ingrese valor: ");
                int valor = Integer.parseInt(lectura.next());
                Integer value = null;
                String[] msj = new String[2];
                
                switch (op) {
                    case 1:
                        value = table.Insert(valor);
                        msj[0] = "insertado";
                        msj[1] = "No se encontró un índice para el valor";
                        break;
                    case 2:
                        value = table.Search(valor);
                        msj[0] = "encontrado";
                        msj[1] = "No se encontró el valor";
                        break;
                    case 3:
                        value = table.Delete(valor);
                        msj[0] = "eliminado";
                        msj[1] = "No se encontró el valor";
                        break;
                }
                if(value != null)
                    System.out.println(String.format("Valor %s en el índice : %d",  msj[0], value));
                else
                    System.out.println(String.format(msj[1]));
                
            }else if(op == 4){
                table.ShowStructure();
            }
            
        } while (op < 5);
    }
    
}
