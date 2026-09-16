import java.util.*;
import java.io.*;

public class n_of_fib_new {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }

    public static int fib(int n ){
        if(n == 1 || n == 2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}
