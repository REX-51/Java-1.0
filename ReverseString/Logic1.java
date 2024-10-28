package ReverseString;


public class Logic1 {
    public static void main(String[] args) {

        // Logic 1 (Using Concatenation Operator)......................

        String str = "ABCD";
        String reverse = "";

        int length = str.length();  // 4

        for (int i = length-1; i >= 0; i--) // 3 2 1 0 after 0 condition will be false.
        {
            reverse = reverse + str.charAt(i); // null + (initially i is 3)
        }
        
        System.out.println(reverse);
    }
}
