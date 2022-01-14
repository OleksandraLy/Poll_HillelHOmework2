package services;

import java.io.IOException;
import java.util.Scanner;

public class AskQuestions<askQuestionsMethod>{

    private static String nameString;
    private static String surnameString;
    private AskPersonalInfo askPersonalInfo = new AskPersonalInfo();
    private AskCsvQuestions askCsvQuestions = new AskCsvQuestions();

    public AskQuestions() {
    }

    public AskQuestions(String nameString, String surnameString) {
    }

    public static String getNameString() {
        return nameString;
    }

    public static void setNameString(String nameString) {
        AskQuestions.nameString = nameString;
    }

    public static String getSurnameString() {
        return surnameString;
    }

    public static void setSurnameString(String surnameString) {
        AskQuestions.surnameString = surnameString;
    }

    public AskPersonalInfo getAskPersonalInfo() {
        return askPersonalInfo;
    }

    public void setAskPersonalInfo(AskPersonalInfo askPersonalInfo) {
        this.askPersonalInfo = askPersonalInfo;
    }

    public AskCsvQuestions getAskCsvQuestions() {
        return askCsvQuestions;
    }

    public void setAskCsvQuestions(AskCsvQuestions askCsvQuestions) {
        this.askCsvQuestions = askCsvQuestions;
    }

    public static void askQuestionsMethod() throws IOException {
        System.out.println("Hello and welcome to the City Public Transport Passengers Poll. You will see the questions on the screen. First, please, fill your name and surname");
        AskPersonalInfo.questionsMethod();
        System.out.println("Now please answer five more questions:");
        AskCsvQuestions.askCsvQuestionsMethod();
        System.out.println("Your answers have been received. Thank you for participation!");
    }
}
