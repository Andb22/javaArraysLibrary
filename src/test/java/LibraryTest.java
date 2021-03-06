import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book("Dracula", "Brahm Stoker", "Horror");
    }

    @Test
    public void libraryIsEmptyAtStart(){
        assertEquals(0, library.getBooks());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.getBooks());
    }
}


