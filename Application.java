import java.util.Scanner;
public class Application {
		
		public static void main(String[] args) {
			
			PalindromeTester a = new PalindromeTester("racecar!");
			PalindromeTester b = new PalindromeTester("am i a palindrome");
			PalindromeTester c = new PalindromeTester("!!rotator");
			PalindromeTester d = new PalindromeTester("was it a car or a cat i saw");
			
			System.out.println("*****************");
			System.out.println("Palindrome Tests");
			System.out.println("*****************");
			System.out.println(a.toString());
			System.out.println(b.toString());
			System.out.println(c.toString());
			System.out.println(d.toString());
			
			System.out.println("\n\nNow let's test our Set String method!");
			b.setString("Acrobats Stab! Orca");
			System.out.println(b.toString());
			a.setString("mom");
			System.out.println(a.toString());
			a.setString("this ain't it.");
			System.out.println(a.toString());
			
			System.out.println("\nWould you like to try?");
			System.out.println("Enter a phrase or word: ");
			Scanner s=new Scanner(System.in);
			String input= s.nextLine();
			PalindromeTester e = new PalindromeTester(input);
			System.out.println(e.toString());
			s.close();
		}//end main

	}//end Application class