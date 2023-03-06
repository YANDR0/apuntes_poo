package tests;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

public class test_4 {

    public static void main(String[] args){

        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        System.out.println("\n" + c1);
        System.out.println(c2 + "\n");


        LocalDate d1 = LocalDate.now();
        LocalDate d2 = d1.plusWeeks(4);
        LocalDateTime d3 = LocalDateTime.of(2021, 5, 16, 16, 45, 35, 345_000_000);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println("\n" + d1.isBefore(d2));

        //getDayOfYear, getDayOfWeek, getMonth, getDayOfMonth

        //plusWeeks y similares no modifican objetos, crean uno nuevo

    }
}
