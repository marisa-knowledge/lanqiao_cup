package test;

import java.util.*;
import java.io.*;

public class t1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[]a = new int [n];
        int[]presum = new int [n + 1];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            presum[i + 1] = presum[i] + a[i];
        }
        for(int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(presum[r + 1] - presum[l]);
        }
    }

}
