package CalculatorOperations;

import CalculatorMenu.Menu;

import java.util.Scanner;

public class Subtraction {
    static int firstNumber;
    static int secondNumber;

    public Subtraction(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public static int subtractionNumbers(int firstNumber, int secondNumber){
        int sum = firstNumber - secondNumber;
        return sum;
    }

    public static void subtractionMethod (){

        System.out.println("Du har valgt at minusse");



        Scanner input = new Scanner(System.in);
        System.out.println("Skriv 2 tal som du vil plusse");
        System.out.println("Skriv det første tal");

        firstNumber = input.nextInt();

        System.out.println("Skriv det andet tal");

        secondNumber = input.nextInt();

        System.out.println(firstNumber + " - " +  secondNumber + " = " + subtractionNumbers(firstNumber, secondNumber));

        Menu.calculatorMenu();
    }
}
