public class swapLogic4 {
    public static void main(String[] args) {
        // Logic 4 (By using Bitwise XOR)
        int a = 90, b = 50;
        System.out.println("Before swapping values are: a = " + a + " , b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Values after swapping are: a = " + a + " , b = " + b);
    }
}
