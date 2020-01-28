import org.junit.Before;
import org.junit.Test;

//import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Dracula", "Brahm Stoker", "Horror");
    }

    @Test
    public void bookHasName(){
        assertEquals("Dracula", book.getTitle());
    }


}
