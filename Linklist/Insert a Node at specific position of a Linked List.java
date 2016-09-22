/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
  Node n1=head;
    if(position==0){
        Node nw= new Node();
        nw.data=data;
		nw.next=head;
		head=nw;
        
                   }else{
		for(int i=0;i<position-1;i++){
			   n1=n1.next;
		}
		 Node nw=new Node();
    nw.data=data;
			nw.next=n1.next;
			n1.next=nw;
}
    return head;

}
