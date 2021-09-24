 import java.util.*;
 public class ass3{
     public static void main(String[] args){
         
     
     
 
 
 
 
 Scanner input = new Scanner (System.in);
          if (input.hasNextInt()) {
              int a = input.nextInt();
              System.out.println("This input is of type Integer."+a);
          }   
                   
          else if (input.hasNextLong())
            System.out.println("This input is of type Long.");
       
          else if (input.hasNextFloat())
          System.out.println("This input is of type Float.");
          
          else if (input.hasNextDouble()) 
          System.out.println("This input is of type Double."); 
           
          else if (input.hasNextBoolean())
           System.out.println("This input is of type Boolean.");  
          
          else if (input.hasNextLine())
              System.out.println("This input is of type string."); 
}
}