// package Linked_List ;
import java.util.Scanner ;


public class Circular_list_insertion {
    

    static class node {
        int data ;
        node next ;

        node(int data){
            this.data = data;
            this.next = null ;
        }
    }

    node head = null;
    node tail = null ;

    void creation(){

        int data ,n ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes : ");
        n = sc.nextInt();
        
        for(int i=0 ;i<n ;i++){
            System.out.println("Enter nodes : ");
            data = sc.nextInt();

            node new_node = new node(data);

            if(head == null){
                head = new_node ;
                tail = new_node ;
                tail.next = new_node ;
            }
            else{
                new_node.next = head ;                         // By default Inserting the node from Start
                head = new_node;
                tail.next = head ;
            }
        }
            // System.out.println("Enter node which you want to insert : ");
            // data = sc.nextInt();
            // node new_node = new node(data);
            // tail.next = new_node ;                          //Inserting at thr last
            // tail = new_node;
            // new_node.next = head ; 

            node temp1 = head;                                     // Insert node At specific location....
            System.out.println("Enter the position : ");
            int p =sc.nextInt();

            System.out.println("Enter node which you want to insert : ");
            data = sc.nextInt();
            node new_node = new node(data);

            for(int i =0 ; i< p-2 ; i++){
                temp1 = temp1.next ;
            }
            new_node.next = temp1.next ;
            temp1.next = new_node;
            sc.close();
           
    }

    void traversal(){
        node temp = head ;

        System.out.println("the linked list is : ");
        do{
            System.out.print(temp.data + " -> ");
            temp = temp.next ;
        }while(temp.next != head);
    }

    public static void main(String[] args)  throws Exception{
        Circular_list_insertion  obj = new Circular_list_insertion();
        obj.creation();
        obj.traversal();
    }
}
