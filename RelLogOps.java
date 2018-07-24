package book.book;

public class RelLogOps {

    public static void main(){
        int i,j;
        boolean b1,b2;

        i=10;
        j=11;
        if(i<j) System.out.println("i<j");
        if(i<=j) System.out.println("i<=j");
        if(i>j) System.out.println("i>j");
        if(i>=j) System.out.println("i>=j");
        if(i != j) System.out.println("i != j");
        if(i == j) System.out.println("i == j");

        b1 = true;
        b2 = false;

        if(b1 & b2) System.out.println("b1 & b2 :FALSE");
        if(b1 | b2) System.out.println("b1 | b2 : TRUE");
        if(b1 ^ b2) System.out.println("b1 ^ b2 : TRUE");
        if(!(b1 & b2)) System.out.println("!(b1 & b2): true");

    }

}
