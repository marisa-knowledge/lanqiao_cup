package test;

import java.util.*;
import java.io.*;

public class t3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            month_days[1] = 29;
        }
        int date = 0;
        for(int i = 1 ; i < month ; i++){
            date += month_days[i];
        }
        date += day;
        System.out.println(date);
    }
}
