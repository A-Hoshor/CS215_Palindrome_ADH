import java.util.Stack;
	/** 
	 * A class the utilizes a Stack to compare Strings to test for Palindromes
	 * @author Alyssa Hoshor
	 */

public class PalindromeTester {

	private Stack<Character> s = new Stack<>();
	private String original;
	private String string;
	private boolean palindrome;
	private String test;
	
	/**
	 * Creates new Palindrome Tester with specified parameters
	 * @param String s for string to be compared for palindromes
	 */
	public PalindromeTester(String s) {
		original = s;
	}//end preferred argument constructor
	
	/**
	 * Creates new Palindrome Tester.
	 */
	public PalindromeTester() {
		original="";
	}//end empty argument constructor
	
	/**
	 * Tests the current String for palindromes
	 * @return boolean true if a palindrome, false if not.
	 */
	public boolean test() {
		/**
		 * The test will first take the original string and get rid of all
		 * punctuation, spaces, and uppercase. This new string is called string.
		 */
		string =original.toLowerCase();
		string = string.replaceAll("\\p{Punct}", "");
		string = string.replaceAll("\\s", "");
		
		/**
		 * Next, the test will clear the stack, s , and add characters
		 * one at a time to stack.
		 */
		s.clear();
		int i =0;
		while (i<string.length()) {
			char c = string.charAt(i);
			s.push(c);
			i++;
		}//end while
		
		/**
		 * The test now pops, or removes, each character one by one 
		 * to create a new reversed string.
		 */
		StringBuilder t = new StringBuilder();
		int c=0;
		while (c<string.length()) {
			t.append(s.pop());
			c++;
		}//end while
		test = t.toString();
		
		/**  
		 * Now the two strings are compared to see if they 
		 * are palindromes.
		 */
		if (test.equals(string)) {
			palindrome=true;
		}
		else {
			palindrome=false;
		}
		return palindrome;
	}//end test method
	
	/**
	 * The get String method lets the user know what string is currently
	 * being tested by the palindrome tester.
	 * @return String being tested.
	 */
	public String getString() {
		return original;
	}//end getString method
	
	/**
	 * Sets string to be tested by palindrome tester.
	 * @param String s
	 */
	public void setString(String s) {
		original=s;
	}//end setString method
	
	/**
	 * Provides user with input/original String and the results of 
	 * test.
	 * @return String 
	 */
	public String toString() {
		return "Is '" + original + "' a palindrome?: " + test(); 
	}//end toString method
}//end PalindromeTester Class

