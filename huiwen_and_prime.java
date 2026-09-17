package Day2;

import java.util.*;

public class huiwen_and_prime {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        for (int i = left; i <= right; i++) {
            if (i % 2 == 0) {
                continue;
            }
            int w = i,s = 0;
            while (w != 0){
                s = s * 10 + w % 10;
                w /= 10;
            }
            if(s != i){
                continue;
            }
            boolean is_prime = true;
            for (int j = 2; j * j < i; j++) {
                if(i % j == 0){
                    is_prime = false;
                    break;
                }
            }
            System.out.println(i);
        }
    }
}
