public class swapLogic5 {
    public static void main(String[] args) {
        // Logic 5 (Single Statement)
        int a = 10, b = 20;
        System.out.println("Before swapping values are: a = " + a + " , b = " + b);
        b = a + b - (a = b);
        System.out.println("Values after swapping are: a = " + a + " , b = " + b);
    }
}
