package sosnilosm.consolegame.java;

import sosnilosm.consolegame.templates.Values;

public class Printer {
    public void printUnknownCmdERROR(){
        System.out.println(Values.UNKNOWN_CMD);
    }
    public void printValueProblemsERROR(){
        System.out.println(Values.SIZE_PROBLEMS);
    }
    public void printMove(){
        System.out.println(Values.MOVE);
    }
    public void printUndo(){
        System.out.println(Values.UNDO);
    }
    public void printRules(){
        System.out.println(Values.RULES);
    }
    public void printReset(){
        System.out.println(Values.RESET);
    }
    public void printSolution(){
        System.out.println(Values.SOLUTION);
    }
    public void printWin(){
        System.out.println(Values.WIN);
    }
}
