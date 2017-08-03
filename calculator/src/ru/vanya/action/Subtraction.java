package ru.vanya.action;
import java.util.Scanner;

public class Subtraction {

  private final Scanner SCANNER = new Scanner(System.in);

  private final String SAME = " = ";

  private final String MINUS = " - ";

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

        System.out.println("Введите уменьшаемое ");

        System.out.println();

        System.out.println("> ");

        int reducing = SCANNER.nextInt();

        System.out.println();

        System.out.println("Введите вычитаемое ");

        System.out.println();

        System.out.println("> ");

        int subtrahend = SCANNER.nextInt();

        System.out.println();

        int difference = reducing - subtrahend;

        System.out.println(reducing + MINUS + subtrahend + SAME + difference);

        break;

      case FRACTINAL_NUMBER:

        System.out.println();

        System.out.println("Ввод дробей такой 1,0");

        System.out.println();

        System.out.println("Введите уменьшаемое ");

        System.out.println();

        System.out.println("> ");

        float theReducing = SCANNER.nextFloat();

        System.out.println();

        System.out.println("Введите вычитаемое ");

        System.out.println();

        System.out.println("> ");

        float theSubtraheng = SCANNER.nextFloat();

        System.out.println();

        float theDifference = theReducing - theSubtraheng;

        System.out.println(theReducing + MINUS + theSubtraheng + SAME + theDifference);

        break;

    }

    return INTEGER_NUMBER;

  }

}
