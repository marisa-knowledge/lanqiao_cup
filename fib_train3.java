package Day1;

import java.util.*;
import java.io.*;


public class fib_train3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }

    static int fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fib(n-1) +fib(n-2);
    }
}
