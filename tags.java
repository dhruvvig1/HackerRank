import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class tags{
   public static void main(String[] args){
      
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String line = in.nextLine();
       String[] linestr=line.split("/\\w+><\\w+");
       System.out.println(linestr[0]);
       System.out.println(linestr[1]);
          Pattern pattern = Pattern.compile("<([\\w\\s]+)>(<[\\w\\s]+>)*(.+?)(</\\2>)*</\\1>");
         Matcher matcher = pattern.matcher(line);
         
         if (matcher.find()) {
        	 System.out.println(matcher.group(3));
        	 } else {
             System.out.println("None");
          }
          
         
         testCases--;
      }
   }
}