import java.util.Scanner;

public class SingleLinkedListCreation {
    
    class Node {
        int data;
        Node next ;

        Node (int data ){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;

    public void create (){
        int data ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Nodes : ");
        int numberOfNodes = sc.nextInt();

        for (int i=0 ; i<numberOfNodes ;i++){
            System.out.println("Enter data for Node : ");
            data = sc.nextInt();
            Node new_node = new Node(data);

            if (head == null){
                head = new_node;
            }
            else{
                // Node temp = head;
                // while (temp.next != null){         // insertion at last 
                //    temp = temp.next;
                // }
                // temp.next = new_node;
                new_node.next = head;                   // Insertion at begin
                head = new_node;                                      
            }
        }
    }

    public void printLL (){
        if (head == null){
            System.out.println("LL is empty !!!");
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void search (int target){

        Node temp = head ;

        while(temp.next != null){
            if (temp.data == target){
                System.out.println("Target found !!!");
                break;
            }
            temp = temp.next;
        }
        if (temp.next == null){
            System.out.println("Target not found!!!");
        }
    }


    public static void main(String[] args) {
        SingleLinkedListCreation obj = new SingleLinkedListCreation();
        obj.create();
        obj.printLL();
        int target = 60;
        obj.search(target);
    }
}
