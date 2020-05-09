package basic.syntax.oop.oop_inheritance;

public class Book {
    private String title;
    private float price;
    private String author;

    Book(String title, float price, String author){
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString(){
        return "title: " + title + ", author: " + author + ", price: "  + price ;
    }
}
