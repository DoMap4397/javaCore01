package banking;

import java.io.IOException;

public class ATMApplication {
    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        System.out.println("\nWelcome to the ATM Application");
        menu.mainMenu();
    }
}
