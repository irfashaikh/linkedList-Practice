// package Linked_List ;
import java.util.Scanner;

public class Single_list_sort {
    
    static class node{
        int data ;
        node next ;

        node(int data){
            this.data = data;
            this.next = null ;
        }
    }

    node head = null ;

    void creation (){
        int data,n ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes : ");
        n = sc.nextInt();

        for(int i=0 ; i<n ;i++){
            System.out.println("Enter nodes : ");
            data = sc.nextInt();

            node new_node = new node(data);
        
            if(head == null){
                head = new_node ;
            }
            else{
                new_node.next = head ;
                head = new_node ;
            }
        }
        sc.close();
    }
    
    void sort(){
        int num ;
        node temp = head ;
        node ptr = null ;

        // System.out.println("the Sortd Linked list is : ");
        if(head == null){
            System.out.println("Lnked list is empty ...");
        }
        else{
            while(temp != null){
                ptr = temp.next ;
                while(ptr != null){
                    if(temp.data > ptr.data){
                        num = temp.data ;
                        temp.data = ptr.data;
                        ptr.data = num ;
                    }
                    ptr = ptr.next;
                }
                temp = temp.next ;
            }
        }
    }

    void traversal(){
        node temp1 = head ;

        if(head == null){
            System.out.println("Linked list does not exists ...");
        }
        else{
            while(temp1 != null){
                System.out.print(temp1.data + " -> ");
                temp1 = temp1.next;
            }
            System.out.println("null");
        }
    }


    public static void main(String[] args) {
        Single_list_sort obj = new Single_list_sort();
        obj.creation();
        obj.sort();
        obj.traversal();
    }
}
