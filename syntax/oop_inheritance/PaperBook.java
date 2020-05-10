package basic.syntax.oop_inheritance;

public class PaperBook extends Book{
    private int numberOfPages;

    PaperBook(String title, float price, String author,int numberOfPages){
        super(title,price,author);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public boolean equals(Object paperBook){
        if(paperBook == null) return false;
        if(this.getClass() != paperBook.getClass()) return false;
        PaperBook aPaperBook = (PaperBook) paperBook;
        return (this.getTitle().equals(aPaperBook.getTitle()) && this.getPrice()==aPaperBook.getPrice() &&this.getAuthor().equals(aPaperBook.getAuthor()) && this.getNumberOfPages() == aPaperBook.getNumberOfPages());
    }
}
