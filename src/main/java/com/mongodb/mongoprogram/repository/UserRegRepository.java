package com.mongodb.mongoprogram.repository;

import com.mongodb.mongoprogram.domain.UserReg;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRegRepository extends MongoRepository<UserReg,String> {
}
