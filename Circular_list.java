// package Linked_List ;
import java.util.Scanner;


class Circular_linked_list{
    

    static class node{
        int data ;
        node next ;

        node(int data){
            this.data = data ;
            this.next = null ;
        }
    }
    node head = null ;
    node tail = null ;                                //Initialize a tail here...

    void creation (){

        int data,n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes : ");
        n = sc.nextInt();

        for(int i=0 ;i<n ;i++){
            System.out.println("Enter nodes : ");
            data = sc.nextInt();

            node new_node = new node(data);

            if(head == null){
                head = new_node ;
                tail = new_node ;                             //Additional part in circular linked list..
                tail.next = head ;                  // Three connection in circular linked list ...
            }
            else{
                new_node.next = head ;
                head = new_node ;
                tail.next = head ;
            }
        }
        sc.close();
    }

    void traversal(){
        node temp = head ;
        System.out.println("The Circular Linked List is : ");
        do{
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }while(temp != head );                             //In do while loop the loop execute at least once..
        System.out.println("Null");
    }   

    public static void main(String[] args) {
        Circular_linked_list obj = new Circular_linked_list();
        obj.creation();
        obj.traversal();
    }
}   
