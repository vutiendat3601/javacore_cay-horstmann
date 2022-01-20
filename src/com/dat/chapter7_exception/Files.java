package com.dat.chapter7_exception;

import java.io.EOFException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Files {

    public static void main(String[] args) {
        readFile("./src/com/dat/chapter7_exception/input.txt");
    }

    public static void readFile(String location) {
        int[] a;
        try {
            Scanner scan = new Scanner(Paths.get(location));
            int len = Integer.parseInt(scan.nextLine());
            a = new int[len];
            int i = 0;
            while (scan.hasNext()) {
                a[i++] = scan.nextInt();
            }
            if (i != len)
                throw new EOFException("Do dai mang khong khop");
            scan.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Ket thuc");
    }
}
