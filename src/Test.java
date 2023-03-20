public class Test {
    public static void test() {
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

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (prov(board) && prov2(board, bS) && prov3(board, bS)) {
                    board[i][j] = 1;
                    System.out.print(board[i][j] + " ");
                } else System.out.print("0" + " ");
            }
            System.out.println();
        }
    }

    static boolean prov(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] == 1 || board[i][0] == 1) {
                return false;
            }
        }
        return true;
    }

    static boolean prov2(int[][] board, int bS) {
        for (int i = 0, j = 0; i < bS && j < bS; i++, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    static boolean prov3(int[][] board, int bS) {
        int row = 8;
        int col = 8;
        for (int i = 1; i <= row && col - i >= 0; i++) {
            if (board[row - i][col - i] == 1) {
                return false;
            }
        }
        for (int i = 1; i <= row && col + i < bS; i++) {
            if (board[row - i][col + i] == 1) {
                return false;
            }
        }
        return true;
    }
}

