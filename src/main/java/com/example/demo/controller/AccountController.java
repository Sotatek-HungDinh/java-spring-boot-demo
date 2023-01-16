package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.interfaces.AccountInterfaces.TestResponse;
import com.example.demo.models.Account;
import com.example.demo.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

  @Autowired
  private AccountService accountService;

  @GetMapping
  public List<TestResponse> findAllAccount() {
    try {
      return accountService.findAllAccounts();
    } catch (Exception e) {
      return null;
    }
  }

  @GetMapping("/{id}")
  public Optional<Account> findOne(@PathVariable("id") Integer id) {
    return accountService.findOne(id);
  }

}
