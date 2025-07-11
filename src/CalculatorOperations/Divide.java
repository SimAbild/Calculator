package CalculatorOperations;

import CalculatorMenu.Menu;

import java.util.Scanner;

public class Divide {
    static int firstNumber;
    static int secondNumber;

    public Divide(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public static int divideNumbers(int firstNumber, int secondNumber){
        int sum = firstNumber / secondNumber;
        return sum;
    }

    public static void divideMethod (){

        System.out.println("Du har valgt at dividere");



        Scanner input = new Scanner(System.in);
        System.out.println("Skriv 2 tal som du vil dividere");
        System.out.println("Skriv det første tal");

        firstNumber = input.nextInt();

        System.out.println("Skriv det andet tal");

        secondNumber = input.nextInt();

        System.out.println(firstNumber + " / " + secondNumber + " = " + divideNumbers(firstNumber, secondNumber));

        Menu.calculatorMenu();
    }
}
