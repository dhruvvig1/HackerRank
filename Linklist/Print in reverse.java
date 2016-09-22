/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

void ReversePrint(Node head) {
    //System.out.println("head"+head.data);
    //System.out.println("second"+head.next.data);

   
    Node temp=null;
    Node prev= null;
while(head!=null){
    temp=head.next;
    head.next=prev;
    prev=head;
    head=temp;
   //  System.out.println("new head"+prev.data);
    //System.out.println("new second"+prev.next.data);
}   
    
    while(prev!=null){
        System.out.println(prev.data);
        prev=prev.next;
    }

}
