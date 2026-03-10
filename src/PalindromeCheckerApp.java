
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("====================================");
            System.out.println("    PALINDROME CHECKER APP - UC4");

            Scanner scanner = new Scanner(System.in);
            Queue<Character> queue = new LinkedList<>();
            Stack<Character> stack = new Stack<>();

            System.out.println("====================================");
            System.out.println("   PALINDROME CHECKER APP - UC6");

            System.out.println("====================================");

            System.out.print("Enter a string to check: ");
            String input = scanner.nextLine();


            char[] chars = input.toCharArray();

            boolean isPalindrome = true;
            int start = 0;
            int end = chars.length - 1;

            while (start < end) {
                if (chars[start] != chars[end]) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }



            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                queue.add(ch);   // FIFO
                stack.push(ch);  // LIFO


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


            while (!queue.isEmpty() && !stack.isEmpty()) {
                if (!queue.remove().equals(stack.pop())) {

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
