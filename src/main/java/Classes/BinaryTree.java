/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Administrador
 */
public class BinaryTree extends Utilities{
    
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
    
    public BinaryTree recursive_tree_search(BinaryTree x, int k){
        if (x == null || k == x.Value){
            return x;
        }
        if (k < x.Value)
            return recursive_tree_search(x.LeftSon, k);
        else
            return recursive_tree_search(x.RightSon, k);
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
    
    public BinaryTree tree_successor(BinaryTree x){
        BinaryTree y;
        
        if (x.RightSon != null)
            return tree_minimum(x.RightSon);
        else{
            y = x.Father;
        
            while(y != null && x == y.RightSon){
                x = y;
                y = y.Father;
            }
            return y;
        }
    }
    
    public BinaryTree tree_predecessor(BinaryTree x){
        BinaryTree y;
        
        if (x.LeftSon != null)
            return tree_maximum(x.LeftSon);
        else{
            y = x.Father;
        
            while(y != null && x == y.LeftSon){
                x = y;
                y = y.Father;
            }
            return y;
        }
    }
    
    public void tree_insert(BinaryTree T,BinaryTree z){
        BinaryTree x = T;
        BinaryTree y = null;
        while(x != null){
            y = x;
            if (z.Value < x.Value)
                x = x.LeftSon;
            else
                x = x.RightSon;
        }
        z.Father = y;
        if (y == null)
            T = z;
        else if (z.Value < y.Value)
            y.LeftSon = z;
        else
            y.RightSon = z;
    }
    
    
    private void transplant(BinaryTree T,BinaryTree u,BinaryTree v){
        if (u.Father == null){
            T = v;
        }else if (u == u.Father.LeftSon){
            u.Father.LeftSon = v;
        }else{
            u.Father.RightSon = v;
        }
        if (v != null)
            v.Father = u.Father;
    }
    
    public void tree_delete(BinaryTree T,BinaryTree z){
        if (z.LeftSon == null)
            transplant(T, z, z.LeftSon);
        else if (z.RightSon == null)
            transplant(T, z, z.RightSon);
        else{
            BinaryTree y;
            y = tree_minimum(z.RightSon);
        
            if (y != z.RightSon){
                transplant(T, y, y.RightSon);
                y.RightSon = z.RightSon;
                y.RightSon.Father = y;
            }
            transplant(T, z, y);
            y.LeftSon = z.LeftSon;
            y.LeftSon.Father = y;
            if(y.Father == null){
                T.Value = y.Value;
            }
        }
    }
    
    public void ShowStructure(BinaryTree x){
        if (x != null){
            ShowStructure(x.LeftSon);
            System.out.println(String.format("Nodo: %d   Padre: %s   H_Izq: %s   D_Der: %s", 
                                                    x.Value, (x.Father != null) ? String.valueOf(x.Father.Value) : "null", (x.LeftSon != null) ? String.valueOf(x.LeftSon.Value) : "null", (x.RightSon != null) ? String.valueOf(x.RightSon.Value) : "null"));
            ShowStructure(x.RightSon);
        }
    }

        
}
