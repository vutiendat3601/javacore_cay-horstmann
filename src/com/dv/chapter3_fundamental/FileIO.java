package com.dv.chapter3_fundamental;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileIO {
    public FileIO() throws IOException {
        String fileName = "./src/com/dat/chapter3_fundamental/out.txt";
        createFile(fileName);
        readFile(fileName);
    }

    public static void createFile(String fileName) throws FileNotFoundException {
        PrintWriter pWriter = new PrintWriter(fileName);
        pWriter.write("xin chao viet nam");
        pWriter.close();
    }

    public static void readFile(String fileName) throws IOException {
        Scanner scan = new Scanner(Paths.get(fileName), "utf-8");
        while(scan.hasNextLine()) 
            System.out.println(scan.nextLine());
    }
}
