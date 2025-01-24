/**
 * Bradley Phan
 * Problem set 8A - Tic Tac Toe
 * December 5th 2024
 */


import java.util.Scanner;

public class TicTacToe {
    private static char[][] board;
    private static char currentPlayer;
    private static int round;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean playAgain = true;

        
        while(playAgain){
            StartGame();
            playGame(input);
            playAgain = PlayAgain(input);
            
        }
        

        System.out.println("Thanks for playing!");
        input.close();
    }

    public static void StartGame() {
        board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
        currentPlayer = 'X';
        round = 1;
    }

    public static void playGame(Scanner scanner) {
        boolean gameWon = false;

        while (round <= 9 && !gameWon) {
            System.out.println("");
            printBoard();
            System.out.println("");
            System.out.println("  Round " + round);
             System.out.println("");
            System.out.print(currentPlayer + ", make your move (row,col):");

            String input = scanner.nextLine();
            if (Valid(input)) {
                int row = input.charAt(0) - '0';
                int col = input.charAt(2) - '0';
                board[row][col] = currentPlayer;
                gameWon = checkWinner(row, col);

                if (gameWon) {
                    printBoard();
                    System.out.println("YOU WON!");
                    System.out.println(currentPlayer + " is the winner!");
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                    round++;
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        if (!gameWon) {
            printBoard();
            System.out.println("It's a Tie!");
        }
    }

    public static boolean Valid(String input) {
        if (input.length() != 3 || input.charAt(1) != ',') {
            return false;
        }

        int row = input.charAt(0) - '0';
        int col = input.charAt(2) - '0';

        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != ' ') {
            return false;
        }

        return true;
    }

    public static boolean checkWinner(int row, int col) {
        // Check row
        if (board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer) {
            return true;
        }
        // Check column
        if (board[0][col] == currentPlayer && board[1][col] == currentPlayer && board[2][col] == currentPlayer) {
            return true;
        }
        // Check diagonal
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }

        return false;
    }

    public static boolean PlayAgain(Scanner input) {
        System.out.println("Play again?:(yes or no)");
        String response = input.nextLine().trim().toLowerCase();
        return response.equals("yes");
    }

    public static void printBoard() {
        System.out.println("  0  1  2");
        for (int i = 0; i < 3; i++) {
             System.out.print(i);
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + board[i][j] + "]");
            }
            System.out.println();
        }
    }
}



