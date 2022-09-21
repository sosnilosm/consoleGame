package sosnilosm.consolegame.java;

import sosnilosm.consolegame.templates.Values;

import java.util.Arrays;

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
    public void printSolution(Safes safe){
        System.out.println(Values.SOLUTION);
        System.out.println(Arrays.deepToString(safe.getSolution()));
    }
    public void printWin(){
        System.out.println(Values.WIN);
    }
    public void printSafe(Safes safe) {
        System.out.println(safe.getSafe());
    }
    public void printChoose() {
        System.out.println(Values.CHOOSE);
    }
    public void printEnterSize() {
        System.out.println(Values.ENTER_SIZE);
    }
    public void printBye() {
        System.out.println(Values.GOODBYE);
    }
}
