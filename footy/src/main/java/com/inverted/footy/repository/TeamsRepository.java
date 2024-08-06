package com.inverted.footy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.inverted.footy.models.Club;

public interface TeamsRepository extends MongoRepository<Club, String> {

}
