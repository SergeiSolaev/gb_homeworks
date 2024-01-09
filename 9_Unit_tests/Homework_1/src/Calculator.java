public class Calculator {
    public static double calculateDiscount(double purchaseAmmount, double discountAmmount){
        if (purchaseAmmount <=0)
            throw new ArithmeticException("Цена товара не может быть меньше либо равна 0");
        if (discountAmmount < 0)
            throw new ArithmeticException("Скидка не может быть меньше 0");
        if (discountAmmount > 100)
            throw new ArithmeticException("Скидка не может быть больше  100");

        return purchaseAmmount - purchaseAmmount*(discountAmmount /100);
    }
}
