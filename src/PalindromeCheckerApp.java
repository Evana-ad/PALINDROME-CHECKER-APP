
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class PalindromeCheckerApp {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Deque<Character> deque = new ArrayDeque<>();

            System.out.println("====================================");
            System.out.println("  PALINDROME CHECKER APP - UC7");
            System.out.println("====================================");

            System.out.print("Enter a string to check: ");
            String input = scanner.nextLine();


            for (int i = 0; i < input.length(); i++) {
                deque.addLast(input.charAt(i));
            }

            boolean isPalindrome = true;


            while (deque.size() > 1) {
                char front = deque.removeFirst();
                char rear = deque.removeLast();

                if (front != rear) {
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