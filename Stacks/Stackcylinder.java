import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Stackcylinder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int sum1=0;
        int sum2=0;
        int sum3=0;
       
        int h1[] = new int[n1];
        for(int i=0; i < n1; i++){
        	int element1=in.nextInt();
          
        	h1[n1-i-1]=element1;        
        }
        int h2[] = new int[n2];
        for(int i=0; i < n2; i++){
        	int element1=in.nextInt();
          
        	h2[n2-i-1]=element1;      
        }
        int h3[] = new int[n3];
        for(int i=0; i < n3; i++){
        	int element1=in.nextInt();
          
        	h3[n3-i-1]=element1;      
        }
        
for(int i=0; i < n1; i++){
        	
            sum1=sum1+h1[i];
            hm.put(sum1,0);
             }
        for(int i=0; i < n2; i++){
        	sum2=sum2+h2[i];
           if(hm.containsKey(sum2)){
        	 hm.replace(sum2, 0, 1)  ;
           }
        }
        int max=0;
for(int i=0; i < n3; i++){
            sum3=sum3+h3[i];
            if(hm.containsKey(sum3)&&(hm.get(sum3)==1)){
            	if(sum3>max){
             	   max=sum3;
                }
              }
                       

        }
      
            
        /*for(int i=0;i<h1.length;i++){
        	System.out.println("1  ==="+h1[i]);
        }
        for(int i=0;i<h2.length;i++){
        	System.out.println("2   ===="+h2[i]);
        }*/
     /*   int comm1[] = new int[Math.max(h1.length, h2.length)];
     int  count=0;
    for(int i=0;i<h1.length;i++){
        for(int j=0;j<h2.length;j++){
            if(h1[i]==h2[j]){
                comm1[count]=h1[i];
                count++;
            }
        }
    }
        for(int i=0;i<comm1.length;i++){
        	System.out.println(comm1[i]);
        }
        int comm2[] = new int[Math.max(comm1.length, h3.length)];
        int count2=0;
        int max=0;
       for(int i1=0;i1<h3.length;i1++){
           for(int j1=0;j1<comm1.length;j1++){
               if(h3[i1]==comm1[j1]){
                   
                   if(h3[i1]>max){
                	   max=h3[i1];
                   }
               }
           }
           
       }*/
        
System.out.println(max);
        
    }
    
}
