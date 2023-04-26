package Collections;


public class Average {

    public static double avg (int... array){
        if(array.length == 0) return 0;
        double total = 0;
        for(int x: array)  total += x;
        return total / array.length;
    }

    public static double distance(double a, double... array){
        if(array.length == 0) return 0;
        double total = 0;
        for(double x: array)  total += Math.max((a-x), -1*(a-x));
        return  total /  (array.length);
    }

    public static void main(String[] args) {

        System.out.println(String.format("%.1f", distance(4.5)));
        System.out.println(String.format("%.1f", distance(3, -2)));
        System.out.println(String.format("%.1f", distance(1, 1.4, 0.8)));
        System.out.println(String.format("%.1f", distance(0, 0,1,2,3,4)));
        System.out.println(String.format("%.1f", distance(1, 0,1,2,3,4)));
        System.out.println(String.format("%.1f", distance(2, 0,1,2,3,4)));

    }
}
