package CalculatorOperations;
import CalculatorMenu.Menu;

import java.util.Scanner;

public class Addition {
    static int firstNumber;
    static int secondNumber;

    //Getters
    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    //Setters
    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    //Constructor
    public Addition(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public static int additionNumbers(int firstNumber, int secondNumber){
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public static void additionMethod (){

        System.out.println("Du har valgt at plusse");



        Scanner input = new Scanner(System.in);
        System.out.println("Skriv 2 tal som du vil plusse");
        System.out.println("Skriv det første tal");

        firstNumber = input.nextInt();

        System.out.println("Skriv det andet tal");

        secondNumber = input.nextInt();

        System.out.println(firstNumber + " + " + secondNumber + " = " + additionNumbers(firstNumber, secondNumber));

        Menu.calculatorMenu();
    }
}