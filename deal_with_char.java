import java.util.*;
import java.io.*;


public class deal_with_char {
    static void main() {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();

        int letter = 0, num = 0, space = 0, other = 0;
        for(int i = 0 ; i < str.length(); i++){
            char c = str.charAt(i);
            if(Character.isLetter(c)){
                letter++;
            }else if(Character.isDigit(c)){
                num++;
            }else if(Character.isSpaceChar(c)){
                space++;
            }else{
                other++;
            }
        }
        System.out.println("letter: " + letter);
        System.out.println("num: " + num);
        System.out.println("space: " + space);
        System.out.println("other: " + other);
    }
}
