import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp {

    public static void main(String[] args) {



                Scanner scanner = new Scanner(System.in);
                Stack<Character> stack = new Stack<>();

                System.out.println("====================================");
                System.out.println("    PALINDROME CHECKER APP - UC5");
                System.out.println("====================================");

                System.out.print("Enter a string to check: ");
                String input = scanner.nextLine();


                for (int i = 0; i < input.length(); i++) {
                    stack.push(input.charAt(i));
                }

                boolean isPalindrome = true;

                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) != stack.pop()) {
                        isPalindrome = false;
                        break;
                    }
                }

                if (isPalindrome) {
                    System.out.println("\"" + input + "\" is a palindrome.");
                } else {
                    System.out.println("\"" + input + "\" is NOT a palindrome.");
                }

                System.out.println("====================================");
                scanner.close();

    }
}