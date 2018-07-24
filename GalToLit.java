package book.book;

public class GalToLit {
    public static void main(){
        double gallons;
        double liters;
        final double LitInOneGall = 3.7854; // 3.7854 литров в одном галоне
        gallons = 10;

        liters = gallons * LitInOneGall;

        System.out.println(gallons + " галлонам соответствует " +
                liters + " литров");

    }

}
