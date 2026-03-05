import java.util.Stack;

public class PalindromeCheckerApp {
    System.out.println("WELCOME TO PALINDROME CHECKER APP MANAGEMENT SYSTEM");
        System.out.println("Version: 8.0");
        System.out.println("System instantiated successfully");
        System.out.println();

    String input = "refer";

    // Create LinkedList
    LinkedList<Character> list = new LinkedList<>();

    // Add characters to LinkedList
        for (char c : input.toCharArray()) {
        list.add(c);
    }

    boolean isPalindrome = true;

    // Compare first and last characters
        while (list.size() > 1) {
        char first = list.removeFirst();
        char last = list.removeLast();

        if (first != last) {
            isPalindrome = false;
            break;
        }
    }

    // Print result
        if (isPalindrome) {
        System.out.println(input + " is a palindrome.");
    } else {
        System.out.println(input + " is not a palindrome.");
    }
    }
}


