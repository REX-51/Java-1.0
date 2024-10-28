package ReverseString;

public class Logic2 {
    public static void main(String[] args) {
        // Logic 2 (Using Character Array)
        String str = "ABCD";
        String reverse = "";
        char a[] = str.toCharArray(); // ye characters ka array bana dega of a given input string.

        int length = str.length(); // 4

        for (int i = length - 1; i >= 0; i--) // 3 2 1 0, after 0 conditon becomes false.
        {
            reverse = reverse + a[i];  // intially i is 3 therfore a[3] is D
        }

        System.out.println(reverse);
    }
}
