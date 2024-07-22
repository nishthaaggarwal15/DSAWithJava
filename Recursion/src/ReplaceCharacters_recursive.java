/*
Problem statement
Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.

Do this recursively.
 */

import  java.util.Scanner;
public class ReplaceCharacters_recursive {
    public static String replaceCharacter(String input, char c1, char c2) {

        if(input.length()==0){
            return input;
        }
        String small = replaceCharacter(input.substring(1), c1, c2);
        if(input.charAt(0)==c1){
            return c2 + small;
        }
        return input.charAt(0)+ small;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        char c1 = s.next().charAt(0);
        char c2 = s.next().charAt(0);
        System.out.println(replaceCharacter(input, c1, c2));
    }
}
