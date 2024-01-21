import java.util.Scanner;

public class Game {
    private boolean gameRun = true;
    private int rowNumber;
    private int columnNumber;
    public int getRowNumber() {
        return rowNumber;
    }
    public int getColumnNumber() {
        return columnNumber;
    }

    public boolean isGameRun() {
        return gameRun;
    }

    public void setGameRun(boolean gameRun) {
        this.gameRun = false;
    }

    public void stepCross (){
            System.out.println("Введите номер строки в которую вы хотите поставить крестик:");
            Scanner scanner = new Scanner(System.in);
            this.rowNumber = scanner.nextInt();

            System.out.println("Введите номер колонки в которую вы хотите поставить крестик:");
            this.columnNumber = scanner.nextInt();

            if (this.rowNumber > 3 || this.rowNumber < 0 || this.columnNumber > 3 || this.columnNumber < 0 ){
                System.out.println("Введены неверные координаты. Введите номер строки и номер колонки ещё раз:");
                stepCross();
            }
    }
    public void stepZero () {
        System.out.println("Введите номер строки в которую вы хотите поставить нолик:");
        Scanner scanner = new Scanner(System.in);
        this.rowNumber = scanner.nextInt();
        System.out.println("Введите номер колонки в которую вы хотите поставить нолик:");
        this.columnNumber = scanner.nextInt();
        if (this.rowNumber > 3 || this.rowNumber < 0 || this.columnNumber > 3 || this.columnNumber < 0 ){
            System.out.println("Введены неверные координаты. Введите номер строки и номер колонки ещё раз:");
            stepZero();
        }
    }
}
