package ru.job4j.array;

public class monoVertical {
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X')  {
                result = false;
                break;
            }
        }
        return result;
    }

}
