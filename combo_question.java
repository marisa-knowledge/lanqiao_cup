package Day2;
import java.util.*;
import java.io.*;

public class combo_question {
    static int n;
    static int k;
    static int[] nums;
    static int[] path;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        path = new int[k];
        nums = new int[n];
        for(int i = 0;i < n ; i++){
            nums[i] = sc.nextInt();
        }
        dfs(0,0);
    }


    static void dfs(int start_Index, int step){
        if(step == k){
            int sum = 0;
            for(int i = 0; i < k; i++){
                sum += path[i];
            }
            System.out.print(sum + " ");
        }else{
            for(int i = start_Index; i < n ; i++){
                path[step] = nums[i];
                dfs(i + 1, step + 1);
            }
        }
    }
}


