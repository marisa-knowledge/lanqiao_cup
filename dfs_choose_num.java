package Day2_Day3_Day4;

import java.util.*;

public class dfs_choose_num {
    static int n,k;
    static int[] num;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        num = new int[n];
        for(int i = 0 ; i < n ; i++){
            num[i] = sc.nextInt();
        }
        dfs(0,0,0);
        System.out.println(count);
    }

    public static void dfs(int start , int steps,int sum) {
        boolean isPrime;
        if( k == steps){
            if(isPrime(sum)){
                count++;
            }

        }else{
            for(int i = start; i < n ; i++){
                dfs(i + 1,steps + 1,sum + num[i]);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
