package guru.springframework.spring5webapp.domain.bootstrap;

import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Component
public class DataInitializer implements CommandLineRunner {
    private final BookRepository repository;

    @Override
    public void run(String... args) {
        Book firstBook = new Book("DDD", "123", "random");
        log.info(firstBook.toString());
        repository.save(firstBook);
        List<Book> all = repository.findAll();
        all.forEach(book -> log.info(book.toString()));
    }
}
