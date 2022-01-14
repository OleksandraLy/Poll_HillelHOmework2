package services;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.*;
import java.io.IOException;

public class CsvToHashMap {
        HashMap <Integer, String> numeratedQuestions = new HashMap<>();

        public CsvToHashMap() {
                this.numeratedQuestions = numeratedQuestions;
        }

        public HashMap<Integer, String> getNumeratedQuestions() {
                return numeratedQuestions;
        }

        public void setNumeratedQuestions(HashMap<Integer, String> numeratedQuestions) {
                this.numeratedQuestions = numeratedQuestions;
        }

        public void csvToHashMap() throws IOException {
                final String filePath = "C:\\Users\\Олександра\\IdeaProjects\\poll\\src\\main\\resources\\poll_simple.csv";

                Reader csvReader = new FileReader(filePath);
                String csvString = null;
                int key = 1;
                Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(csvReader);
                for (CSVRecord line : records) {
                        csvString = line.toString();
                        String csvStringCut = csvString.replace("values=", "");
                        String [] csvArray = new String[3];
                        csvArray=csvStringCut.split(",");
                        numeratedQuestions.put(key, csvArray[2]);
                        key++;
                }
                csvReader.close();
        }
}
