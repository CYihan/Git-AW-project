public class Main {

    public static void main(String[] args) {

        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        System.out.println(add(a,b));
        System.out.println(subtract(b,a));
        System.out.println(multiply(a,b));

    }

    public static long add(int number1, int number2){
        return (long) number1 + number2;
    }

    private static int subtract(int b, int a) {
        return b - a;
    }




}



