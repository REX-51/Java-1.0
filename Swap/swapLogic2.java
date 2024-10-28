public class swapLogic2 {
    public static void main(String[] args) {

        // Logic 2 (By using + and - without using third variable.)
        int a = 50, b = 89;
        System.out.println("Before swapping values are: a = " + a + " , b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Values after swapping are: a = " + a + " , b = " + b);
    }
}
