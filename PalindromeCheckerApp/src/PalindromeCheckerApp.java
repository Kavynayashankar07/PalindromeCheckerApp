public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "kavy";
        String reversed = "";
        int n = word.length();
        for (int i = n - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        if (word.equals(reversed)) {
            System.out.println(reversed + " is a palindrome");
        } else {
            System.out.println(reversed + " is not a palindrome");
        }
    }
}



