package htw.webtech.myapp;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import java.util.List;


    @RestController
    @RequestMapping("/api/books")
    @CrossOrigin(origins = "*") // später enger setzen
    public class BookController {
        private final BookRepository repo;

        public BookController(BookRepository repo) {
            this.repo = repo;
        }

        @GetMapping
        public List<Book> all() {
            return repo.findAll();
        }
    }

