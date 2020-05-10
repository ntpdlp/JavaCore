package basic.syntax.oop_inheritance;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Agile Testing",25.5f, "Rex Flix");
        Book book2 = new Book("Agile Testing",25.5f, "Rex Felix");
        EBook eBook = new EBook("Java","Jame Gosling",15.7f,1.5f);
        PaperBook paperBook1 = new PaperBook("Java8",18.5f,"Jame Goshling",200);
        PaperBook paperBook2 = new PaperBook("Java8",18.5f,"Jame Goshling",200);

        System.out.println(book1.toString());
        System.out.println(eBook.toString());

        System.out.println(paperBook1.equals(paperBook2));
        System.out.println(book1.equals(book2));
    }

}
