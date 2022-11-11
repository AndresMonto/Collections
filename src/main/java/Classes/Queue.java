/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Administrador
 */
public class Queue extends Utilities {

    private int head = 0;
    private int tail = 0;
    
    public void enQueue(int value)
    {
        if(!Queue_Full()){
            Structure[tail] = value;
            tail = (tail == Structure.length - 1) ? 0 : tail + 1;
        }else{
            System.out.println("Índice supera la capacidad de la Cola");
        }
    }
    
    public Integer deQueue()
    {
        if(!Queue_Empty()){
            Integer valor = Structure[head];
            Structure[head] = null;
            head = (head == Structure.length - 1) ? 0 : head + 1; 
            return valor;
        }else{
            System.out.println("La Cola está vacía");
            return null;
        }
    }
    
    public boolean Queue_Empty()
    {
        return head == tail && Structure[head] == null;
    }

    public boolean Queue_Full()
    {
        return head == tail && Structure[head] != null;
    }   
    
}
