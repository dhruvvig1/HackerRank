import java.util.Scanner;
import java.util.Stack;

public class StringOperation {
	 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
     Stack<String> log= new Stack<String>();
      int myInt = scanner.nextInt();
      String str=new String();
      log.push(str);
      for(int i=0;i<myInt;i++){
    	  int choice =scanner.nextInt();
    	  if(choice==1){
    		 str=str+scanner.next();
    		 //System.out.println("after addition = "+str);
    		  log.push(str);
    	  }else if(choice==2){
    		  //System.out.println(str.length()-scanner.nextInt());
    		  str=str.substring(0, str.length()-scanner.nextInt());
    		 // System.out.println("after deletion = "+str);
    		  log.push(str);
    	  }else if(choice==3){
    		  System.out.println(str.charAt(scanner.nextInt()-1));
    		  
    	  }else{
    		  System.out.println("undo");
    		  log.pop();
    		  str=log.peek();
    		  
    	  }
      }
	 }
}
