package elm.springframework.spring6webapp.services;

import elm.springframework.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
