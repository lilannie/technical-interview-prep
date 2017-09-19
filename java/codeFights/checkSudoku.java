package codeFights;

public class checkSudoku {
    boolean sudoku2(char[][] grid) {
        if (grid == null || grid.length != 9 || grid[0].length != 9)
            return false;

        for (int i = 0; i < 9; i++) {
            boolean[] rows = new boolean[9];
            boolean[] cols = new boolean[9];

            for (int j = 0; j < 9; j++) {
                char curr = grid[i][j];

                if (curr != '.') {
                    System.out.println(curr);
                    System.out.println(Character.getNumericValue(curr) - 1);

                    if (rows[Character.getNumericValue(curr) - 1])
                        return false;
                    rows[Character.getNumericValue(curr) - 1] = true;
                }

                curr = grid[j][i];

                if (curr != '.') {
                    if (cols[Character.getNumericValue(curr) - 1])
                        return false;
                    cols[Character.getNumericValue(curr) - 1] = true;
                }
            }
        }

        for (int block = 0; block < 9; block++) {
            boolean[] num = new boolean[9];

            for (int i = (block/3) * 3; i < ((block/3) * 3) + 3; i++) {
                for (int j = (block % 3) * 3; j < ((block % 3) * 3) + 3; j++) {
                    char curr = grid[i][j];

                    if (curr != '.') {
                        if (num[Character.getNumericValue(curr) - 1])
                            return false;
                        num[Character.getNumericValue(curr) - 1] = true;
                    }
                }
            }
        }

        return true;
    }
}
