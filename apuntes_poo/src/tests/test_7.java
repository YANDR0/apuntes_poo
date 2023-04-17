package tests;

import Autoboxing.Buffer;

public class test_7 {
    public static void main(String[] args) {

        Buffer<String> stringBuffer = new Buffer<String>();
        stringBuffer.store("A");

        String a = stringBuffer.pop();  //No se usa cast

    }
}
