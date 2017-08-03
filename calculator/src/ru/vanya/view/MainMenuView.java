package ru.vanya.view;
import ru.vanya.action.*;
import java.util.Scanner;

public class MainMenuView {

  private final Scanner SCANNER = new Scanner(System.in);

  private final Addition ADDITION = new Addition();

  private final Subtraction SUBTRATION = new Subtraction();

  private final int EXIT = 0;

  private final int POINTER_ADDITION = 1;

  private final int POINTER_SUBTRATION = 2;

  public int showMenu() {

    System.out.println(POINTER_ADDITION + " - Сложение");

    System.out.println();

    System.out.println(POINTER_SUBTRATION + " - Вычитание");

    System.out.println();

    System.out.println(EXIT + " -  Выход");

    System.out.println();

    int choice = SCANNER.nextInt();

    switch (choice) {

      case POINTER_ADDITION:

      ADDITION.showResult();

      break;

      case POINTER_SUBTRATION:

      SUBTRATION.showResult();

      break;

      case EXIT:

      System.out.println("Выход из калькулятора");

    }

    return POINTER_ADDITION;

  }

}
