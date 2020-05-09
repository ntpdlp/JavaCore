package basic.syntax.oop.oop_inheritance;

public class EBook extends Book {
    private float fileSize;

    EBook(String title, String author, float price, float fileSize){
        super(title,price,author);
        this.fileSize = fileSize;
    }

    public float getFileSize() {
        return fileSize;
    }

    public void setFileSize(float fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String toString(){
        return super.toString() + ", fileSize: " + fileSize;
    }
}
