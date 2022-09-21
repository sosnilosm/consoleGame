package sosnilosm.consolegame.java;

import java.util.Random;

public class RndFromRange {
    public static int getInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
