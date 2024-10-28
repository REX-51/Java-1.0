public class swapLogic3 {
        public static void main(String[] args) {
            // Logic 3 (By using * and / wihtout using third variable.)
            int a = 90, b = 70;
            System.out.println("Before swapping values are: a = " + a + " , b = " + b);
            a = a * b;
            b = a / b;
            a = a / b;
            System.out.println("Values after swapping are: a = " + a + " , b = " + b);
        }
}
