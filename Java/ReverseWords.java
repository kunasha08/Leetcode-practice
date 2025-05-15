package com.pkg.ag2.str;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "My name is Anushka";
        String output = reverseWords(input);
        System.out.println(" Reversed string: " + output);
    }

    public static String reverseWords(String str) {
        // Split the string by spaces
        String[] wordsarr = str.split(" ");
        
        for (String s : wordsarr) {
        	System.out.print(" "+s);
        }

        // Use StringBuilder for efficient string manipulation
        StringBuilder reversed = new StringBuilder();

        // Traverse each word in reverse order and add it to reverse string
        for (int i = wordsarr.length - 1; i >= 0; i--) {
            reversed.append(wordsarr[i]);
            reversed.append(" ");			//adding space after each word
        }

        return reversed.toString();
    }
}

