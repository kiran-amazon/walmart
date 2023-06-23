#adding comments
    #removeing comments

import java.util.Scanner;

public class LoginPage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (login(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public static boolean login(String username, String password) {
        // Here, you can implement your own logic to validate the username and password.
        // For simplicity, let's assume the valid credentials are "admin" and "password".

        String validUsername = "admin";
        String validPassword = "password";

        return username.equals(validUsername) && password.equals(validPassword);
    }
}

