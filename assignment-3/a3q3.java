import java.util.*;
class a3q3 { 
    static int fib(int n) 
    { 
        if (n <= 1) 
            return n; 
        return fib(n - 1) + fib(n - 2); 
    } 
  
    public static void main(String args[]) 
    { 
        Scanner obj = new Scanner(System.in);
         int n = obj.nextInt();
        System.out.println(fib(n)); 
    } 
} 