package org.salesAPI.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvParser {

    public static void parseCsv(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            // Hier könnte der Produktimport stattfinden
        }
    }
}