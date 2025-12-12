import java.util.Scanner;

class Node {
    int data ;
    Node next ;

    Node (int data ){
        this.data = data ;
        this.next = null;
    }
}

public class LinkedListSingle {
    
    class Node {
    int data ;
    Node next ;

    Node (int data ){
        this.data = data ;
        this.next = null;
    }

    static Node head = null;

        static void create () {
            int data  , n ;

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of nodes : ");
            n = sc.nextInt();

            for (int i=0 ; i<n ; i++){
                System.out.println("Enter Nodes : ");
                data = sc.nextInt();
                Node newNode = new Node(data);

                if (head == null){
                    head = newNode;
                }
                else{
                    Node temp = head;                           // Insert at last.
                    while (temp.next != null) {
                        temp = temp.next;
                    }
                    temp.next = newNode;
                }
            }

        }

        public static void main(String[] args) {
            
            // LinkedListSingle obj = new LinkedListSingle();
            create();
        }
    }
}
