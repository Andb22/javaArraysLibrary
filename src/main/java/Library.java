import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> catalogue;
    private int capacity;

    public Library (){
        this.catalogue = new ArrayList<>();
        this.capacity = 2;
    }

    public static void main(String[] args) {
        HashMap<String, Integer>booksByGenre = new HashMap<String, Integer>();
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

    public void removeBook(Book book) {
        this.catalogue.remove(book);
    }

}
