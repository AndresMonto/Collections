/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Administrador
 */
public class BinaryTree {
    
    public int Value;
    public BinaryTree Father;
    public BinaryTree LeftSon;
    public BinaryTree RightSon;
    
    public BinaryTree(int Value, BinaryTree Father, BinaryTree LeftSon, BinaryTree RightSon){
        this.Value = Value;
        this.Father = Father;
        this.LeftSon = LeftSon;
        this.RightSon = RightSon;
    }
    
    public BinaryTree(){
    
        this.Value = 20;
        this.Father = null;
        this.LeftSon = new BinaryTree(1, this, null, null);
        this.RightSon = new BinaryTree(30, this, new BinaryTree(24, null, 
                                                                                                new BinaryTree(21, null, null, null),
                                                                                                new BinaryTree(26, null, null, null)),
                                                            new BinaryTree(34, null, null, null));
        
        this.RightSon.LeftSon.Father = this.RightSon;
        this.RightSon.RightSon.Father = this.RightSon;
        
        this.RightSon.LeftSon.LeftSon.Father = this.RightSon.LeftSon;
        this.RightSon.LeftSon.RightSon.Father = this.RightSon.LeftSon;
    }
    
    public void  inorder_tree_walk(BinaryTree x){
        if (x != null){
            inorder_tree_walk(x.LeftSon);
            System.out.println(x.Value);
            inorder_tree_walk(x.RightSon);
        }
    }
    
    public BinaryTree tree_search(BinaryTree x, int k){
        if (x == null || k == x.Value){
            return x;
        }
        if (k < x.Value)
            return tree_search(x.LeftSon, k);
        else
            return tree_search(x.RightSon, k);
    }
    
    public BinaryTree iterative_tree_search(BinaryTree x, int k){
        while(x != null && k != x.Value){
            if (k < x.Value)
                x = x.LeftSon;
            else
                x = x.RightSon;
        }
        return x;
    }
    
    public BinaryTree tree_minimum(BinaryTree x){
        while(x.LeftSon != null)
            x = x.LeftSon;
        
        return x;
    }
    
    public BinaryTree tree_maximum(BinaryTree x){
        while(x.RightSon != null)
            x = x.RightSon;
        
        return x;
    }

        
}
