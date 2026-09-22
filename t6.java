package test;

import java.util.*;
import java.io.*;

public class t6 {
    static int n,k;
    static int[]path;
    static int count = 0;

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        path = new int[n];
        for(int i = 0; i < n ; i++){
            path[i] = sc.nextInt();
        }
        dfs(0,0,0);
        System.out.println(count);
    }

    static void dfs(int start, int steps, int sum) {
        if(steps == k){
            if(sum % 2 == 0){
                count++;
            }
        }else{
            for(int i = start; i < n; i++){
                dfs(i + 1, steps + 1, sum + path[i]);
            }
        }
    }
}
