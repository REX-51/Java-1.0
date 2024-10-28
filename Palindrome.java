public class Palindrome {
    public static void main(String[] args) {
        int num = 23432;
        int reverse = 0;
        while (num > 0) {
            // int remainder = num % 10;
            reverse = reverse * 10 + num % 10;
            num /= 10;
            if (num == reverse) {
                System.out.println("Palindrome");
            }
            else {
                System.out.println("Not a palindrome");
            }
        }
        // System.out.println(reverse);

    }
}
