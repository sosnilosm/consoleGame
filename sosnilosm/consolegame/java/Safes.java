package sosnilosm.consolegame.java;

import java.util.Arrays;
import java.util.Stack;

public class Safes {
    private final int steps = RndFromRange.getInt(3, 9); // Number of steps taken by the user
    private final int[][] solution = new int[steps][2]; // Massive of steps to solve game (from first to last)

    private final Boolean[][] locks; // Massive containing status of locks in boolean value
    private final Stack<int[]> moves = new Stack<>(); // Stack of moves donned by user

    public Safes(int size) {
        locks = new Boolean[size][size];
        deter();
    }

    private void deter() {

        for (Boolean[] lock : locks) {
            Arrays.fill(lock, true);
        }

        for (int i = 0; i < steps; i++){
            int row = RndFromRange.getInt(0, locks.length);
            int column = RndFromRange.getInt(0, locks.length);
            sysMove(row, column);
            solution[steps - i - 1][0] = row;
            solution[steps - i - 1][1] = column;
        }
    }

    public int[][] getSolution() {
        return solution;
    }

    public int getSize() {
        return locks.length;
    }

    public String getSafe() {
        StringBuilder s = new StringBuilder("  --");
        for (int i = 0; i < locks.length; i++) {
            s.append(i).append("-".repeat(7));
        }
        s.append("\n");
        for (int i = 0; i < locks.length; i++) {
            s.append(i).append("|\t");
            for (int j = 0; j < locks[i].length; j++) {
                s.append(locks[i][j]).append("\t");
            }
            s.append("\n");
        }
        return s.toString();
    }

    public void move(int row, int column) {
        sysMove(row, column);

        moves.push(new int[]{row, column});
    }

    private void sysMove(int row, int column) {
        for (int i = 0; i < locks.length; i++) {
            locks[i][column] = !locks[i][column]; //Changing column
            locks[row][i] = !locks[row][i]; //Changing row
        }
        locks[row][column] = !locks[row][column]; //Changing selected element
    }

    public void undoMove() {
        if (!moves.empty()) {
            // System.out.println(Arrays.toString(moves.peek()));
            int [] row_column = moves.pop();
            sysMove(row_column[0], row_column[1]);
        }
    }

    public boolean winCheck() {
        for (Boolean[] lock : locks) {
            for (Boolean el : lock) {
                if (!el) return false;
            }
        }
        return true;
    }

    public void reset() {
        while (!moves.empty()) {
            undoMove();
        }
    }
}