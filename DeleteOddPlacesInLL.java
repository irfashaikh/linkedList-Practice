import java.util.Scanner;

public class DeleteOddPlacesInLL {
    

    class Node {
        int data;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    void MakeNode(){
        int number ,data;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of LinkedList");
        number=sc.nextInt(); 

        while (number > 0){
            System.out.println("Enter Nodes : ");
            data = sc.nextInt();

            Node node = new Node(data);

            if (head == null){
                head = node;
            }
            else{
                Node temp = head;
                while (temp.next != null){
                    temp = temp.next;
                }
                temp.next = node;
            }
            number--;
        }
        sc.close();
    }


    void travel (){
        Node temp = head ;
        while (temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }


    void deleteOddPlaces (){
        Node current = head, prev = null;            // With two pointer.

        while (current != null){
            
            if (current.data %2 ==1 && current == head){
                head = current.next;
            }
            else if (current.data %2 == 1){
                if (prev == null){
                head = current.next;
                }
                else{
                prev.next = current.next;
                }
            }
            prev = current;
            current = current.next;
        }
    }

    void deleteAlternate(){
        Node pre = head ;                       // With one Pointer.

        while (pre != null && pre.next != null){
            if (pre.data %2 ==1 && pre == head){
                head = pre.next;
            }
            else{
                pre.next = pre.next.next;
            }
            pre = pre.next;
        }

    }

    public static void main(String[] args) {
        
        DeleteOddPlacesInLL obj  = new DeleteOddPlacesInLL();
        obj.MakeNode();
        obj.travel();
        // obj.deleteOddPlaces();
        obj.deleteAlternate();
        System.out.println("Delected odd in the given LL : ");
        obj.travel();
    }
}
