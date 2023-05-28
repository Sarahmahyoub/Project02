package Project2;

import java.util.Arrays;

public class E4Anagrams {

   // Check if Two Strings are Anagrams: Given two strings, determine if
   // they are anagrams, meaning they contain the same characters in a
    //different order. For example, "listen" and "silent" are anagrams

    public static void main(String[] args) {

        String word="listen";
        String word2="silent";
        System.out.println("Both strings are anagrams "+Anagrams(word,word2));


    }

    public static boolean Anagrams(String str1, String str2) {

        char []charString1=str1.toCharArray();
        char []charString2=str2.toCharArray();
        Arrays.sort(charString1);
        Arrays.sort(charString2);

       return Arrays.equals(charString1,charString2);

    }

}
