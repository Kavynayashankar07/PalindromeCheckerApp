public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "madam";
        String reversed = "";
        boolean isPalindrome = true;
        int n = word.length();
        for (int i = n - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        if (word.equals(reversed)) {
                System.out.println("Is it a Palindrome? : true");
            } else {
                System.out.println("Is it a Palindrome? : False");
            }
        }
    }



