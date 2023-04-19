package Autoboxing;

import java.util.HashMap;
import java.util.TreeSet;
import java.util.Vector;

public class contenedores {

    public static void main(String[] args) {

        //Listas
        /*
        Vector<String> strVector = new Vector<>();
        strVector.add("uno");
        strVector.add("dos");
        strVector.add("tres");
        strVector.add("cuatro");
        strVector.add("cinco");
        strVector.add("seis");
        System.out.println(strVector);

        strVector.set(3, "dos");

        for(int i = 0; i < strVector.size(); i++){
            strVector.set(i,strVector.get(i).toUpperCase());
            System.out.println(strVector.get(i));

        }

        System.out.println(strVector.indexOf("dos"));
        System.out.println(strVector.indexOf("cuatro"));
        */



        //Conjunto
        TreeSet<Integer> intSet = new TreeSet<>();

        int[] array = {100, 150, 120, 100, 180, 200, 120, 180, 200};

        for (int num: array) intSet.add(num);
        System.out.println("Size: " + intSet.size());

        for(int num: intSet) System.out.println(num);

        HashMap<String, Integer> stringHashMap = new HashMap<String, Integer>();

        stringHashMap.put("uno", 1);
        stringHashMap.put("dos", 2);
        stringHashMap.put("tres", 3);
        stringHashMap.put("cuatro", 4);
        stringHashMap.put("cinco", 5);

        System.out.println(stringHashMap.get("tres"));
        System.out.println(stringHashMap.get("siete"));





    }
}
