package Collections;

import java.util.Date;
import java.util.PriorityQueue;

public class Comparables {


    public static void main(String[] args) {
        PriorityQueue<Date> dateQueue = new PriorityQueue<Date>();
        dateQueue.offer(new Date());
        dateQueue.offer(new Date(15, 6, 2018));
        dateQueue.offer(new Date(20, 9, 2020));
    while (!dateQueue.isEmpty()){
        Date date = dateQueue.poll();
        System.out.println(date);
    }

    }


}
