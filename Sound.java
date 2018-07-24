package book.book;

public class Sound {
    public static void main(){
        double dist,dist2,sek;
        sek = 2.3; // Время через которое услышали гром, после молнии
        int speed = 1100; //1100 фут/c скорость звука

        dist = speed*sek;
        dist2 = (speed*sek)/2;

        System.out.println("Дистанция  до места вспышки состовляет "+dist+" футов");
        System.out.println("Дистанция  до скалы "+dist2+" футов");
    }
}
