package elm.springframework.spring6webapp.bootstrap;

import elm.springframework.spring6webapp.domain.Author;
import elm.springframework.spring6webapp.domain.Book;
import elm.springframework.spring6webapp.domain.Publisher;
import elm.springframework.spring6webapp.repositories.AuthorRepository;
import elm.springframework.spring6webapp.repositories.BookRepository;
import elm.springframework.spring6webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE Development without EJB");
        noEJB.setIsbn("345345345");

        Publisher pub1 = new Publisher();
        pub1.setPublisherName("Phoenix Publishing");
        var savedPublisher1 = publisherRepository.save(pub1);

        Publisher pub2 = new Publisher();
        pub2.setPublisherName("Solid Rock Publishing");
        var savedPublisher2 = publisherRepository.save(pub2);

        var ericSaved = authorRepository.save(eric);
        var dddSaved = bookRepository.save(ddd);

        var rodSaved = authorRepository.save(rod);
        var noEjbSaved = bookRepository.save(noEJB);

        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEjbSaved);
        dddSaved.getAuthors().add(ericSaved);
        noEjbSaved.getAuthors().add(rodSaved);

        publisherRepository.save(pub1);
        publisherRepository.save(pub2);

        dddSaved.setPublisher(pub1);
        noEjbSaved.setPublisher(pub2);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);
        bookRepository.save(dddSaved);
        bookRepository.save(noEjbSaved);

        System.out.println("In Bootstrap");
        System.out.println("Author count : "+authorRepository.count());
        System.out.println("Book count : "+bookRepository.count() );
        System.out.println("Publisher count : "+publisherRepository.count());

    }
}
