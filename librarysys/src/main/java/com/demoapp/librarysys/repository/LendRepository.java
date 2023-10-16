package com.demoapp.librarysys.repository;

import com.demoapp.librarysys.model.Book;
import com.demoapp.librarysys.model.Lend;
import com.demoapp.librarysys.model.LendStatus;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LendRepository extends MongoRepository<Lend, String> {
    Optional<Lend> findByBookAndStatus(Book book, LendStatus status);
}
