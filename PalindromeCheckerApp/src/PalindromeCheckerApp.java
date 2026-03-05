import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("WELCOME TO PALINDROME CHECKER APP MANAGEMENT SYSTEM");
        System.out.println("version:6.0");
        System.out.println("System instanced successful");
        System.out.println();

        String Palindrome = "racecar";
        boolean flag=true;
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for(int i=0;i<Palindrome.length();i++)
        {
            stack.push(Palindrome.charAt(i));
            queue.add(Palindrome.charAt(i));
        }

        for(int i=0;i<Palindrome.length();i++)
        {
            char chs = stack.pop();
            char chq = queue.remove();

            if(Palindrome.charAt(i)!=chs && Palindrome.charAt(i)!=chq)
            {
                flag = false;
            }
        }

        if (flag)  System.out.println("The string " + Palindrome + " is a palindrome.");
        else System.out.println("The string " + Palindrome + " is not a palindrome .");
    }
}


