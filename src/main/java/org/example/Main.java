package org.example;

import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
import model.Department;
import model.Human;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String csvFilePath = "foreign_names.csv";
        char separator = ';';
        List<Human> people = readPeopleFromCsv(csvFilePath, separator);
        people.forEach(System.out::println);
    }

    private static List<Human> readPeopleFromCsv(String csvFilePath, char separator) {
        List<Human> list = new ArrayList<>();
        Map<String, Department> departmentMap = new HashMap<>();

        try (FileReader fileReader = new FileReader(csvFilePath);
             CSVReader reader = new CSVReaderBuilder(fileReader)
                     .withCSVParser(new CSVParserBuilder().withSeparator(separator).build())
                     .build()) {
            String[] nextLine;
            boolean isHeader = true;

            while ((nextLine = reader.readNext()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                if (nextLine.length < 6) {
                    System.err.println("Некорректная строка в CSV: " + String.join(", ", nextLine));
                    continue;
                }

                try {
                    int id = Integer.parseInt(nextLine[0].trim());
                    String name = nextLine[1].trim();
                    String gender = nextLine[2].trim();
                    LocalDate birthDate = LocalDate.parse(nextLine[3].trim(), DateTimeFormatter.ofPattern("dd.MM.yyyy"));
                    String departmentName = nextLine[4].trim();
                    double salary = Double.parseDouble(nextLine[5].trim());
                    Department department = departmentMap.computeIfAbsent(departmentName, Department::new);

                    Human human = new Human(id, name, gender, department, salary, birthDate);
                    list.add(human);
                } catch (IllegalArgumentException e) {
                    System.err.println("Ошибка при парсинге строки: " + String.join(", ", nextLine));
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при чтении файла CSV", e);
        } catch (CsvValidationException e) {
            throw new RuntimeException("Ошибка валидации CSV", e);
        }

        return list;
    }
}