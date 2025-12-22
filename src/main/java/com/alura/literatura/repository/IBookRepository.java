package com.alura.literatura.repository;

import com.alura.literatura.model.Book;
import com.alura.literatura.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public interface IBookRepository extends JpaRepository<Book, Long> {

    List<Book> findByLanguage(Language language);

    List<Book> findTop10ByOrderByDownloadCountDesc();

    Optional<Objects> findByTitle(String title);
}
