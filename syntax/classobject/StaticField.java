package basic.syntax.classobject;

class Book{
    static int staticNumberBooks;
    private int idBook;
    private String titleBook;

    Book(int id){
        idBook = id;
    }

    Book(String title){
        titleBook = title;
    }

    Book(){
        idBook=0;
        titleBook="Noname";
    }

    Book(int id, String title){
        idBook = id;
        titleBook = title;
    }

    //static block
    static {
        System.out.println("The static block call only 1 time, run firstly.");
    }

    //normal block (call n times): called before each new class instance
    {
        ++staticNumberBooks;
        System.out.println("Number of books: " + staticNumberBooks);
    }
}



public class StaticField {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book(123);
        Book b3 = new Book("Java Core");
    }
}
