package com.dat.chapter3_fundamental;

// String are immutable
public class StringAPI {
    public StringAPI() {
        String s = "Vu Tien Dat";
        System.out.println(s.substring(0, 2));
        System.out.println(s.concat("-CT06N0110"));
        System.out.println(s.compareTo("Hello"));
        System.out.println(s.equalsIgnoreCase("vu tien dat"));
        System.out.println("start with: " + s.startsWith("vu"));
        System.out.println("index of D: " + s.indexOf("D"));
        System.out.println("to lower case: " + s.toLowerCase());
        System.out.println(String.join(" / ", "S", "M", "L"));
        demoCodePoint(s);
    }

    public static void demoCodePoint(String s) {
        System.out.println("The number of codepoints is " + s.codePointCount(0, s.length()));
        System.out.println("pos(0) have code unit is " + s.charAt(0));
        System.out.println(s);
        for (int i = 0; i < s.length();i++) {
            int cp = s.codePointAt(i);
            String hex = Integer.toHexString(cp);
            for (int j = 0; j < 4- hex.length();j++) 
            System.out.print("0");
            System.out.print(hex + " ");
        }
    }
}
