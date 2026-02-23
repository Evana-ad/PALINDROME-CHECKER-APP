import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;
public class PalindromeCheckerApp {

    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            Queue<Character> queue = new LinkedList<>();
            Stack<Character> stack = new Stack<>();

            System.out.println("====================================");
            System.out.println("   PALINDROME CHECKER APP - UC6");
            System.out.println("====================================");

            System.out.print("Enter a string to check: ");
            String input = scanner.nextLine();


            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                queue.add(ch);   // FIFO
                stack.push(ch);  // LIFO
            }

            boolean isPalindrome = true;


            while (!queue.isEmpty() && !stack.isEmpty()) {
                if (!queue.remove().equals(stack.pop())) {
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
