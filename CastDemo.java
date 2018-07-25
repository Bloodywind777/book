package book.book;

public class CastDemo {

    public static void main(){

        double x,y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;
        i = (int) (x/y); // приведение типа double к типу int

        System.out.println("Целочисленный результат деления x / y = "+i);

        i=100;
        b = (byte) i;
        System.out.println("Значение b = "+b);

        i = 257;
        b = (byte) i;
        System.out.println("Значение b при i = 257 :  "+b);

        b = 88;
        ch = (char) b;
        System.out.println("Значение ch = "+ch);



    }

}
