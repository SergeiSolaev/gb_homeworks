import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int i = getRandomNumber();
        //System.out.println(i);
        int n = getMSB(i);
        //System.out.println(n);
        int[] m1;
        m1 = getMaxNumber(i, n);
        int[] m2;
        m2 = getMinNumber(i, n);
    }

    public static int getRandomNumber() {         // Метод для получения случайного числа в заданном диапазоне
        Random rand = new Random();
        int i = rand.nextInt(2001);
        return i;
    }

    public static int getMSB(int n){             // Метод для определения номера старшего бита
        String binary = Integer.toBinaryString(n);
        //System.out.println(binary);
        int index1 = binary.indexOf("1");
        int msb = binary.length() - index1;
        return msb;
    }

    public static int[] getMaxNumber(int i, int n){    //Метод для поиска кратных n чисел в диапазоне
        int arrLength = 0;                             //от i до Short.MAX_VALUE
        for (int j = i; j >= i & j < 32768; j++) {
            if (j%n == 0) {
                arrLength++;
            }
            else {

            }
        }
        //System.out.println(arrLength);
        int[] m1;
        m1 = new int[arrLength];
        int index = 0;
        for (int j = i; j >= i & j < 32768; j++) {
            if (j%n == 0) {
                m1[index] = j;
                //System.out.println(m1[index]);
                index++;
            }
            else {

            }
        }
        return m1;
    }

    public static int[] getMinNumber(int i, int n){       //Метод для поиска некратных n чисел в диапазоне
        int arrLength = 0;                                //от Short.MIN_VALUE до i
        for (int j = -32768; j > -32769 & j <=i; j++) {
            if (j%n != 0) {
                arrLength++;
            }
            else {

            }
        }
        //System.out.println(arrLength);
        int[] m2;
        m2 = new int[arrLength];
        int index = 0;
        for (int j = -32768; j > -32769 & j <=i; j++) {
            if (j%n != 0) {
                m2[index] = j;
                //System.out.println(m2[index]);
                index++;
            }
            else {

            }
        }
        return m2;
    }

}
