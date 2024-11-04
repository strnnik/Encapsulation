import java.io.PrintStream;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("TIMUR", "PIDOR");

        computer.setProcessor(5000, 16, "DILDO", 250);
        computer.setRAM(TypeRAM.DDR2, 8192, 300);
        computer.setInfoStorage(TypeStorage.SSD, 256000, 750.25);
        computer.setScreen(25.5, TypeScreen.VA, 5120.2);
        computer.setKeyboard(TypeKeyboard.MEMBRANE, true, 805);

        computer.setProcessor(6700, 8, "DILDuck", 200);

        PrintStream out = System.out;
        out.println(computer.calcOfTheTotalWeight());
        out.println(computer.toString());
    }
}