package ru.vanya.action;
import java.util.Scanner;

public class Addition {

  private final Scanner SCANNER = new Scanner(System.in);

  private final String PLUS_SIGN = " + ";

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

      System.out.println("Введите первое слогаемое ");

      System.out.println();

      System.out.println("> ");

      int theFirstTerm = SCANNER.nextInt();

      System.out.println();

      System.out.println("Введите второе слогаемое ");

      System.out.println();

      System.out.println("> ");

      int theSecondTerm = SCANNER.nextInt();

      System.out.println();

      int theSum = theFirstTerm + theSecondTerm;

      System.out.println(theFirstTerm + PLUS_SIGN + theSecondTerm + SAME_SIGN + theSum);

      break;

      case FRACTINAL_NUMBER:

      System.out.println();

      System.out.println("Ввод дробей такой 1,0");

      System.out.println();

      System.out.println("Введите первое слогаемое");

      System.out.println();

      System.out.println("> ");

      float firstTerm = SCANNER.nextFloat();

      System.out.println();

      System.out.println("Введите второе слогаемое");

      System.out.println();

      System.out.println("> ");

      float secondTerm = SCANNER.nextFloat();

      System.out.println();

      float sum = firstTerm + secondTerm;

      System.out.println(firstTerm + PLUS_SIGN + secondTerm + SAME_SIGN + sum);

      break;

    }

    return INTEGER_NUMBER;

  }

}
