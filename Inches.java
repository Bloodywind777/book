package book.book;

class Inches {

    public static void main() {
        long ci;
        int im;
        im = 5280 * 12;
        ci = im *im * im;
        System.out.println("B одной кубической миле содержится " + ci +
                " кубических дюймов");
        System.out.println(im);
    }
}
