package com.inverted.footy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.inverted.footy.models.Players;

public interface PlayerRepository extends MongoRepository<Players, String> {

}
