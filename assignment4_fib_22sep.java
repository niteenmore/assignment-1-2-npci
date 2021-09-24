import java.util.*;
import java.io.*;

 public class fib{
     
        
         
         
         static int count = 0;
         static int num1 = 0;
         static int num2 = 1;
         public static void callme(int N){
               
             
             
             while(count < N && count%2 == 0){
             System.out.println(num1 +"");
             int num3 = num1 + num2;
             
             num1 = num2;
             num2 = num3;
             count++;
             
         }  
             
         }
         public static void readme(int N){
             
             
             
             while (count < N && count%2 != 0){
                 System.out.println(num1 +"");
                 int num3 = num1 + num2;
             
                  num1 = num2;
                  num2 = num3;
                  count++;
                 
             }
         }
         
         public static void main(String[] args){
             int N = 10;
             for(int i =0;i < N;i++){
                 if(i%2 == 0){
                     callme(N);
                 }
                 else if(i%2 != 0){
                    readme(N);
                 }
                 
             }
         }
         
         
     }
    
    
    
    
    
    
