package sosnilosm.consolegame.templates;

import java.util.Random;

public class Values {
    public final static String RULES = """
                \tRULES
                This is the console game Pilot Brothers Safe.
                The safe has many swivel handles that can be positioned horizontally or vertically.
                The handles are square. There is one rule - when turning the handle, all the handles in the same row and column are turned.
                The safe opens only if it is possible to arrange all the handles parallel vertically to each other.

                -m
                -[row]
                -[column]
                \t--To make a move, and then specify the row and column of the crank you want to turn.

                -undo
                \t--To undo the last move.

                -hint
                \t--To get a hint.
                
                -solution
                \t--To see how to solve the safe.
                
                -reset
                \t--To reset locks in first position.

                -rules
                \t--To learn the rules of the game.
                """;
    public final static String MOVE = "MOVE";
    public final static String UNDO = "UNDO LAST MOVE";
    public final static String RESET = "RESET GAME";
    public final static String SOLUTION = "GET SOLUTION STEPS";
    public final static String WIN = "\t" + "!!!CONGRATULATIONS!!!".repeat(3) + "\nYou have solved the problem..! You're so smart!!!";
    public final static String UNKNOWN_CMD = "WARNING!!! Unknown command...";
    public final static String SIZE_PROBLEMS = "ERROR WARNING!!! Incorrect size value...";
    public static int rnd(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}