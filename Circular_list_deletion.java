// package Linked_List ;
import java.util.Scanner ;

public class Circular_list_deletion {
    
    static class node{
        int data ;
        node next ;

        node(int data){
            this.data = data;
            this.next = null ;
        }
    }

    node head = null ;
    node tail = null ;

    void creation(){
        int data ,n;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of nodes : ");
        n = sc.nextInt();

        for(int i=0 ; i<n ;i++){
            System.out.println("Enter nodes : ");
            data = sc.nextInt();

            node new_node = new node(data);

            if (head == null){
                head = new_node;
                tail = new_node ;
                tail.next = head ;
            }
            else{
                new_node.next = head;
                head = new_node;
                tail.next = head ;
            }
        }

        // node temp = head ;                                    //  Delete from Starting 
        // temp = temp.next ;
        // head = temp ;
        // tail.next = head ;



        // node temp = head ;                                    // Delete from the last 
        // node ptr = tail.next ;
        // while(ptr.next != head){
        //     temp = ptr ;
        //     ptr = ptr.next ;    
        // }
        // temp.next = head ;
        // tail = temp ;


        System.out.println("Enter the position : ");         // Deleting node from Specific Location...
        int p = sc.nextInt();
        node temp1 = head ;
        node ptr1 = temp1.next ;

        for (int i=0 ;i<p-2 ;i++){
            temp1 = ptr1 ;
            ptr1 = ptr1.next ;
        }
        temp1.next = ptr1.next;
        sc.close();
    }

    void traversal(){
        node temp = head ;
       
        do{
            System.out.print(temp.data + " -> ");
            temp = temp.next ;
        }while(temp != head);
        System.out.println("null");

    }

    public static void main(String[] args) {
        Circular_list_deletion obj = new Circular_list_deletion();
        obj.creation();
        obj.traversal();
    }
}
