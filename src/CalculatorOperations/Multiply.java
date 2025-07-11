package CalculatorOperations;

import CalculatorMenu.Menu;

import java.util.Scanner;

public class Multiply {
    static int firstNumber;
    static int secondNumber;

    public Multiply(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public static int multiplyNumbers(int firstNumber, int secondNumber){
        int sum = firstNumber * secondNumber;
        return sum;
    }

    public static void multiplyMethod (){

        System.out.println("Du har valgt at gange");

        Scanner input = new Scanner(System.in);


        System.out.println("Skriv 2 tal som du vil gange");
        System.out.println("Skriv det første tal");

        firstNumber = input.nextInt();

        System.out.println("Skriv det andet tal");

        secondNumber = input.nextInt();

        System.out.println(firstNumber + " * " + secondNumber + " = " + multiplyNumbers(firstNumber, secondNumber));

        Menu.calculatorMenu();
    }
}
