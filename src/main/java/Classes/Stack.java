/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Stack extends Utilities {
    
    private int top = 0;
    
    public boolean stack_empty(){
        return Structure[0] == null && top == 0;
    }
    
    public void Push(int valor){
        if (top < Structure.length - 1){
            Structure[top] = valor;
            top++;
        }else
            System.out.println("Índice supera la capacidad del Arreglo");
    }
    
    public Integer Pop()
    {
        if(!stack_empty()){
            boolean ultimo = (top == Structure.length -1 && Structure[top] != null);
        
            int prevValue = Structure[top - (ultimo ? 0 : 1)];
            Structure[top - (ultimo ? 0 : 1)] = null;
            if(!ultimo)
                top = top == 0 ? top = 0 : top - 1;
            return prevValue;
        }
        return null;
    }
}
