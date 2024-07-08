package elm.springframework.spring6webapp.services;

import elm.springframework.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
