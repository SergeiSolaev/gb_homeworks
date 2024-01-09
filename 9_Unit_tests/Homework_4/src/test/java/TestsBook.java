// У вас есть класс BookService, который использует интерфейс BookRepository для получения информации
// о книгах из базы данных. Ваша задача написать unit-тесты для BookService,
// используя Mockito для создания мок-объекта BookRepository.

import book.Book;
import book.BookService;
import book.InMemoryBookRepository;
import org.junit.Test;
import java.util.ArrayList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class TestsBook {

    @Test
    public void testFindBookById() {
        InMemoryBookRepository mockBookRepository = mock(InMemoryBookRepository.class);
        BookService bookService = new BookService(mockBookRepository);
        Book book = new Book("1", "Book1", "Author1");
        String bookId = "1";
        when(mockBookRepository.findById("1")).thenReturn(book);
        assertThat(bookService.findBookById(bookId)).isEqualTo(book);
        verify(mockBookRepository, times(1)).findById(bookId);
    }

    @Test
    public void testFindAllBooks() {
        InMemoryBookRepository mockBookRepository = mock(InMemoryBookRepository.class);
        BookService bookService = new BookService(mockBookRepository);
        Book book = new Book("1", "Book1", "Author1");
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book);
        when(mockBookRepository.findAll()).thenReturn(books);
        assertThat(bookService.findAllBooks()).isEqualTo(books);
        verify(mockBookRepository, times(1)).findAll();
    }
}
