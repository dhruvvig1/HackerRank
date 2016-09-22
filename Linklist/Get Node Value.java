/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
Node next=null;
Node current=head;
Node prev=null;
    while(current!=null){
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
    }
      
   for(int i=0;i<n;i++){
       prev=prev.next;
    }
    return prev.data;
  

}
