public class swapLogic1{
    public static void main(String[] args) {
        // Logic 1 (By using Temp Variable)
        int a = 10, b = 20;
        System.out.println("Before swapping values are: a = " + a + " , b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Values after swapping are: a = " + a + " , b = " + b);
    }
}