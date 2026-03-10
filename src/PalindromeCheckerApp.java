<<<<<<< HEAD




import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;
<<<<<<< HEAD
import java.util.Stack;

=======
import java.util.*;

public class PalindromeCheckerApp {

    public static boolean arrayMethod(String input) {
        char[] arr = input.toCharArray();
        int start = 0, end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end])
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean stackMethod(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray())
            stack.push(c);
        for (char c : input.toCharArray())
            if (c != stack.pop())
                return false;
        return true;
    }

    public static boolean dequeMethod(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray())
            deque.addLast(c);
        while (deque.size() > 1)
            if (deque.removeFirst() != deque.removeLast())
                return false;
        return true;
    }

    public static void main(String[] args) {
>>>>>>> origin/feature/UC13

class PalindromeChecker {

<<<<<<< HEAD
    public boolean checkPalindrome(String input) {
=======
        System.out.println("====================================");
        System.out.println(" PALINDROME CHECKER APP - UC13");
        System.out.println(" Performance Comparison");
        System.out.println("====================================");

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();
>>>>>>> origin/feature/UC13

        long startTime, endTime;

<<<<<<< HEAD
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return input.equals(reversed);
    }
}


public class PalindromeCheckerApp {
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }




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
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return isPalindrome(str, start + 1, end - 1);
    }



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




        System.out.println("====================================");
        System.out.println("  PALINDROME CHECKER APP - UC8");
        System.out.println("====================================");

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        if (input.length() == 0) {
            System.out.println("Empty string is a palindrome.");
            return;
        }


        Node head = new Node(input.charAt(0));
        Node current = head;

        for (int i = 1; i < input.length(); i++) {
            current.next = new Node(input.charAt(i));
            current = current.next;
        }


        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null;
        Node nextNode;

        while (slow != null) {
            nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }
        Node firstHalf = head;
        Node secondHalf = prev;
        boolean isPalindrome = true;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("====================================");

        System.out.println("  PALINDROME CHECKER APP - UC9");

        System.out.println("  PALINDROME CHECKER APP - UC10");

        System.out.println("====================================");

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();


        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result)
            System.out.println("\"" + input + "\" is a palindrome.");
        else
            System.out.println("\"" + input + "\" is NOT a palindrome.");

        System.out.println("====================================");

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome)
            System.out.println("\"" + input + "\" is a palindrome (ignoring spaces and case).");
        else
            System.out.println("\"" + input + "\" is NOT a palindrome (ignoring spaces and case).");

        System.out.println("=== UC11: Object-Oriented Palindrome Service ===");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }
=======
        startTime = System.nanoTime();
        boolean result1 = arrayMethod(input);
        endTime = System.nanoTime();
        long arrayTime = endTime - startTime;

        startTime = System.nanoTime();
        boolean result2 = stackMethod(input);
        endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        startTime = System.nanoTime();
        boolean result3 = dequeMethod(input);
        endTime = System.nanoTime();
        long dequeTime = endTime - startTime;

        System.out.println("\nResults:");
        System.out.println("Array Method Result : " + result1 + " | Time: " + arrayTime + " ns");
        System.out.println("Stack Method Result : " + result2 + " | Time: " + stackTime + " ns");
        System.out.println("Deque Method Result : " + result3 + " | Time: " + dequeTime + " ns");

        System.out.println("====================================");
>>>>>>> origin/feature/UC13


        System.out.println("====================================");


        System.out.println("====================================");
        scanner.close();
    }

    }

    }
}



import java.util.*;

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray())
            stack.push(c);


        for (char c : input.toCharArray())
            if (c != stack.pop())
                return false;

        return true;
    }
}





    }
}


class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray())
            deque.addLast(c);

        while (deque.size() > 1)
            if (deque.removeFirst() != deque.removeLast())
                return false;

        return true;
    }
}

public class PalindromeCheckerApp{
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("====================================");
    System.out.println("  PALINDROME CHECKER APP - UC12");
    System.out.println("====================================");

    System.out.println("Choose Strategy:");
    System.out.println("1. Stack Strategy");
    System.out.println("2. Deque Strategy");
    System.out.print("Enter choice: ");

    int choice = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter a string to check: ");
    String input = scanner.nextLine();

    PalindromeStrategy strategy;

    if (choice == 1)
        strategy = new StackStrategy();
    else
        strategy = new DequeStrategy();

    boolean result = strategy.check(input);

    if (result)
        System.out.println("\"" + input + "\" is a palindrome.");
    else
        System.out.println("\"" + input + "\" is NOT a palindrome.");

    System.out.println("====================================");

    scanner.close();
}

}

