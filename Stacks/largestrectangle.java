import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class largestrectangle {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
       // String myString = scanner.next();
        int myInt = scanner.nextInt();
        Stack<Integer> height=new Stack<Integer>();
        Stack<Integer> position=new Stack<Integer>();
height.push(0);
       int maxsteel=0;
        //int[] height=new int[myInt];
        for (int i=0;i<myInt;i++){
           int heightI=scanner.nextInt();
           if(height.isEmpty()){
        	   height.push(heightI);
        	   position.push(i);
           }
           if(heightI>height.peek()){
        	 //  height.pop();
        	height.push(heightI);
        	position.push(i);
         	 System.out.println(height.peek()+"    "+position.peek());

           }else{
        	   int  temp=position.peek();
        	   while((!height.isEmpty())&&(heightI<height.peek())){
        		        
                	   if(position.peek()<temp){
        			  temp=position.peek();
                	   }
                	   int max=height.peek()*(i-position.peek());
                	   if(max>maxsteel){
                		   maxsteel=max;
                	   }
        	  height.pop();
        	 position.pop();
        	   
        	 }
        	   height.push(heightI); 
        	   position.push(temp);
        	         	// System.out.println(height.peek()+"    "+position.peek());
           }
           System.out.println(height.peek()+"    "+position.peek());
           
         }
        while((!height.isEmpty())&&(!position.isEmpty())){
        	int max=height.peek()*(myInt-position.peek());
     	   if(max>maxsteel){
     		   maxsteel=max;
     	   }
	  height.pop();
	 position.pop();	
        	
        }
        System.out.println(maxsteel);
        
       
    }
}