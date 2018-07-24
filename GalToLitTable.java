package book.book;

import com.sun.jmx.snmp.internal.SnmpSubSystem;

public class GalToLitTable {

    public static void main(){
        double gallons, liters;
        int counter;
        double oneLiterInGallon = 3.7854;  //литров в одном галоне

        counter = 0; //счетчик
        for(gallons =1; gallons < 100; gallons++){
            liters = gallons * oneLiterInGallon; // Преобразовываем галоны в литры
            System.out.println(gallons + " галлонам соответствует " +
                    liters + " liters.");
            counter ++; // увеличиваем счетчик
            if(counter == 10){ //каждые 10 строк делаем отступ
                System.out.println(); //пустая строка
                counter = 0; //обнуляем счетчик
            }
        }

    }

}
