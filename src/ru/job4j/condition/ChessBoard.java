package ru.job4j.condition;

public class ChessBoard {
    @SuppressWarnings({"checkstyle:WhitespaceAround", "checkstyle:ParenPad"})
    public static int way (int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1) && x1>-1 && x1<8 && x2>-1 && x2<8 && y1>-1 && y1<8 && y2>-1 && y2<8)
        {
            rsl = Math.abs(y2-y1);
            rsl = rsl == 0?Math.abs(x1-x2):rsl;
        }
        return rsl;
    }
    public static void main(String[] args ) {
        int result = ChessBoard.way(0, 0, 6, 6);
        System.out.println(result);
    }



}
