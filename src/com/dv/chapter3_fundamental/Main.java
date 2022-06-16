package com.dv.chapter3_fundamental;

public class Main {
    public static void main(String[] args) {
        Enums[] season = Enums.values();
        for (Enums i : season)
            System.out.println(i.ordinal());
        
        Enums fall = Enums.FALL;
        System.out.println(fall.compareTo(Enums.WINTER));
    }
}
