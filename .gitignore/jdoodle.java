import java.io.*;
import java.util.*;
class GFG {
 
    public static void print2D(int mat[][])
    {
        
        for (int[] row : mat)
 
            
            System.out.println(Arrays.toString(row));
    }
 
    public static void main(String args[])
        throws IOException
    {
        int mat[][] = { { 1, 2, 3 },
                        { 5, 6, 7, },
                        { 9, 10, 11} };
        print2D(mat);
    }
}