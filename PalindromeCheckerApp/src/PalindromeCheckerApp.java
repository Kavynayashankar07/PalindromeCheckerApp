public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "madam";
        boolean isPalindrome = true;
        int n = word.length() - 1;
        for (int i = 0; i < word.length() / 2; i++) {
            if(word.charAt(i) != word.charAt(n - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Is it a Palindrome? : true");
        } else {
            System.out.println("Is it a Palindrome? : False");
        }
    }
}


