package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
  @Query(value = "SELECT a.* FROM accounts a LEFT JOIN account_banks ab ON a.id = ab.id", nativeQuery = true)
  List<Account> findAllAccounts();
}
