// package Linked_List ;
import java.util.Scanner ;

class demo {

    static class node {
        int data ;
        node next ;
        node prev ;

        node (int data){
            this.data = data ;
            this.next = null ;
            this.prev = null ;
        }
    }
    node head = null ;
    node tail = null ;

    void creation(){

        int data ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes : ");
        int n = sc.nextInt();

        for(int i=0 ; i<n ;i++){

            System.out.println("Enter nodes : ");
            data = sc.nextInt();

            node new_node = new node(data);

            if ( head == null){
                head = new_node ;
                tail = new_node ;
            }
            else {
                node temp = head ;

                while(temp.next != null){
                    temp = temp.next ;
                }
                temp.next = new_node ;
                new_node.prev = temp ;
                tail = new_node;
            }
        }
        System.out.println("Enter node which u want to insert : ");      
        data = sc.nextInt();
        node new_node = new node(data);


        // new_node.next =head ;              // At the start 
        // head.prev = new_node ;
        // head = new_node ; 

        // tail.next = new_node ; 
        

        System.out.println("Enter postion : ");           // At specific Locat
        int p = sc.nextInt();

        node temp1 = head ;
        node ptr1 = temp1.next ;

        for(int i=0 ;i<(p-2) ;i++){
            temp1= ptr1 ;
            ptr1 = ptr1.next ;
        }
        new_node.prev = temp1 ;
        new_node.next = ptr1 ;
        temp1.next = new_node ;
        ptr1.prev = new_node ;
        sc.close();
    }

    void traversal(){
        node temp = head ;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next ;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        demo obj = new demo();
        obj.creation();
        obj.traversal();
    }
}