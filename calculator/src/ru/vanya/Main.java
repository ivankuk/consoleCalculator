package ru.vanya;
import ru.vanya.view.MainMenuView;

public class Main {

  public static final MainMenuView MAIN_MENU_VIEW = new MainMenuView();

  public static final int EXIT = 0;

  public static void main(String[] args) {

    do {

      MAIN_MENU_VIEW.showMenu();

    } while (MAIN_MENU_VIEW.showMenu() != EXIT);

  }

}
