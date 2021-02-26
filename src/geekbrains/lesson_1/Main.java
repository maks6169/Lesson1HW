package geekbrains.lesson_1;

public class Main {

    public static void main(String[] args) {

        zad3();
        zad8(1784);

        System.out.println(zad4(6,5,true));
        System.out.println(zad5(7));
        System.out.println(zad6(7));
        System.out.println(zad7("Максон"));


    }

    // 2 часть задания!

    static void zad2() {
        byte bt = 127;
        short sht = 32767;
        int integer = 654564;
        long lg = 87655065;
        float flt = 1.5f;
        double db = 1.6;
        boolean bln = true;
        char cr = 'p';
    }

    // 3 часть задания!

    static void zad3() {

        float a = 4;
        float b = 6;
        float c = 9;
        float d = 7;
        float x = a * (b + (c / d));
        System.out.println("Результат выражения = " + x);
    }

    // 4 часть задания!

    static String zad4(int a, int b, boolean rez) {

        if (a + b <= 20 && a + b >= 10) {
            return "Результат  " + rez;
        }
        { return "Результат  " + !rez;
        }
    }

    // 5 часть задания!

    static String zad5(int a) {

        if (a < 0) {
            return "Число отрицательное a = " +a;
        }
        {
            return "Число положительное a = " +a;
        }

    }
    // 6 часть задания!

    static String zad6(int a) {


        if (a < 0) {
            return "Результат  " + true;
        } return "Результат  " + false;

    }

    // 7 часть задания!

    static String zad7(String name) {

        char v = '!';
        return "Привет, " +name +v;
    }
    // 8 часть задания!

    static void zad8(int year) {

        if (year%4==0 && year%400==0 || year%100!=0) {
            System.out.println("Год високосный");
        } else System.out.println("Год не високосный");
    }

}

