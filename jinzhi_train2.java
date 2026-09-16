package Day1;

import java.io.*;
import java.util.*;

public class jinzhi_train2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        StringBuilder seven = new StringBuilder();
        int temp = n;
        String[] seventable = {"0","1","2","3","4","5","6"};
        if(n == 0 ){
            System.out.println("0");
        }
        while(temp > 0){
            seven.append(seventable[temp % 7]);
            temp /= 7;
        }
        System.out.println(seven.reverse().toString());

        StringBuilder eight = new StringBuilder();
        temp = n;
        String[] eighttable = {"0","1","2","3","4","5","6","7"};
        while(temp > 0){
            eight.append(eighttable[temp % 8]);
            temp /= 8;
        }
        System.out.println(eight.reverse().toString());
    }
}
