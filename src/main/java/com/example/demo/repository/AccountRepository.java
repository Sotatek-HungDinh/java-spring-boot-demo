package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.interfaces.AccountInterfaces.TestResponse;
import com.example.demo.models.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
  @Query(value = "SELECT a.id, ab.account_number, a.amount FROM accounts a LEFT JOIN account_banks ab ON a.id = ab.id", nativeQuery = true)
  // khi select từng trường (k phải select *) cần tạo interfaces để định nghĩa type. VD: TestResponse
  // còn select All thì type là entity luôn
  List<TestResponse> findAllAccounts();
}
