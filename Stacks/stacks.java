import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class stacks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Stack s=new Stack();
        Scanner scanner = new Scanner(System.in);
       // String myString = scanner.next();
        int myInt = scanner.nextInt();
        Stack<Integer> max=new Stack<Integer>();
        max.push(0);
        for(int i=0;i<myInt;i++){
          int choice=scanner.nextInt(); 
           
            
         // System.out.println("choice  "+choice);

            if (choice==1){
                int input = scanner.nextInt();
               //  System.out.println("push number  "+input);
                s.push(input);
                if(input>max.peek()){
                    max.push(input);
                   // System.out.println(max);
                }

            }else if(choice==2){
                if (s.peek()==max.peek()){
                    max.pop();
                };
                s.pop();
                
            }else{
              System.out.println(max.peek());  
            }
        }
        scanner.close();

       // System.out.println("myString is: " + myString);
        //System.out.println("myInt is: " + myInt);
    }
}