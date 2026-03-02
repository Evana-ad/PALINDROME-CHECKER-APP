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