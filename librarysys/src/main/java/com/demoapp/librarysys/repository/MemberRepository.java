package com.demoapp.librarysys.repository;

import com.demoapp.librarysys.model.Member;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends MongoRepository<Member, String> {
}
