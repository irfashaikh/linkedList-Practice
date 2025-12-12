// package Linked_List ;
import java.util.Scanner;

public class Reverse_linked_list {
    
    static class node{
        int data ;
        node next ;
        node prev ;

        node(int data){
            this.data = data ;
            this.next = null ;
            this.prev = null ;
        }
    }
    node head = null ;
    node tail = null ;

    void creation(){
        int data ,n;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of nodes : ");
        n = sc.nextInt();        

        for (int i=0; i<n ;i++){

            System.out.println("Enter nodes : ");
            data = sc.nextInt();

            node new_node = new node(data);

            if(head == null){
                head = new_node ;
                tail = new_node ;
            }
            else {
                node temp = head ;

                while (temp.next != null){
                    temp = temp.next ;
                }
                tail.next = new_node;
                new_node.prev = tail ;
                tail = new_node ;
            }
        }
        sc.close();
    }

    void display(){
        System.out.println("Before Reverse the linked list ");
        node temp = head ;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next ;
        }
        System.out.println("Null");


        System.out.println("After Reverse the linked list ");
        node temp1 = tail ;
        while(temp1 != null){
            System.out.print(temp1.data + " -> ");
            temp1 = temp1.prev;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Reverse_linked_list obj = new Reverse_linked_list();
        obj.creation();
        obj.display();
    }
}
