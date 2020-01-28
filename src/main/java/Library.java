import java.util.ArrayList;

public class Library {

    private ArrayList<Book> catalogue;

    public Library (){
        this.catalogue = new ArrayList<>();
    }

    public int getBooks(){
        return this.catalogue.size();
    }
}
