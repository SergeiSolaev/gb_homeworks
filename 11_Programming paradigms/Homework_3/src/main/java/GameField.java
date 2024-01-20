public class GameField {
    private String[][] field = new String[][]{{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};

    public void printField() {
        System.out.println("| " + field[0][0] + " | " + field[0][1] + " | " + field[0][2] + " |");
        System.out.println("| " + field[1][0] + " | " + field[1][1] + " | " + field[1][2] + " |");
        System.out.println("| " + field[2][0] + " | " + field[2][1] + " | " + field[2][2] + " |");
    }

    public String getFieldElement(int rowNumbers, int columnNumbers) {
        return field[rowNumbers-1][columnNumbers-1];
    }

    public void setCross(int rowNumbers, int columnNumbers) {
        field[rowNumbers-1][columnNumbers-1] = "X";
    }
    public void setZero(int rowNumbers, int columnNumbers) {
        field[rowNumbers-1][columnNumbers-1] = "0";
    }
}