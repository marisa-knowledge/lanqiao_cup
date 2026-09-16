package Day1;

import java.util.*;
import java.io.*;

public class char_train1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        StringBuilder final_str = new StringBuilder();
        char ch;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                num++;
            }
        }
        System.out.println(num);
        for (int i = str.length(); i > 0 ; i--){
            final_str.append(str.charAt(i - 1));
        }
        System.out.println(final_str.toString());
    }
}
