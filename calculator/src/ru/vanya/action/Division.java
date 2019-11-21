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

    System.out.print("> ");

    int choice = SCANNER.nextInt();

    switch (choice) {

      case INTEGER_NUMBER:

        System.out.println();

        System.out.println("Введите делимое ");

        System.out.println();

        System.out.print("> ");

        int theDividendInteger = SCANNER.nextInt();

        System.out.println();

        System.out.println("Введите делитель ");

        System.out.println();

        System.out.print("> ");

        int theDividerInteger = SCANNER.nextInt();

        System.out.println();

        System.out.println(theDividendInteger + DIVISION_SING + theDividerInteger + SAME_SIGN + translationTypeData(theDividendInteger, theDividerInteger));

        break;

      case FRACTINAL_NUMBER:

        System.out.println();

        System.out.println("Ввод дробей такой 1,0");

        System.out.println();

        System.out.println("Введите делимое ");

        System.out.println();

        System.out.print("> ");

        float dividend = SCANNER.nextFloat();

        System.out.println();

        System.out.println("Введите делитель ");

        System.out.println();

        System.out.print("> ");

        float divider = SCANNR.nextFloat();

        float thePrivate = dividend / divider;

        System.out.println();

        System.out.println(dividend + DIVISION_SING + divider + SAME_SIGN + thePrivate);

    }

    return INTEGER_NUMBER;

  }

}
