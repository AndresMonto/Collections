/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collections;

import Classes.BinaryTree;
import Classes.Queue;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class ArbolesBinarios {
    
    public static void Iniciar(){
        
        Scanner lectura = new Scanner (System.in);
        int op = 0;
        BinaryTree tree = new BinaryTree();
        
        do {
            System.out.println("BINARY TREE \n\n");
            System.out.println("1. Mostrar Árbol Ordenado \n");
            System.out.println("2. Insertar Nodo \n");
            System.out.println("3. Eliminar Nodo \n");
            System.out.println("4. Predecesor de Nodo \n");
            System.out.println("5. Sucesor de Nodo \n");
            System.out.println("6. Busqueda Recursiva \n");
            System.out.println("7. Busqueda Iterativa \n");
            System.out.println("8. Mostrar Árbol \n");
            System.out.println("9. Terminar \n");
            
            op = Integer.parseInt(lectura.next());
            
            switch (op) {
                case 1:
                        tree.inorder_tree_walk(tree);
                    break;
                case 2:
                        System.out.print("Ingrese valor del Nodo: ");
                        int valor = Integer.parseInt(lectura.next());
                        tree.tree_insert(tree, new BinaryTree(valor, null, null, null));
                    break;
                case 3:
                        System.out.print("Valor del Nodo a Eliminar: ");
                        valor = Integer.parseInt(lectura.next());
                        tree.tree_delete(tree, tree.recursive_tree_search(tree, valor));
                    break;
                case 4:
                        System.out.print("Valor del Nodo a Consultar: ");
                        valor = Integer.parseInt(lectura.next());
                        BinaryTree pre = tree.tree_predecessor(tree.recursive_tree_search(tree, valor));
                        System.out.println(String.format("Nodo Predecesor: %d ", pre.Value));
                    break;
                case 5:
                        System.out.print("Valor del Nodo a Consultar: ");
                        valor = Integer.parseInt(lectura.next());
                        BinaryTree suc = tree.tree_successor(tree.recursive_tree_search(tree, valor));
                        System.out.println(String.format("Nodo Sucesor: %d ", suc.Value));
                    break;
                case 6:
                        System.out.print("Valor del Nodo a Consultar Recursivamente: ");
                        valor = Integer.parseInt(lectura.next());
                        BinaryTree bus = tree.recursive_tree_search(tree, valor);
                        System.out.println(String.format("Nodo: %d   Padre: %s   H_Izq: %s   D_Der: %s", 
                                                    bus.Value, (bus.Father != null) ? String.valueOf(bus.Father.Value) : "null", (bus.LeftSon != null) ? String.valueOf(bus.LeftSon.Value) : "null", (bus.RightSon != null) ? String.valueOf(bus.RightSon.Value) : "null"));
                    break;
                case 7:
                        System.out.print("Valor del Nodo a Consultar Iterativamnete: ");
                        valor = Integer.parseInt(lectura.next());
                        bus = tree.iterative_tree_search(tree, valor);
                        System.out.println(String.format("Nodo: %d   Padre: %s   H_Izq: %s   D_Der: %s", 
                                                    bus.Value, (bus.Father != null) ? String.valueOf(bus.Father.Value) : "null", (bus.LeftSon != null) ? String.valueOf(bus.LeftSon.Value) : "null", (bus.RightSon != null) ? String.valueOf(bus.RightSon.Value) : "null"));
                    break;
                case 8:
                        tree.ShowStructure(tree);
                    break;
            }
        } while (op <= 8);
    }
}
