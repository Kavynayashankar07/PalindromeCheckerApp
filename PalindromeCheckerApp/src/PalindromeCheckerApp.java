import java.util.Stack;

public class PalindromeCheckerApp {
    System.out.println("WELCOME TO PALINDROME CHECKER APP MANAGEMENT SYSTEM");
        System.out.println("Version: 9.0");
        System.out.println("System instantiated successfully");
        System.out.println();

    String input = "A man, a plan, a canal: Panama";

    // Normalize the string
    String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

    boolean isPalindrome = true;

    int left = 0;
    int right = normalized.length() - 1;

        while (left < right) {

        if (normalized.charAt(left) != normalized.charAt(right)) {
            isPalindrome = false;
            break;
        }

        left++;
        right--;
    }

        if (isPalindrome) {
        System.out.println("The string is a normalized palindrome.");
    } else {
        System.out.println("The string is not a normalized palindrome.");
    }
    }
}


