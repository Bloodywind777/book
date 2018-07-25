package book.book;

public class LogicalOpTaЬle {
    public static void main(){

        boolean p, q;

        System.out.println("P\tQ\tAND\tOR\tNOT");
        p = q = true;
        System.out.println(p + "\t"+ q + "\t");
        System.out.println((p&q) +"\t"+ (p|q) +"\t");
        System.out.println((p^q) +"\t"+ (!p));

        p = true;
        q = false;
        System.out.println(p +"\t" + q + "\t");
        System.out.println((p&q) +"\t"+ (p|q) +"\t");
        System.out.println((p^q) +"\t"+ (!p));

        p = false;
        q = true;
        System.out.println(p +"\t" + q + "\t");
        System.out.println((p&q) +"\t"+ (p|q) +"\t");
        System.out.println((p^q) +"\t"+ (!p));

        p = false;
        q = false;
        System.out.println(p +"\t" + q + "\t");
        System.out.println((p&q) +"\t"+ (p|q) +"\t");
        System.out.println((p^q) +"\t"+ (!p));

    }
}
