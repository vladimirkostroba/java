import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintStream;
import java.util.InputMismatchException;



public class Main {

    public static void main(String[] args) {

        Client client = new Client("Volodymyr", "Kostroba", "Sparda-bank");


        Emploee emploee = new Emploee("Sandra", "Westerholt", "Sparkasse", "meneger");
        emploee.getInfo();

    }

}
