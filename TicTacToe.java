import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
         * One-dimensional array representing the board:
         *
         * 0 | 1 | 2
         * --+---+--
         * 3 | 4 | 5
         * --+---+--
         * 6 | 7 | 8
         */
        char[] board = {
            '-', '-', '-',
            '-', '-', '-',
            '-', '-', '-'
        };

        char currentPlayer = 'X';

        /*
         * Counts only successful moves.
         */
        int moves = 0;
        boolean winnerFound = false;

        while (moves < 9 && !winnerFound) {

            printBoard(board);

            System.out.println("Current player: " + currentPlayer);
            System.out.print("Enter a position from 0 to 8: ");

            /*
             * Check that the user entered an integer.
             */
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Enter a number from 0 to 8.");
                scanner.next();
                continue;
            }

            int position = scanner.nextInt();

            /*
             * A valid board position must be between 0 and 8.
             */
            if (position < 0 || position > 8) {
                System.out.println("Invalid position. Enter a number from 0 to 8.");
                continue;
            }

            /*
             * The position must be empty.
             */
            if (board[position] != '-') {
                System.out.println("That position is already taken.");
                continue;
            }

            /*
             * Store the current player's symbol in the selected position.
             */
            board[position] = currentPlayer;

            /*
             * Increase the move counter only after a successful move.
             */
            moves++;

            /*
             * A player cannot win before five total moves:
             *
             * X = move 1
             * O = move 2
             * X = move 3
             * O = move 4
             * X = move 5
             *
             * Therefore, there is no need to check for a winner
             * during the first four moves.
             */
            if (moves >= 5 && checkWinner(board, currentPlayer)) {

                winnerFound = true;

                printBoard(board);

                System.out.println(
                    "Player " + currentPlayer + " wins!"
                );
            } else {

                /*
                 * Automatically switch the current player.
                 */
                if (currentPlayer == 'X') {
                    currentPlayer = 'O';
                } else {
                    currentPlayer = 'X';
                }
            }
        }

        /*
         * If all nine positions are filled and there is no winner,
         * the game is a draw.
         */
        if (moves == 9 && !winnerFound) {
            printBoard(board);
            System.out.println("The game is a draw.");
        }

        scanner.close();
    }

    /*
     * Prints the one-dimensional array as a 3 x 3 board.
     */
    public static void printBoard(char[] board) {

        System.out.println();

        for (int index = 0; index < board.length; index++) {

            System.out.print(board[index]);

            /*
             * Print a vertical separator unless the position
             * is at the end of a row.
             */
            if (index % 3 != 2) {
                System.out.print(" | ");
            }

            /*
             * Move to the next line after positions 2, 5 and 8.
             */
            if (index % 3 == 2) {
                System.out.println();

                /*
                 * Print a divider after the first and second rows.
                 */
                if (index < 8) {
                    System.out.println("--+---+--");
                }
            }
        }

        System.out.println();
    }

    /*
     * Checks whether the current player has won.
     */
    public static boolean checkWinner(
        char[] board,
        char player
    ) {

        /*
         * HORIZONTAL WIN CONDITIONS
         *
         * 0, 1, 2
         * 3, 4, 5
         * 6, 7, 8
         *
         * Each row starts at 0, 3 or 6.
         * Therefore, increase the starting position by 3.
         */
        for (int start = 0; start <= 6; start += 3) {

            if (
                board[start] == player &&
                board[start + 1] == player &&
                board[start + 2] == player
            ) {
                return true;
            }
        }

        /*
         * VERTICAL WIN CONDITIONS
         *
         * 0, 3, 6
         * 1, 4, 7
         * 2, 5, 8
         *
         * Each column starts at 0, 1 or 2.
         * The next position in the same column is found by adding 3.
         */
        for (int start = 0; start < 3; start++) {

            if (
                board[start] == player &&
                board[start + 3] == player &&
                board[start + 6] == player
            ) {
                return true;
            }
        }

        /*
         * DIAGONAL WIN:
         *
         * 0, 4, 8
         */
        if (
            board[0] == player &&
            board[4] == player &&
            board[8] == player
        ) {
            return true;
        }

        /*
         * DIAGONAL WIN:
         *
         * 2, 4, 6
         */
        if (
            board[2] == player &&
            board[4] == player &&
            board[6] == player
        ) {
            return true;
        }

        return false;
    }
}