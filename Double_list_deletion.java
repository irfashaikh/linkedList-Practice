// package Linked_List ;
import java.util.Scanner ;


public class Double_list_deletion {
    
    static class node {
        int data ;
        node next ;
        node prev ;

        node (int data){
            this.data = data ;
            this.next = null ;
            this.prev = null;
        }
    }

    node head = null ;
    node tail = null ;

    void creation(){
        int data ;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number  nodes : ");
        int n = sc.nextInt();

        for(int i=0 ;i<n ;i++){
            System.out.println("Enter nodes : ");
            data = sc.nextInt();

            node new_node = new node(data);

            if(head == null){
                head = new_node ;
                tail = new_node ;
            }
            else{
                node temp = head ;

                while(temp.next != null){
                    temp = temp.next ;
                }
                tail.next = new_node;
                new_node.prev = tail ;
                tail = new_node ;
            }
        }
        // node temp = head ;                        // Deletion at the Start
        // temp = temp.next  ;
        // head = temp ;
        // head.prev = null ;


        // node temp = tail ;                            // Deletion from the End
        // temp= temp.prev ;
        // temp.next = null ;


        System.out.println("Enter position : ");         // Deleting from Given location
        int p = sc.nextInt() ;
        node temp = head ;
        node ptr = temp.next ;
        for(int i=0 ; i<(p-2) ;i++){
            temp = ptr ;
            ptr = ptr.next ; 
        }
        temp.next = ptr.next ;
        ptr = temp ;
        sc.close();
    }

    void display(){
        node temp1 = head ;
        while(temp1 != null){
            System.out.print(temp1.data + " -> ");
            temp1 = temp1.next ;
        }
        System.out.println("Null");

        // node temp = tail ;                                             // To Reverse a Linked list
        // System.out.println("After Reverse the linked list is : ");
        // while(temp != null){
        //     System.out.print(temp.data + " -> ");
        //     temp = temp.prev ;
        // }
        // System.out.println("Null");

    }

    public static void main(String[] args) {
        Double_list_deletion obj = new Double_list_deletion() ;
        obj.creation();
        obj.display();
    }
}
