package UserStory4.Random;

import java.sql.SQLOutput;
import java.util.*;

public class TicTacToe {

    static ArrayList<Integer> playersPositions = new ArrayList<Integer>();
    static ArrayList<Integer> computersPositions = new ArrayList<Integer>();

    public static void main(String[] args) {

        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        PrintBoard.printGameBoard(gameBoard);

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your placement 1 to 9");
            int playerPos = scan.nextInt();

            while (playersPositions.contains(playerPos) || computersPositions.contains(playerPos)) {
                System.out.println("position is taken! Enter correct Position");
                playerPos = scan.nextInt();
            }
            setupGame(gameBoard, playerPos, "HUMAN");

            String result = checkWinner();
            if (result.length() > 0) {
                PrintBoard.printGameBoard(gameBoard);
                System.out.println(result);
                break;
            }
            Random rand = new Random();
            int compPos = rand.nextInt(9) + 1;
            while (playersPositions.contains(compPos) || computersPositions.contains(compPos)) {
                compPos = rand.nextInt(9) + 1;
            }
            setupGame(gameBoard, compPos, "COMPUTER");
            PrintBoard.printGameBoard(gameBoard);
            result = checkWinner();

            if (result.length() > 0) {
                PrintBoard.printGameBoard(gameBoard);
                System.out.println(result);
                break;
            }
        }
    }
    public static void setupGame(char[][] gameBoard, int position, String user) {

        char symbol = ' ';
        if (user.equalsIgnoreCase("human")) {
            symbol = 'X';
            playersPositions.add(position);

        } else if (user.equalsIgnoreCase("computer")) {
            symbol = '0';
            computersPositions.add(position);
        } else {
            System.out.println("Such user doesn't exist");
        }


        switch (position) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                System.out.println("You have selected an invalid number, please enter number from 1 to 9");
                break;
        }
    }
    public static String checkWinner() {

        List topRow = Arrays.asList(1, 2, 3);
        List midpRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List rightCross = Arrays.asList(3, 5, 7);
        List leftCross = Arrays.asList(1, 5, 9);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midpRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(rightCross);
        winning.add(leftCross);

        for (List l : winning) {

            if (playersPositions.containsAll(l)) {
                return "Congratulations you won!";
            } else if (computersPositions.containsAll(l)) {
                return "Don't worry, you will succeed in something else:)";
            } else if (playersPositions.size() + computersPositions.size() == 9) {
                return ("We have two winners");

            }
        }
        return "";
    }
}










