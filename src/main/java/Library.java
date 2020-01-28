import java.util.ArrayList;

public class Library {

    private ArrayList<Book> catalogue;
    private int capacity;

    public Library (){
        this.catalogue = new ArrayList<>();
        this.capacity = 2;
    }

    public int getBooks(){
        return this.catalogue.size();
    }

    public void addBook(Book book) {
        if (this.capacity > 0) {
            this.catalogue.add(book);
            this.capacity -= 1;
        }
    }
}
