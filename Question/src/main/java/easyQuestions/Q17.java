package easyQuestions;

public class Q17 {
	public static boolean getXO(String str) {
		 str = str.toLowerCase();
	        
	        int countX = 0;
	        int countO = 0;

	        // Count the occurrences of 'x' and 'o'
	        for (char c : str.toCharArray()) {
	            if (c == 'x') {
	                countX++;
	            } else if (c == 'o') {
	                countO++;
	            }
	        }

	        // Return true if counts are equal, otherwise false
	        return countX == countO;
	    }

	    public static void main(String[] args) {
	        // Test cases
	        System.out.println(getXO("ooxx"));      // ➞ true
	        System.out.println(getXO("xooxx"));     // ➞ false
	        System.out.println(getXO("ooxXm"));     // ➞ true
	        System.out.println(getXO("zpzpzpp"));   // ➞ true
	        System.out.println(getXO("zzoo"));      // ➞ false
	    }
	}


