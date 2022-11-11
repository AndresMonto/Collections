/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Administrador
 */
public class HashTable extends Utilities{
    
    public Integer Insert(Integer value){
        int i = 0;
        int j = 0;
        do {
            j = HashDiv(value) + i;
            if(Structure[j] == null){
                Structure[j] = value;
                return j;
            }else{
                i++;
            }
        }while (j < Structure.length - 1);
        
        return null;
    }
    
    public Integer Search(Integer value){
        int i = 0;
        int j = 0;
        do {
            j = HashDiv(value) + i;
            if(Structure[j] == value){
                return j;
            }else{
                i++;
            }
        }while (Structure[j] != value && j < Structure.length - 1);
        
        return null;
    }
    
    public Integer Delete(Integer value){
        int i = 0;
        int j = 0;
        
        do {
            j = HashDiv(value) + i;
            if(Structure[j] == value){
                Structure[j] = null;
                return j;
            }else{
                i++;
            }
        }while(Structure[j] != value && j < Structure.length - 1);
        
        return null;
    }
    
    private Integer HashDiv(Integer value){
        return value % Structure.length;
    }
}
