package com.example.hateoas.word;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "words",path = "words")
public interface WordRepository extends JpaRepository<Word, Integer>{

}
