package org.example;

import lombok.RequiredArgsConstructor;
import org.example.Exception.MistakeAgeException;
import org.springframework.stereotype.Component;

import java.util.List;
@RequiredArgsConstructor
@Component
public class BookService {
 private final    List<Book> foundBooks;
    private final List<Book> books = List.of(new Book("War and peace",14), new Book("War of worlds",16), new Book("Crime and punishment",18), new Book("Master and Margarita",14));

    public List<Book> searchBook(String name) {
        for (var book : books
        ) {
            if (book.getName().startsWith(name))
                foundBooks.add(book);
        }
        return foundBooks;
    }

    public void validateAge(Integer age)  {
        if (age<0||age>18)
            throw new MistakeAgeException();
    }

}
