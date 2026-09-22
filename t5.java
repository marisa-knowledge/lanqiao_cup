package test;

import java.util.*;
import java.io.*;


public class t5 {
    static int n;
    static int[] path;
    static boolean[] vis;

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        path = new int[n];
        vis = new boolean[n + 1];
        dfs(0);
    }

    static void dfs(int j) {
        if(j == n){
            for(int i = 0; i < n; i++) {
                System.out.print(path[i] + " ");
            }
            System.out.println();
        }else{
            for(int i  = 1; i <= n; i++){
                if(vis[i] == false){
                    path[j] = i;
                    vis[i] = true;
                    dfs(j + 1);
                    vis[i] = false;
                }
            }
        }
    }
}
