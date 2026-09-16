import java.util.*;
import java.io.*;

public class jinzhi_conversion {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder two = new StringBuilder();
        int temp = n;
        while (temp > 0){
            two.append(temp % 2);
            temp = temp /2;
        }
        System.out.println(two.reverse().toString());

        StringBuilder hex = new StringBuilder();
        char[] hexTable = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        temp = n;
        while (temp > 0){
            hex.append(hexTable[temp % 16]);
            temp = temp /16;
        }
        System.out.println(hex.reverse().toString());
    }
}
