package elm.springframework.spring6webapp.repositories;

import elm.springframework.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

interface AuthorRepository extends CrudRepository<Author, Long> {
}