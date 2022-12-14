package sosnilosm.consolegame.java;

import java.util.Scanner;

public class GameMenu {
    static Printer mes = new Printer();
    private boolean exit = true;
    public GameMenu () {
        mes.printRules();
    }

    public void show(Safes safe) {
        mes.printSafe(safe);
    }
    public void move(Safes safe) {
        Scanner scanner = new Scanner(System.in);
        int[] row_column = new int[2];
        mes.printMove();

        System.out.print("Input row and column[0-" + (safe.getSize() - 1) + "]: ");
        String str = scanner.nextLine();
        try{
            row_column[0] = Integer.parseInt(str.split(" ")[0]);
            row_column[1] = Integer.parseInt(str.split(" ")[1]);
        }
        catch (Exception e) {
            mes.printValueProblemsERROR();
        }

        if (row_column[0] < safe.getSize() && row_column[1] < safe.getSize()) {
            safe.move(row_column[0], row_column[1]);
        }
        else {
            mes.printUnknownCmdERROR();
        }
    }

    public void undo(Safes safe) {
        mes.printUndo();
        safe.undoMove();
    }

    public void rules() {
        mes.printRules();
    }

    public void reset(Safes safe) {
        mes.printReset();
        safe.reset();
    }

    public void solution(Safes safe) {
        mes.printSolution(safe);
    }

    public void unknownCmd() {
        mes.printUnknownCmdERROR();
    }

    public void win() {
        mes.printWin();
    }

    public boolean getUserChoice(){
        Scanner sc = new Scanner(System.in);
        String cmd;

        while (true) {
            mes.printChoose();
            cmd = sc.nextLine().toLowerCase();
            if (cmd.equals("y")) {
                return true;
            }
            else if (cmd.equals("n")) {
                return false;
            }
            else {
                mes.printUnknownCmdERROR();
            }
        }
    }

    public int setSize(){
        Scanner sc = new Scanner(System.in);
        int size;
        while (true) {
            mes.printEnterSize();
            size = sc.nextInt();
            sc.nextLine();
            if (size <= 8 && size >= 3) {
                return size;
            } else {
                mes.printValueProblemsERROR();
            }
        }
    }

    public boolean exit() {
        return exit;
    }

    public void getExit() {
        exit = false;
    }

    public void bye() {
        mes.printBye();
    }
}
