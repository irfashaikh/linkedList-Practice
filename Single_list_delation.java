// import java.util.Scanner;

// class delation  {
    

//     static class node {
//         int data ;
//         node next ;

//         node(int data){
//             this.data = data ;
//             this.next = null;
//         }
//     }

//     node head = null;

//     void creation (){


//         int n ;
//         int data ;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of nodes : ");
//         n = sc.nextInt();
//         System.out.println("Enter nodes : ");
        
        
//         for (int i=0 ; i<n ;i++){
            
//             data = sc.nextInt();
//             node new_node = new node(data);
//             if(head == null){
//                 head = new_node ;
//             }
//             else{
//                 new_node.next = head ;
//                 head = new_node ;
//             }
//         }
//         // System.out.println("Delation from the end : ");            // Delation at the END 
//         // node temp = head ;
//         // temp = temp.next ;
//         // head = temp;

//         // System.out.println("Delation from start");                  //Delation at the START
//         // node temp1 = head ;
//         // node ptr = temp1.next ;
//         // while(ptr.next != null){
//         //     temp1 = ptr ;
//         //     ptr = ptr.next ;
//         // }
//         // temp1.next = null ;


//     //     System.out.println("Enter position : ");
//     //     int p = sc.nextInt();
//     //     node temp2 = head ;                                     // At specific location 
//     //     node ptr2 = temp2.next ;

//     //     for(int i=0 ; i < p-1 ;i++){
//     //         temp2 = ptr2 ;
//     //         ptr2 = ptr2.next;
//     //     }
//     //     temp2.next = ptr2.next ;

//     // }

//     void traversal(){
//         node temp = head;

//         if(head == null){
//             System.out.println("linked list does not exist...");
//         }
//         else{
//             while( temp != null){
//                 System.out.print(temp.data + "->");
//                 temp = temp.next ;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         delation obj = new delation() ;
//         obj.creation();
//         obj.traversal();
//     }

// }
