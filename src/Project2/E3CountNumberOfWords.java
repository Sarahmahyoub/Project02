package Project2;

public class E3CountNumberOfWords {

    //Count the Number of Words in a String: Write a function to count the
    //number of words in a given string. Words are separated by spaces or
    //punctuation. For example, the input "Hello, world!" should return 2.

    public static void main(String[] args) {
        String str="Hello, world!";

        String [] strArr=str.split("[,!]");

        System.out.println(strArr.length);


    }
}
