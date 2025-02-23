package edu.uoc.ds.adt;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import java.io.FileReader;
import java.io.IOException;


public class CSVReader {
    public static CSVParser getCVSParser(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
            CSVParser parser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader());
            return parser;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error while reading csv: " + fileName);
        }
    }
}
