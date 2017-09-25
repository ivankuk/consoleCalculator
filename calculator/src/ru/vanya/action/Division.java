package ru.vanya.action;
import java.util.Scanner;

public class Division {

  private final Scanner SCANNER = new Scanner(System.in);

  private final String DIVISION_SING = " : ";

  private final String SAME_SIGN = " = ";

  private final int INTEGER_NUMBER = 1;

  private final int FRACTINAL_NUMBER = 2;

  private float translationTypeData(final int newDividend, final int newDivider) {

      float theDividend = (int) newDividend;

      float theDivider = (int) newDivider;

      float chasnoe = theDividend / theDivider;

      return chasnoe;

  }

  public int showResult() {

    System.out.println();

    System.out.println(INTEGER_NUMBER + " - Целое число ");

    System.out.println(FRACTINAL_NUMBER + " - Дробное число ");

    int choice = SCANNER.nextInt();

    switch (choice) {

      case INTEGER_NUMBER:

        System.out.println();

        System.out.println("Введите делимое ");

        System.out.println();

        System.out.println("> ");

        int theDividendInteger = SCANNER.nextInt();

        System.out.println();

        System.out.println("Введите делитель ");

        System.out.println();

        System.out.println("> ");

        int theDividerInteger = SCANNER.nextInt();

        System.out.println();

        System.out.println(theDividendInteger + DIVISION_SING + theDividerInteger + SAME_SIGN + translationTypeData(theDividendInteger, theDividerInteger));



    }

    return INTEGER_NUMBER;

  }

}
