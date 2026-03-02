import java.util.Scanner;
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("  PALINDROME CHECKER APP - UC10");
        System.out.println("====================================");

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

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

        System.out.println("====================================");

        scanner.close();
    }
}


