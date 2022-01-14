package services;

import java.io.IOException;
import java.util.Scanner;

public class AskCsvQuestions {

    public static void main(String[] args) throws IOException {
        askCsvQuestionsMethod();
    }

    public AskCsvQuestions() {
    }

    public static void askCsvQuestionsMethod() throws IOException {
        CsvToHashMap csvToHashMap = new CsvToHashMap();
        try {
            csvToHashMap.csvToHashMap();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner pollScanner = new Scanner(System.in);
        String answer;
        for (int count = 2; count < 7; count++){
            System.out.println(csvToHashMap.getNumeratedQuestions().get(count));
            answer = pollScanner.nextLine();
            System.out.println(answer);
        }
        pollScanner.close();
    }
}
