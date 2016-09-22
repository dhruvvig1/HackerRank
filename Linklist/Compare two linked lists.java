/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
    int flag=0;
    if(headA==null&&headB==null){
        return 1;
    } else if(headA==null||headB==null){
        return 0;
        
    }else{
    while((headA!=null&&headB!=null)){
        if(headA.data==headB.data){
            flag=1;
        }else{
            flag=0;
            break;
        }
   
        headA=headA.next;
        headB=headB.next;
    }
        if(headA==null&&headB==null){
            return flag;}else{
            return 0;
        }
    
    }
  
}
