import java.util.*;
public class nm{
    public static void reqF(int x){
        String str = Integer.toString(x);
        int m = str.length();
          if(m % 3 == 0 && m %2 != 0){
              System.out.println(m);
              System.out.println(m*m*m);
          }
           if(m %2 == 0){
                System.out.println(m);
                System.out.println(m*m);
           }
           if(m % 2 == 1 && m %3 != 0){
                System.out.println(m);
                System.out.println(m-1);
                System.out.println((m-1) *(m-1));
           }
            if(m % 2 == 0 && m%3 == 0 ){
                 System.out.println(m);
                 System.out.println(m*m);
            }
    }
                 
           
    
    
     
    

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter an integer");
    int integer = sc.nextInt();
    System.out.println("you have  entered :" +integer);
    reqF(integer);

    



    
}

}