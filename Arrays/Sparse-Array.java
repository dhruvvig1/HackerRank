import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] st=new String[n];
        for(int i=0;i<n;i++){
            st[i]=sc.next();
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            String query=sc.next();
            int count=0;
            for(int j=0;j<n;j++){
                if(st[j].equals(query)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}