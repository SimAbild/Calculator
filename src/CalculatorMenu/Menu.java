package CalculatorMenu;

import CalculatorOperations.Addition;
import CalculatorOperations.Divide;
import CalculatorOperations.Multiply;
import CalculatorOperations.Subtraction;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Menu {

    public static void calculatorMenu(){
        System.out.println("Vælg hvad du vil gøre?");
        System.out.println("""
                1 - Plusse
                2 - Minusse
                3 - Gange
                4 - Dividere
                """);


        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch (choice){
            case 1 -> Addition.additionMethod();
            case 2 -> Subtraction.subtractionMethod();
            case 3 -> Multiply.multiplyMethod();
            case 4 -> Divide.divideMethod();
        }
    }
}
