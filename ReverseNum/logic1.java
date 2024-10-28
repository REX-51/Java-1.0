package ReverseNum;

public class logic1 {
    public static void main(String[] args) {
        int num = 3567;
        int reverse = 0;
        while (num > 0){
            int remainder = num % 10;
            reverse = reverse * 10 + remainder; // reverse * 10 + num % 10
            num /= 10;
        }
        System.out.println(reverse);
    }
}
