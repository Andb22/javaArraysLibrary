import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower("Kate");
        book = new Book("Dracula", "Brahm Stoker", "Horror");
        ArrayList<Book> borrowed = new ArrayList<>();
        borrowed.add(book);
        library = new Library();

    }

    @Test
    public void borrowedStartsEmpty(){
        assertEquals(0, borrower.booksBorrowed());
    }

    @Test
    public void canBorrowBook(){
        borrower.borrow(book, library);
        assertEquals(1, borrower.booksBorrowed());
        assertEquals(0, library.getBooks());
    }

}
