// package Linked_List ;
import java.util.*;

public class Single_list_merge {
    

    static class node {
        int data ;
        node next ;

        node(int data ){
            this.data =data ;
            this.next = null ;
        }
    }

    node head1 = null ;
    node head2 = null ;

    void creation(){
        int data ,n,m ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element in node1 : ");
        n =sc.nextInt();
        
        for(int i=0 ; i<n ;i++){
            System.out.println("Enter nodes : ");
            data = sc.nextInt();

            node new_node = new node(data);

            if(head1 == null){
                head1 = new_node;
            }
            else{
                node temp1 = head1 ;
                while(temp1 != head1){
                    temp1 = temp1.next ;
                }
                temp1.next = new_node; 
            }
        }


        System.out.println("Enter number of elements in node2 : ");
        m =sc.nextInt();
        
        for(int j=0 ;j<m ;j++){
            System.out.println("Enter nodes : ");
            data = sc.nextInt();

            node new_node2 = new node(data);

            if(head2 == null){
                head2 = new_node2;
            }
            else{
               node temp2 = head2 ;

               while(temp2.next != null){
                temp2 = temp2.next ;
               }
               temp2.next = new_node2 ;
            }
        }
        sc.close();
    }

    void traversal(){
            node temp1 = head1 ;
            if (head1 == null){
                System.out.println("The linked list is empty !!!");
            }
            else{
                while(temp1 != null){
                    System.out.print(temp1.data + " -> ");
                    temp1 = temp1.next ;
                }
                System.out.println("null");
            }

            node temp2 = head2 ;
            if (head2 == null){
                System.out.println("The linked list is empty !!!");
            }
            else{
                while(temp2 != null){
                    System.out.print(temp2.data + " -> ");
                    temp2 = temp2.next ;
                }
                System.out.println("null");
            }


            
    }

    public static void main(String[] args) {
        Single_list_merge obj = new Single_list_merge();
        obj.creation();
        obj.traversal();
    }
}
