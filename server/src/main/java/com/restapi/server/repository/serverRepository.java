package com.restapi.server.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.restapi.server.model.*;

public interface serverRepository extends MongoRepository<server, String> {
    Optional<List<server>> findByNameIgnoreCase(String name);
}
