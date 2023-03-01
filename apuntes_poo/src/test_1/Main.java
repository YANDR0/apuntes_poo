package test_1;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        //ejercicio_1();
        //ejercicio_2();
        //ejercicio_3();
        //ejercicio_4();
        //ejercicio_5();
        //ejercicio_6();
        ejercicio_7();
    }

    static void ejercicio_7(){
        String testo = JOptionPane.showInputDialog(null, "Ingrese la presición requerida:" );
        long intentos;

        try{
            intentos = Long.parseLong(testo);
            if(intentos <= 0)
                intentos = 1000;
        } catch (Exception e) {
            intentos = 1000;
        }

        double pi = 0;

        for(long i = 0; i < intentos; i++)
            pi += 1.0/(i*2+1) * Math.pow(-1, i);

        pi *= 4;
        JOptionPane.showMessageDialog(null, String.format("Pi vale: %f", pi));
    }

    static void ejercicio_6(){

        String preciotr = "";
        double precionum = 0;

        do{
            preciotr = JOptionPane.showInputDialog("Digame el precio: ");

            try{
                precionum = Double.parseDouble(preciotr);
                if(precionum > 0)
                    JOptionPane.showMessageDialog(null, String.format("El precio es %.2f", precionum));
                else
                    JOptionPane.showMessageDialog(null, "Mayor a 0 porfa");
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Eso que >:V");
            }


        }while(precionum <= 0);

        JOptionPane.showMessageDialog(null, "Se logró gente");


    }


    static void ejercicio_5(){

        String clave = "jericalla";
        String respuesta = "";
        int intentos = 0;

        do{
            respuesta = JOptionPane.showInputDialog(null, "Ingrese la clave");
            if(respuesta == null) break;
            if(respuesta.equals("")) continue;

            intentos++;

            if(!respuesta.equals(clave))
                JOptionPane.showMessageDialog(null, "Clave incorrecta");
            else break;

        } while(!respuesta.equals(clave));

        JOptionPane.showMessageDialog(null, String.format("Lo lograste en %d intentos", intentos));

    }


    static void ejercicio_4(){
        String month = JOptionPane.showInputDialog(null, "Ingrese el mes: ");
        month = month.toLowerCase().replaceAll(" ", "");

        int days = 0;

        switch (month){
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                days = 30;
                break;

            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                days = 31;
                break;

            case "febrero":
                int year = Integer.parseInt(JOptionPane.showInputDialog("¿De que año estamos hablando?: "));
                if(year%4 == 0 && year%100 != 0 || year%400 == 0)
                    days = 29;
                else
                    days = 28;
        }

        if(days == 0)
            JOptionPane.showMessageDialog(null, "Eso que we");
        else
            JOptionPane.showMessageDialog(null, String.format("El mes tiene %d días", days));
    }


    static void ejercicio_3(){
        String lenguaje = JOptionPane.showInputDialog(null, "¿Cuál es tu lenguaje de programación favorito?");
        lenguaje = lenguaje.toLowerCase().trim().replaceAll(" ", "");

        if (lenguaje.equals("java"))
            JOptionPane.showMessageDialog(null, "Tu lenguaje es el mero mero");

        else if (lenguaje.equals("c"))
            JOptionPane.showMessageDialog(null, "Felicidades, usas el segundón");

        else if (lenguaje.equals("c++"))
            JOptionPane.showMessageDialog(null, "El tre");

        else
            JOptionPane.showMessageDialog(null, "Y ese cual piñas es");
    }


    static void ejercicio_2(){
        String velocidad_s = JOptionPane.showInputDialog( "Velocidad promedio (Km/h):");
        String distancia_s = JOptionPane.showInputDialog( "Distancia por recorrer (Km):");
        String tiempo_s = JOptionPane.showInputDialog( "Tiempo deseado (minutos):");

        double velocidad = Double.parseDouble(velocidad_s);
        double distancia = Double.parseDouble(distancia_s);
        double tiempo = Double.parseDouble(tiempo_s);

        double t_real = distancia / velocidad * (double)60;

        if (t_real <= tiempo) JOptionPane.showMessageDialog(null, "Se llega","Resultado",  JOptionPane.INFORMATION_MESSAGE);
        else JOptionPane.showMessageDialog(null, "No se llega", "Resultado",JOptionPane.ERROR_MESSAGE);
    }


    static void ejercicio_1() {
        String nombre = JOptionPane.showInputDialog( "Ingrese su nombre:");
        String p = JOptionPane.showInputDialog( "Escriba su primer apellido:");
        String m = JOptionPane.showInputDialog( "Tecleé su segundo apellido:");

        nombre = nombre == null? "" : nombre.toUpperCase().trim();
        p = p == null? "" : p.toUpperCase().trim();
        m = m == null? "" : m.toUpperCase().trim();

        String r = String.format("%s %s, %s", p, m, nombre);
        JOptionPane.showMessageDialog(null, r);
    }

}