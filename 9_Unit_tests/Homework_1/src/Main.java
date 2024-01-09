import static org.junit.Assert.*;

public class Main {
    public static void main(String[] args) {
        Test.test();
        System.out.println("Ваша скидка : " + Calculator.calculateDiscount(100,34));
    }

}