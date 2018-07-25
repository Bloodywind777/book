package book.book;

public class SideEffects {
    public static void main(){

        int i;
        i=0;

        if(false & (++i < 100))
            System.out.println("Не отобразится");
        System.out.println("Оператор if выполняется "+i);


        if(false && (++i < 100))
            System.out.println("Этa строка не будет отображаться");
        System.out.println("переменная i осталось равна "+i);
    }
}
