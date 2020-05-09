package basic.syntax.oop.oop_inheritance;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Agile Testing",25.5f, "Rex Flix");
        EBook eBook = new EBook("Java","Jame Gosling",15.7f,1.5f);
        System.out.println(book.toString());
        System.out.println(eBook.toString());
    }

}
