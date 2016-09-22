import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class balancebrackets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
           
            Stack<Integer> st=new Stack<Integer>();
            //Stack<Character> left=new Stack<Character>();
       
           char[] ch= s.toCharArray();
           st.push(0);
           int chLen=ch.length;
           boolean flag=false;
           if(chLen%2==0){
        	   for(int i=0;i<chLen;i++){ 
        		   if(Math.abs((int)ch[i]-(int)st.peek())>3){
        			   System.out.println(ch);
        			   st.push((int)ch[i]);
        		   }else{
        			   st.pop();
        		   }
        		
        		   System.out.println(st.peek());
        	   }
        	  if(st.peek()==0){
        		  flag=true;
        	  }
           }else{
        	 flag=false; 
           }
           String result = flag ? "YES" : "NO";
           System.out.println(result);
           
        	   
        	   
           }
            
        }
    }

