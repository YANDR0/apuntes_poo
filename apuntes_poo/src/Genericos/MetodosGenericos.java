package Genericos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

public class MetodosGenericos {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i <= 5; i++) intList.add(i*10);
        ArrayList<String> strList = new ArrayList<>();
        strList.add("public");
        strList.add("static");
        strList.add("void");
        strList.add("main");

        //printList(intList);
        //printList(strList);
        print(intList);
        print(strList);

        frequency(intList, 10);
        maxInteger(intList);


    }

    public static void printList(List<?> list) {
        //Object element = list.get(i);
        for(int i = 0; i < list.size(); i++) System.out.println(i + ") " + list.get(i));
    }

    public static void print(Collection<?> coll) {
        Integer i = 0;
        for(Object o: coll) {
            System.out.println(i + ") " + o);
            i++;
        }
    }

    public static <T> int frequency(Collection<T> coll, T find){
        int count = 0;
        for(T type : coll){
            if(type.equals(find)) count++;
        }
        System.out.println(count);
        return count;
    }

    public static int maxInteger(Collection<Integer> coll){
        if(coll.isEmpty()) return 0;

        Integer max = null;
        for (Integer i : coll) max = max == null? i: Math.max(max, i);

        System.out.println(max);
        return max;
    }

    public static Number maxNumber(Collection<? extends Number> coll){
        if(coll.isEmpty()) return 0;

        Number max = null;
        for (Number i: coll) max = max == null? i: Math.max(max.doubleValue(), i.doubleValue());

        System.out.println(max);
        return max;
    }

    /*      Ta bien pero luego veo
    public static <T extends Number>Number maxNumber(Collection<T> coll){
        if(coll.isEmpty()) return 0;

        T max = null;
        for (T i: coll) max = max == null? i: Math.max(max.doubleValue(), i.doubleValue());

        System.out.println(max);
        return max;
    }
    */


    public static <T> void changeQueueu(Queue<T> q1, Queue<T> q2){
        if(q1.isEmpty()) return;;
        T mono = q1.poll();
        q2.add(mono);
    }
}
