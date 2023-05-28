package Project2;

public class E2Palindrome {

    //Check if a String is Project2.Palindrome: Determine whether a given string is
    //a palindrome, which means it reads the same forwards and
    //backward. For example, "madam" is a palindrome.

    public static void main(String[] args) {

        String givenString ="madam";

        String reverseStr = "";

        int strLength = givenString.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + givenString.charAt(i);
        }

        if (givenString.equalsIgnoreCase(reverseStr)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }


    }

