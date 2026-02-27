import java.util.Scanner;
public class palindrome {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter palindrome: ");
            String test1 = scanner.nextLine();


            System.out.println("\"" + test1 + "\" is palindrome? " + isPalindrome(test1));
        }

        public static boolean isPalindrome(String s) {
            if (s == null) return false;

            int left = 0;
            int right = s.length() - 1;

            while (left < right) {
                char leftChar = s.charAt(left);
                char rightChar = s.charAt(right);

                // Skip non-alphanumeric characters from the left
                if (!Character.isLetterOrDigit(leftChar)) {
                    left++;
                }
                // Skip non-alphanumeric characters from the right
                else if (!Character.isLetterOrDigit(rightChar)) {
                    right--;
                }
                // Compare characters (case-insensitive)
                else {
                    if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                        return false; // Mismatch found
                    }
                    left++;
                    right--;
                }
            }
            return true;
        }
}
