import java.util.Scanner;

public class LL {
    
    class Node {
        int data ;
        Node next ;

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    void create(){
        int data , n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Node : ");
        n = sc.nextInt();

        for (int i=0 ; i<n ; i++){
            System.out.println("Enter data : ");
            data = sc.nextInt();
            Node new_node = new Node (data);

            if (head == null){
                head = new_node;
            }
            else{
                Node temp = head;
                while (temp.next != null){
                    temp = temp.next;
                }
                temp.next = new_node;
            }
        }
        sc.close();
    }   

    void travel (){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    void rotate (int k){
        Node temp = head;
        Node current = head;
        Node temp2 = head;
        int count = 0;
        while (count < k){                // Time takes O(n^2)
            while (current.next != null){
                current = current.next;
            }
            current.next= temp ;
            temp = temp.next;
            count++;
        }

        while (temp2 != null){
            System.out.print(temp2.data+ " -> ");
            temp2 = temp2.next;
        }
        System.out.println();
    }

    void deleteAlternate (){
        Node prev = null;
        Node current = head ;

        while (current != null){
            prev = current;
            current = current.next.next;
            prev = prev.next.next;
        }
    }


    void check (){
        Node current = head.next ;
        Node prev = head;
        
        while (current != null && current.next!= null){
            int temp = current.data;
            current.data = prev.data;
            prev.data = temp;
            
            prev = prev.next.next;
            current = current.next.next;
        }
        System.out.println(prev.data);
        System.out.println(current.data);
    }
    public static void main(String[] args) {
        LL obj = new LL();
        // int k = 2;
        obj.create();
        obj.travel();
        // obj.rotate(k);
        // obj.deleteAlternate();
        obj.check();
        obj.travel();
    }
}
