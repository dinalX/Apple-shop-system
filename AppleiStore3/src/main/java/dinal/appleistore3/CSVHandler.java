/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinal.appleistore3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVHandler {

    public static void write(String fileName, String content, boolean append) throws IOException {
        FileWriter fw = new FileWriter(fileName, append);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        bw.newLine();
        bw.close();
        fw.close();
    }

    public static void write(String fileName, ArrayList<String> lines, boolean append) throws IOException {
        FileWriter fw = new FileWriter(fileName, append);
        BufferedWriter bw = new BufferedWriter(fw);

        for (String line : lines) {
            bw.write(line);
            bw.newLine();
        }

        bw.close();
        fw.close();
    }

    public static ArrayList<String> read(String fileName) throws FileNotFoundException {
        ArrayList<String> rows = new ArrayList<>();
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String row = scanner.nextLine();
            rows.add(row);
        }
        scanner.close();
        return rows;
    }
}
