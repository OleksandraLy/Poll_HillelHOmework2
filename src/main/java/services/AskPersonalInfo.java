package services;

import java.util.Scanner;

public class AskPersonalInfo {
    private static String nameString = null;
    private static String surnameString= null;;

    public AskPersonalInfo() {
        this.nameString = nameString;
        this.surnameString = surnameString;
    }

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public String getSurnameString() {
        return surnameString;
    }

    public void setSurnameString(String surnameString) {
        this.surnameString = surnameString;
    }

    public static void questionsMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        nameString = scanner.nextLine();
        System.out.println("Please enter your surname:");
        surnameString = scanner.nextLine();
        scanner.close();
    }
}
