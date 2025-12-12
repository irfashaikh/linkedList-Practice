import java.util.Scanner;

class single {
    static class node {

        int data ; 
        node next ;

        node(int data){
            this.data = data ;
            this.next = null ;
        }
    }

    node head = null ;

    void insert (){

        int data , n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Nodes : ");
        n = sc.nextInt();
        System.out.println("Enter data in nodes : ");

        for (int i=0 ; i<n ; i++){    
            data = sc.nextInt();
            node new_node = new node(data);
            
            if (head == null){
                head = new_node;
            }
            else{
                // new_node.next = head ;             Decreasing Order of Linkes list
                // head = new_node ;

                node temp1 = head ;
                while (temp1.next != null){
                    temp1 = temp1.next ;
                }
                temp1.next = new_node ;
            }
        }
        sc.close();
    }

    void traversal (){
        node temp = head ;

        if(temp == null ){
            System.out.println("Linked List does not exits");
        }
        else{
            while(temp != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next ;
            }
            System.out.println("Null");
        }
    }

    public static void main(String[] args) {

        single obj = new single();
        obj.insert();
        obj.traversal();
    }
}