/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    
		Node n1=head;
		if(position==0){
            head=head.next;
        }
		for(int i=0;i<position-1;i++){
			n1=n1.next;
		}
		if(n1.next.next!=null){
				n1.next=n1.next.next;}
				else
					n1.next=null;
	
return head;
}

