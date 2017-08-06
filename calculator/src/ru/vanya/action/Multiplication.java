package ru.vanya.action;
import java.util.Scanner;

public class Multiplication {

  private final Scanner SCANNER = new Scanner(System.in);

  private final String MULTIPLICATION_SIGN = " X ";

  private final String SAME_SIGN = " = ";

  private final int INTEGER_NUMBER = 1;

  private final int FRACTINAL_NUMBER = 2;

  public int showResult() {

    System.out.println();

     System.out.println(INTEGER_NUMBER + " - Целое число");

     System.out.println(FRACTINAL_NUMBER + " - Дробное число");

     int choice = SCANNER.nextInt();

     switch (choice) {

        case INTEGER_NUMBER:

        System.out.println();

        System.out.println("Введите первый множитель ");

        System.out.println();

        System.out.println("> ");

        int theFirstMultiplier = SCANNER.nextInt();

        System.out.println();

        System.out.println("Введите второй множитель ");

        System.out.println();

        System.out.println("> ");

        int theSecondMultiplier = SCANNER.nextInt();

        System.out.println();

        int theComposite = theFirstMultiplier * theSecondMultiplier;

        System.out.println(theFirstMultiplier + MULTIPLICATION_SIGN + theSecondMultiplier + theComposite);

        break;
        
     }

     return INTEGER_NUMBER;

  }

}
