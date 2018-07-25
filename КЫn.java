package book.book;

public class KbIn {

    public static void main(){

        throws java.io.IOException{

            char ch;

            System.out.println("Нажмите на любую клавишу, а затем ENTER");
            ch = (char) System.in.read();
            System.out.println("Вы нажали клавишу: "+ch);
        }

    }

}
