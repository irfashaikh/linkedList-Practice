import java.util.Scanner;
public class reverseDoubleLL {
    
    class Node {
        int data ;
        Node next ;
        Node prev;

        Node (int data) {
            this.data = data ;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;


    void create(){
        int data;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0 ;i<n ; i++){
            data = sc.nextInt();
            Node new_Node = new Node(data);

            if (head == null){
                head = new_Node ;
                tail = new_Node;
            }
            else{
                Node temp = head;
                while (temp != null){
                    temp = temp.next;
                }
                temp.next = new_Node ;
                new_Node.prev = temp;
                tail = new_Node;
            }
        }
        sc.close();
    }

    void traversal(){
        Node temp = head ;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        reverseDoubleLL obj = new reverseDoubleLL();
        obj.create();
        obj.traversal();
    }
}
