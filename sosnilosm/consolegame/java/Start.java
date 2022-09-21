package sosnilosm.consolegame.java;

import sosnilosm.consolegame.templates.Values;

import java.util.Scanner;


/*
  TODO: rewrite all annotations
*/

public class Start {

    public static void startGame() {
        GameMenu menu = new GameMenu();
        int size;
        if (menu.getUserChoice()){
            size = menu.setSize();
        }
        else {
            size = Values.rnd(3, 8);
        }

        Scanner scanner = new Scanner(System.in);
        String cmd;

        Safes safe = new Safes(size);

        while (!safe.winCheck()) {
            safe.showSafe();
            System.out.println("Enter command: ");
            cmd = scanner.nextLine().toLowerCase();

            cmdHandler(cmd, menu, safe);
        }
        menu.win();
    }

    private static void cmdHandler(String cmd, GameMenu menu, Safes safe) {
        switch (cmd) {
            case "m" -> menu.move(safe);

            case "undo" -> menu.undo(safe);

            case "rules" -> menu.rules();

            case "reset" -> menu.reset(safe);

            case "solution" -> menu.solution(safe);

            default -> menu.unknownCmd();
        }
    }
}
