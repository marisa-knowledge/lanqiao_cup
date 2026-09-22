package Day2_Day3_Day4;

import java.util.*;

public class dfs_combo {

    static int n,r;
    static int[] path;
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        path = new int[r];
        dfs(1,0);
    }

    static void dfs(int start , int steps) {
        if(steps == r){
            for(int i = 0; i < r ; i++){
                System.out.printf("%3d",path[i]);
            }
            System.out.println(" ");
            return;
        }else{
            for(int i = start; i <= n ; i++){
                path[steps] = i;
                dfs(i + 1, steps + 1);
                }
            }
        }
    }

