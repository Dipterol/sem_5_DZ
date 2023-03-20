public class Task_3 {
    public static void task_3() {
        int bS = 8;
        int[][] board = new int[bS][bS];
        for (int i = 0; i < bS; i++) {
            for (int j = 0; j < bS; j++) {
                board[i][j] = 0;
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        board[0][3] = 1;
        board[1][1] = 1;
        board[2][7] = 1;
        board[3][4] = 1;
        board[4][6] = 1;
        board[5][0] = 1;
        board[6][2] = 1;
        board[7][5] = 1;
        for (int i = 0; i < bS; i++) {
            for (int j = 0; j < bS; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
    }
}
}
