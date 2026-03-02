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

        System.out.println("====================================");
        System.out.println("  PALINDROME CHECKER APP - UC9");
        System.out.println("====================================");

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result)
            System.out.println("\"" + input + "\" is a palindrome.");
        else
            System.out.println("\"" + input + "\" is NOT a palindrome.");

        System.out.println("====================================");

        scanner.close();
    }
}



