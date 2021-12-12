package com.ludwiniak.first.lab8.Studies.Utils;

import com.ludwiniak.first.lab8.Studies.Enums.Gender;
import com.ludwiniak.first.lab8.Studies.Enums.ModeOfStudies;

import java.util.Scanner;
import java.util.zip.DataFormatException;

public class ConsoleReader {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getInt(String prompt) {
        showMessage(prompt);
        try {
            if (!scanner.hasNextInt()) {
                throw new DataFormatException();
            }

            int out = scanner.nextInt();
            scanner.nextLine();
            return out;
        } catch (DataFormatException err) {
            error();
            return getInt(prompt);
        }
    }

    public static String getString(String prompt) {
        showMessage(prompt);
        try {
            if (!scanner.hasNextLine()) {
                throw new DataFormatException();
            }

            return scanner.nextLine();
        } catch (DataFormatException err) {
            error();
            return getString(prompt);
        }
    }

    public static Gender getGender() {
        showMessage("Podaj płeć (male|female)");

        try {
            String userInput = StringUtils.capitalize(scanner.nextLine());
            if (!userInput.matches("^(Male|Female)$")) {
                throw new DataFormatException();
            }

            return Gender.valueOf(userInput);
        } catch (DataFormatException err) {
            System.out.println("Błędne dane");
            return getGender();
        }
    }

    public static ModeOfStudies getMode() {
        showMessage("Podaj tryb studiów (full|part)");

        try {
            String userInput = scanner.nextLine();

            if (!userInput.matches("^(full|part)$")) {
                throw new DataFormatException();
            }

            return ModeOfStudies.valueOf(userInput + "Time");
        } catch (DataFormatException err) {
            System.out.println("Błędne dane");
            return getMode();
        }
    }


    private static void showMessage(String prompt) {
        System.out.print(prompt + ": ");
    }

    private static void error() {
        System.out.println(scanner.nextLine());
        System.out.println("Błędne dane");
    }


}
