package test;

import java.util.*;
import java.io.*;

public class t4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        String s ;
        while(n > 0){
            sb.append(n % 7);
            n /= 7;
        }
        System.out.println(sb.reverse().toString());
    }
}
