/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node MergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method 
    
    if(headA==null){
            return headB;
        }
        if(headB==null){
            return headA;
        }
        
        Node fakehead=headA.data>headB.data?headB:headA;
        Node fake=new Node();
        //fakehead.next=fake;
       // System.out.println(fake.data);
        while(headA!=null&&headB!=null){
        	
            if(headA.data>headB.data){
                fake.next=headB;
               // System.out.println(fake.data);
                headB=headB.next;
            }else{
                fake.next=headA;
                //System.out.println(fake.data);
                headA=headA.next;
            }
            
            fake=fake.next;
            }
        if(headA!=null){
            fake.next=headA;
        }else{
            fake.next=headB;
        }
        
        return fakehead;
}
