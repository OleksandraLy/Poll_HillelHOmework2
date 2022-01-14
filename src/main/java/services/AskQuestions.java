package services;

import java.io.IOException;
import java.util.Scanner;

public class AskQuestions<askQuestionsMethod>{
    private AskPersonalInfo askPersonalInfo = new AskPersonalInfo();

    public static void askQuestionsMethod() throws IOException {
        System.out.println("Hello and welcome to the City Public Transport Passengers Poll. You will see the questions on the screen. First, please, fill your name and surname");
        AskPersonalInfo.questionsMethod();
        System.out.println("Now please answer five more questions:");
        AskCsvQuestions.askCsvQuestionsMethod();
        System.out.println("Your answers have been received. Thank you for participation!");
    }
}
