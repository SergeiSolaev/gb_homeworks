//sum(xi-Mi)(yi-My)/sqrt(sum(xi-Mi)^2(yi-My)^2)  формула корреляции Пирсона
public class Main {
    public static void main(String[] args) {
        int[] numbersX = new int []{1,2,3};
        int[] numbersY = new int []{1,2,3};
        double pearsonCorrelation = numerator(numbersX, numbersY, findAverage(numbersX),findAverage(numbersY))
                /denominator(numbersX, numbersY, findAverage(numbersX),findAverage(numbersY));
        System.out.printf("Корреляция Пирсона: " + "%.2f%n", pearsonCorrelation);
    }

    //Ищем среднее значение всех чисел массива
    public static double findAverage(int [] numbers) {
        int sum = 0;
        double avg;
        for (int i : numbers) {
            sum = sum + i;
        }
        avg =  (double) sum /numbers.length;
        return avg;

    }

    //Считаем числитель
    public static double numerator(int[] arrayX, int [] arrayY, double avgX, double avgY){
        double[] numerator = new double[arrayX.length];
        double sum = 0;
        for (int i = 0; i < arrayX.length; i++) {
            numerator[i] = (arrayX[i] - avgX)*(arrayY[i] - avgY);
        }
        for (double i : numerator) {
            sum = sum + i;
        }
        return sum;
    }

    //Считаем знаменатель
    public static double denominator(int[] arrayX, int [] arrayY, double avgX, double avgY){
        double[] numerator = new double[arrayX.length];
        double sum = 0;
        for (int i = 0; i < arrayX.length; i++) {
            numerator[i] = ((arrayX[i] - avgX)*(arrayX[i] - avgX))*((arrayY[i] - avgY)*(arrayY[i] - avgY));
        }
        for (double i : numerator) {
            sum = sum + i;
        }
        return Math.sqrt(sum);
    }
}