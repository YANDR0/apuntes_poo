package Collections;

import java.util.ArrayList;

public class StringList extends ArrayList<String> {



    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("hola");
        strList.add("hola");
        strList.add("java");
        strList.add("java");
        System.out.println(strList);

        StringList strL1 = new StringList();
        strL1.add("hola");
        strL1.add("java");
        strL1.add("A");
        System.out.println(strL1);
    }

    @Override
    public boolean add(String s ){
        return super.add(s) && super.add(s);
    }
}
