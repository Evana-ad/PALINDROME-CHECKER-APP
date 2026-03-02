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

        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println(" PALINDROME CHECKER APP - UC13");
        System.out.println(" Performance Comparison");
        System.out.println("====================================");

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        long startTime, endTime;

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

        scanner.close();
    }
}