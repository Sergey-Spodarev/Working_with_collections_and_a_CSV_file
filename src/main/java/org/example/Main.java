package org.example;
import model.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.opencsv.CSVReader;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String csvFilePath = "foreign_names.csv";
    }

    private List<Humen> readPeopleFromCsv(String csvFilePath, Character separator){
        List<Humen> list = new ArrayList<>();
        Map<String, Department> hashMap = new HashMap<>();
        try (CSVReader csvReader = new CSVReader(new FileReader(csvFilePath))) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return list;
    }
}