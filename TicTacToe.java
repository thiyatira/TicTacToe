import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static char[][] board = new char[3][3];

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {

        initializeBoard();
        tossAndAssignSymbols();
        displayTossResult();
        printBoard();

        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    static void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    static void tossAndAssignSymbols() {
        Random random = new Random();
        int toss = random.nextInt(2);

        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    static void displayTossResult() {
        if (isHumanTurn) {
            System.out.println("You won the toss!");
            System.out.println("You play first.");
        } else {
            System.out.println("Computer won the toss!");
            System.out.println("Computer plays first.");
        }

        System.out.println("Your symbol: " + humanSymbol);
        System.out.println("Computer symbol: " + computerSymbol);
        System.out.println();
    }

    static void printBoard() {
        System.out.println("-------------");

        for (int row = 0; row < 3; row++) {
            System.out.print("| ");

            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }

            System.out.println();
            System.out.println("-------------");
        }
    }

    static int getUserSlot() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = scanner.nextInt();

        return slot;
    }
}
