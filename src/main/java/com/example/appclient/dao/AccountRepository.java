package com.example.appclient.dao;

import com.example.appclient.model.Account;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository  extends MongoRepository<Account,String> {

}
