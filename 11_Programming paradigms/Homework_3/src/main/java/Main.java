import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        GameRules rules = new GameRules();
        GameField field = new GameField();
        Game game = new Game();
        rules.printRules();
        field.printField();
        while (game.isGameRun()){
            game.stepCross();
            while(((Objects.equals(field.getFieldElement(game.getRowNumber(), game.getColumnNumber()), "X")
                    || (Objects.equals(field.getFieldElement(game.getRowNumber(), game.getColumnNumber()), "0"))))) {
                System.out.println("Место занято! Попробуйте ещё раз.");
                field.printField();
                game.stepCross();
            }
            field.setCross(game.getRowNumber(), game.getColumnNumber());
            field.printField();

            if(((Objects.equals(field.getFieldElement(1, 1), "X")
                    && (Objects.equals(field.getFieldElement(1, 2), "X")
                    && (Objects.equals(field.getFieldElement(1, 3), "X")))))) {
                System.out.println("Крестики выиграли! Поздравляем!");
                game.setGameRun(false);
                break;
            }

            if(((Objects.equals(field.getFieldElement(2, 1), "X")
                    && (Objects.equals(field.getFieldElement(2, 2), "X")
                    && (Objects.equals(field.getFieldElement(2, 3), "X")))))) {
                System.out.println("Крестики выиграли! Поздравляем!");
                game.setGameRun(false);
                break;
            }

            if(((Objects.equals(field.getFieldElement(3, 1), "X")
                    && (Objects.equals(field.getFieldElement(3, 2), "X")
                    && (Objects.equals(field.getFieldElement(3, 3), "X")))))) {
                System.out.println("Крестики выиграли! Поздравляем!");
                game.setGameRun(false);
                break;
            }

            if(((Objects.equals(field.getFieldElement(1, 1), "X")
                    && (Objects.equals(field.getFieldElement(2, 1), "X")
                    && (Objects.equals(field.getFieldElement(3, 1), "X")))))) {
                System.out.println("Крестики выиграли! Поздравляем!");
                game.setGameRun(false);
                break;
            }

            if(((Objects.equals(field.getFieldElement(1, 2), "X")
                    && (Objects.equals(field.getFieldElement(2, 2), "X")
                    && (Objects.equals(field.getFieldElement(3, 2), "X")))))) {
                System.out.println("Крестики выиграли! Поздравляем!");
                game.setGameRun(false);
                break;
            }

            if(((Objects.equals(field.getFieldElement(1, 3), "X")
                    && (Objects.equals(field.getFieldElement(2, 3), "X")
                    && (Objects.equals(field.getFieldElement(3, 3), "X")))))) {
                System.out.println("Крестики выиграли! Поздравляем!");
                game.setGameRun(false);
                break;
            }

            if(((Objects.equals(field.getFieldElement(1, 1), "X")
                    && (Objects.equals(field.getFieldElement(2, 2), "X")
                    && (Objects.equals(field.getFieldElement(3, 3), "X")))))) {
                System.out.println("Крестики выиграли! Поздравляем!");
                game.setGameRun(false);
                break;
            }

            if(((Objects.equals(field.getFieldElement(1, 3), "X")
                    && (Objects.equals(field.getFieldElement(2, 2), "X")
                    && (Objects.equals(field.getFieldElement(3, 1), "X")))))) {
                System.out.println("Крестики выиграли! Поздравляем!");
                game.setGameRun(false);
                break;
            }

            game.stepZero();
            while(((Objects.equals(field.getFieldElement(game.getRowNumber(), game.getColumnNumber()), "X")
                    || (Objects.equals(field.getFieldElement(game.getRowNumber(), game.getColumnNumber()), "0"))))) {
                System.out.println("Место занято! Попробуйте ещё раз.");
                field.printField();
                game.stepZero();
            }
            field.setZero(game.getRowNumber(), game.getColumnNumber());
            field.printField();

            if(((Objects.equals(field.getFieldElement(1, 1), "0")
                    && (Objects.equals(field.getFieldElement(1, 2), "0")
                    && (Objects.equals(field.getFieldElement(1, 3), "0")))))) {
                System.out.println("Нолики выиграли! Поздравляем!");
                game.setGameRun(false);
                break;
            }

            if(((Objects.equals(field.getFieldElement(2, 1), "0")
                    && (Objects.equals(field.getFieldElement(2, 2), "0")
                    && (Objects.equals(field.getFieldElement(2, 3), "0")))))) {
                System.out.println("Нолики выиграли! Поздравляем!");
                game.setGameRun(false);
                break;
            }

            if(((Objects.equals(field.getFieldElement(3, 1), "0")
                    && (Objects.equals(field.getFieldElement(3, 2), "0")
                    && (Objects.equals(field.getFieldElement(3, 3), "0")))))) {
                System.out.println("Нолики выиграли! Поздравляем!");
                game.setGameRun(false);
                break;
            }

            if(((Objects.equals(field.getFieldElement(1, 1), "0")
                    && (Objects.equals(field.getFieldElement(2, 1), "0")
                    && (Objects.equals(field.getFieldElement(3, 1), "0")))))) {
                System.out.println("Нолики выиграли! Поздравляем!");
                game.setGameRun(false);
                break;
            }

            if(((Objects.equals(field.getFieldElement(1, 2), "0")
                    && (Objects.equals(field.getFieldElement(2, 2), "0")
                    && (Objects.equals(field.getFieldElement(3, 2), "0")))))) {
                System.out.println("Нолики выиграли! Поздравляем!");
                game.setGameRun(false);
                break;
            }

            if(((Objects.equals(field.getFieldElement(1, 3), "0")
                    && (Objects.equals(field.getFieldElement(2, 3), "0")
                    && (Objects.equals(field.getFieldElement(3, 3), "0")))))) {
                System.out.println("Нолики выиграли! Поздравляем!");
                game.setGameRun(false);
                break;
            }

            if(((Objects.equals(field.getFieldElement(1, 1), "0")
                    && (Objects.equals(field.getFieldElement(2, 2), "0")
                    && (Objects.equals(field.getFieldElement(3, 3), "0")))))) {
                System.out.println("Нолики выиграли! Поздравляем!");
                game.setGameRun(false);
                break;
            }

            if(((Objects.equals(field.getFieldElement(1, 3), "0")
                    && (Objects.equals(field.getFieldElement(2, 2), "0")
                    && (Objects.equals(field.getFieldElement(3, 1), "0")))))) {
                System.out.println("Нолики выиграли! Поздравляем!");
                game.setGameRun(false);
                break;
            }
        }
    }
}
