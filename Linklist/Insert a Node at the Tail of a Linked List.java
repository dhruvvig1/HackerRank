/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method.
    Node n1=head;
		while(n1!=null){
			if(n1.next==null){
				//System.out.println(n1.val);
				Node nw=new Node();
                nw.data=data;
				n1.next=nw;
				break;
				}
			n1=n1.next;
			}
  return head;
}
