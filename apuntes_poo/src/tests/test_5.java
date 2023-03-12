package tests;
import DateTime.*;

public class test_5 {
    public static void main(String[] args){

        DateTime time1 = new DateTime(23, 59, 59, 31, 12, 2022);
        DateTime time2 = new DateTime(0, 0, 0, 1, 1, 2023);
        Date date3 = new Date(1, 1, 2023);
        DateTime time4 = new DateTime(date3);
        Date date5 = time1.toDate();

        System.out.println("time1: " + time1);
        System.out.println("time2: " + time2);
        System.out.println("date3: " + date3);
        System.out.println("time4: " + time4);
        System.out.println("date5: " + date5);

        time1.next();

        System.out.println("\nEl segundo siguiente de time1 es: " + time1);

        System.out.println("\ntime1 es igual a time2 = " + time1.equals(time2));
        System.out.println("time2 es igual a time1 = " + time2.equals(time1));
        System.out.println("time2 es igual a date3 = " + time2.equals(date3));
        System.out.println("date3 es igual a time2 = " + date3.equals(time2) + "\n");

        Date[] s = {time1, time2, date3, time4, date5};

        for (Date d:s){
            System.out.print(d + ", "); d.setFormat(1);
            System.out.print(d + ", "); d.setFormat(2);
            System.out.print(d + "\n");
        }
    }

}
