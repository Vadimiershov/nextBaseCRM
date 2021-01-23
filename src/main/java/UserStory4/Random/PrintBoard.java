package UserStory4.Random;

public class PrintBoard {

    public static void main(String[] args) {

    }
    public static void printGameBoard(char[][] gameBoard) {

        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }


    }
}



