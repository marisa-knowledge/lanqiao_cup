package test;

import java.util.*;
import java.io.*;

public class t2 {
    static void main(String[] args) {
        int space = 0;
        int letter = 0;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = 0 ; i < s.length() ; i++){
            if(Character.isLetter(s.charAt(i))){
                letter++;
            }else if(Character.isDigit(s.charAt(i))){
                num++;
            }else if(Character.isSpaceChar(s.charAt(i))){
                space++;
            }
        }
        System.out.println("letter: " + letter + " num: " + num + " space: " + space);
    }
}
