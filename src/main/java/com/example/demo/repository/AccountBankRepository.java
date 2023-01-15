package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.AccountBank;

@Repository
public interface AccountBankRepository extends JpaRepository<AccountBank, Integer> {
  
}
