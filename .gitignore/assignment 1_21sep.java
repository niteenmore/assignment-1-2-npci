import java.util.*;
public class execute{
    static void mycheck(int firstvalue,int secondvalue){
        
        if(sqrt(secondvalue) && evencheck(secondvalue)){
            System.out.println("secondvalue is even and perfect square");
        }
        else if((sqrt(secondvalue) == false) && evencheck(secondvalue) == true ){
            System.out.println("second value is not perfect square but even");
            System.out.println("we will get second value after multiplying fist value by:"+ mul(firstvalue,secondvalue));
        
        
    }
     else if(sqrt(secondvalue) == true && evencheck(secondvalue) == false){
         System.out.println("second value is   odd perfect square ");
    }
    
    }
    
    public static boolean sqrt(double x){
        double sq = Math.sqrt(x);
        if((sq - Math.floor(sq)) == 0){
            return(true);
        }
        else{
            return (false);
        }
    }
    static boolean evencheck(int n){
        int check = n % 2;
        if(check == 0){
            return(true);
        }
        else{
            return(false);
        }
    }
     
    static int mul(int x,int y){
        return(y/x);
        
    }
    
         
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the first value ");

        int firstvalue = scanner.nextInt();
        System.out.println("first value is :"+ firstvalue);
        
        System.out.println("\n please enter the second value ");
        int secondvalue = scanner.nextInt();
        mycheck(firstvalue,secondvalue);

        
        
        
    

        
    }
    }
