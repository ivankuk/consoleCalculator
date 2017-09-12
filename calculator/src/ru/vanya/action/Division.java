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

      return theDividend;

  }

  public int showResult() {

    return INTEGER_NUMBER;
  }

}
