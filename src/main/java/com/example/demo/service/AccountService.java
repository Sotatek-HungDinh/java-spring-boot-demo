package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.AccountInterfaces.TestResponse;
import com.example.demo.models.Account;
import com.example.demo.repository.AccountRepository;

@Service
public class AccountService {

  @Autowired
  private AccountRepository accountRepository;

  public List<TestResponse> findAllAccounts() {
    return accountRepository.findAllAccounts();
  }

  public Optional<Account> findOne(int id) {
    return accountRepository.findById(id);
  }
}
