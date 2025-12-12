// package Linked_List ;
import java.util.Scanner;

public class Single_list_insertion {
    
    static class node{
        int data ;
        node next ;

        node(int data ){
            this.data = data ;
            this.next = null ;
        }
    }

    node head = null ;

    void creation(){
        int data,n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes :");
        n = sc.nextInt();
        System.out.println("Enter nodes : ");
        
        
        for(int i=0 ; i<n ;i++){
            data = sc.nextInt();
            node new_node = new node(data);                     // By default at the starting 
            if(head == null ){
                head = new_node ;
            }                                 
            else {
                // new_node.next = head ;                    // Decending order linked list 
                // head = new_node ;
                
                node temp1 = head ;                           // Ascending order Linked list
                while(temp1.next != null){  
                    temp1 = temp1.next ;
                }
                temp1.next = new_node;
            }
        }

        // System.out.println("Enter node which you want to insert :");        //Insertion at the END
        // int m = sc.nextInt();                                            
        // node new_node = new node(m);
        // node temp = head ;
        // while(temp.next != null){
        //     temp = temp.next ;
        // }
        // temp.next = new_node ;

        // System.out.println("Enter specific location : ");                     
        // int p = sc .nextInt();
        // System.out.println("Enter nodes : ");                         
        // data = sc.nextInt();
        // node new_node = new node (data);
    
        // node temp = head ;

        // for(int i=0 ;i<p-2 ;i++){
        //     temp = temp.next ;
        // }
        // new_node.next = temp.next ;
        // temp.next = new_node ;  
        sc.close();
    }

    void traversal(){
        
        node temp = head ;
        if (temp == null){
            System.out.println("LL does not exists ");
        }
        else{
            while(temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next ;
            }
        }
    }

    public static void main(String[] args) {
        Single_list_insertion obj2 = new Single_list_insertion();
        obj2.creation();
        obj2.traversal();
    }
}
