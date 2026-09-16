import java.util.*;
import java.io.*;


public class date_Calculate {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] LmonthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            monthDays = LmonthDays;
        }
        int sum = 0;
        for(int i = 1; i < month; i++){
            sum += monthDays[i];
        }
        System.out.println(sum + day);
    }
}
