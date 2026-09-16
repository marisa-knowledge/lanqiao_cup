import java.util.*;
import java.io.*;

public class n_of_Fibonacci {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        int c;
        for(int i = 0;i < n - 1 ; i++){
            c = b;
            b += a;
            a = c;
        }
        System.out.println(a);
    }

}
