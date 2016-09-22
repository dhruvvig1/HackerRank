import java.util.Stack;

public class LinkList {	
	 Node head;
	
	static class Node{
		Node next;
		int val;
		
		Node(int a){
			val=a;
			next=null;
		}
	}

	public static void main(String[] args){
		LinkList llist=new LinkList();
        llist.head=new Node(1);
        Node second=new Node(18);
        Node third=new Node(3);
        
        llist.head.next=second;
        second.next=third;

        llist.append(10);
       // llist.push(15);
       llist.insertAfter(2, 32);
       System.out.println("list");
       llist.printList();
       llist.delete(10);
       System.out.println("list new");
       llist.printList();
       Node n1=llist.head;
       System.out.println("length"+llist.length(n1));
       System.out.println("find   "+llist.find(45, n1));

       Stack s =new Stack();
       s.p
       
		
	}
	
	public void printList(){
		Node n=head;
		while(n!=null){
		System.out.println(n.val);	
		n=n.next;
		}
		
	}
	
	public void push(int data){
		Node nw= new Node(data);
		nw.next=head;
		head=nw;
		//System.out.println(nw.val);
	}
	
	public void insertAfter(int position,int data){
		Node n1=head;
		for(int i=1;i<position;i++){
			   n1=n1.next;
		}
		 Node nw=new Node(data);
			nw.next=n1.next;
			n1.next=nw;
		//System.out.println(n1.val);
		}
	
	
	public void append(int data){
		Node n1=head;
		while(n1!=null){
			if(n1.next==null){
				//System.out.println(n1.val);
				Node nw=new Node(data);
				n1.next=nw;
				break;
				}
			n1=n1.next;
			}
		}
	
	public void delete(int data){
		Node n1=head;
		if(n1.val==data){
		head=n1.next;	
		}else{
		while(n1!=null){
			if (n1.next.val==data){
				if(n1.next.next!=null){
				n1.next=n1.next.next;}
				else
					n1.next=null;
				break;				
			}
			n1=n1.next;
		}}
	}
	
	public void deleteAt(int position){
		Node n1=head;
		if(position==1)
		for(int i=1;i<position-1;i++){
			n1=n1.next;
		}
		System.out.println(n1.val);
	}
	
	public int length(Node node){
			//int count=0;
		if(node==null)
			return 0;

		//length();
		return 1+length(node.next);
		
	}
	
	public boolean find(int data, Node node){
		if (node==null)
			return false;
		if (node.val==data)
			return true;
		
		return find(data,node.next);
	}
	
	

}
