package com.hust.kstn.test;
import com.hust.kstn.models.Book;
import com.hust.kstn.models.BookAuthor;
import java.util.ArrayList;
import java.util.List;
public class BookTest {
    public static void main(String[] args) {
        BookAuthor a1 = new BookAuthor("Nguyen Nhat Anh", 1955, "Vietnamese writer of children books");
        BookAuthor a2 = new BookAuthor("Haruki Murakami", 1949, "Japanese novelist and writer");
        List<BookAuthor> authors = new ArrayList<>();
        authors.add(a1);
        authors.add(a2);
        Book book = new Book(
                1,
                "Kafka on the Shore",
                "Fiction",
                150.0f,
                85000,
                authors
        );
        System.out.println(book);
    }
}
