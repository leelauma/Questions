package easyQuestions;
import java.util.Scanner;

public class Q19 {
	public static String removeVowels(String str) {
		String vowels = "aeiouAEIOU";
        String result = ""; // Initialize an empty string to hold the result

        // Traditional for loop to iterate through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the character at the current index
            // If the character is not a vowel, append it to the result
            if (vowels.indexOf(ch) == -1) {
                result += ch; // Concatenate the character
            }
        }

        return result; // Return the resulting string
    }
	public static void main(String [] args) {
		 System.out.println(removeVowels("I have never seen a thin person drinking Diet Coke."));
	}
	}

