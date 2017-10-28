package ru.vanya.view;
import ru.vanya.action.*;
import java.util.Scanner;

public class MainMenuView {

  private final Scanner SCANNER = new Scanner(System.in);

  private final Addition ADDITION = new Addition();

  private final Subtraction SUBTRATION = new Subtraction();

  private final Multiplication MULTIPLICATION = new Multiplication();

  private final Division DIVISION = new Division();

  private final int EXIT = 0;

  private final int POINTER_ADDITION = 1;

  private final int POINTER_SUBTRATION = 2;

  private final int POINTER_MULTIPLICATION = 3;

  private final int POINTER_DIVISION = 4;

  public int showMenu() {

    System.out.println();

    System.out.println(POINTER_ADDITION + " - Сложение");

    System.out.println();

    System.out.println(POINTER_SUBTRATION + " - Вычитание");

    System.out.println();

    System.out.println(POINTER_MULTIPLICATION + " - Умножения");

    System.out.println();

    System.out.println(POINTER_DIVISION + " - Деление");

    System.out.println();

    System.out.println(EXIT + " -  Выход");

    System.out.println();

    System.out.print("> ");

    int choice = SCANNER.nextInt();

    switch (choice) {

      case POINTER_ADDITION:

      ADDITION.showResult();

      break;

      case POINTER_SUBTRATION:

      SUBTRATION.showResult();

      break;

      case POINTER_MULTIPLICATION:

      MULTIPLICATION.showResult();

      break;

      case POINTER_DIVISION:

      DIVISION.showResult();

      break;

      case EXIT:

      System.out.println("Выход из калькулятора");

    }

    return choice;

  }

}
