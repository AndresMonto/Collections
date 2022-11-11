/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Administrador
 */
public class Utilities {
    
    public Integer Structure[] = new Integer[5];
    
    public void ShowStructure(){

        System.out.print("[");

       for (Integer sta : Structure)
       {
           String msj = "";
           if(sta == null){
               msj = "null";
           }else{
               msj = sta+"";
           }
           System.out.print(String.format(" %s , ", msj));
       }
       System.out.println("]");
    };
}
