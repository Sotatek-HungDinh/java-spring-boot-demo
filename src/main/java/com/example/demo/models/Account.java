package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
public class Account {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "status")
  private String status;

  @Column(name = "account_type")
  private String accountType;

  @Column(name = "account_number")
  private String accountNumber;

  @Column(name = "amount")
  private String amount;

  @Column(name = "amount_investment")
  private String amountInvestment;

  @Column(name = "amount_block")
  private String amountBlock;

  @Column(name = "amount_getmoney")
  private String amountGetmoney;

  @Column(name = "amount_wait_investment")
  private String amountWaitInvestment;

  @Column(name = "amount_wait_loanfromown")
  private String amountWaitLoanfromown;

  @Column(name = "amount_loan")
  private String amountLoan;

  @Column(name = "amount_loan_credit")
  private String amountLoanCredit;

  @Column(name = "amount_loan_debit")
  private String amountLoanDebit;

  @Column(name = "descriptions")
  private String descriptions;

  @Column(name = "customer_id")
  private int customerId;

  @Column(name = "block_reward")
  private String blockReward;

  @Column(name = "total_reward_claimed")
  private String totalRewardClaimed;

  @Column(name = "profit_non_term")
  private String profitNonTerm;

  @OneToOne
  @JoinColumn(name = "id")
  private AccountBank accountBank;

  public String getAccountNumber() {
    return accountNumber;
  }

  // public AccountBank getAccountBank() {
  // return accountBank;
  // }

  public String getAccountType() {
    return accountType;
  }

  public String getAmount() {
    return amount;
  }

  public String getAmountBlock() {
    return amountBlock;
  }

  public String getAmountGetmoney() {
    return amountGetmoney;
  }

  public String getAmountInvestment() {
    return amountInvestment;
  }

  public String getAmountLoan() {
    return amountLoan;
  }

  public String getAmountLoanCredit() {
    return amountLoanCredit;
  }

  public String getAmountLoanDebit() {
    return amountLoanDebit;
  }

  public String getAmountWaitInvestment() {
    return amountWaitInvestment;
  }

  public String getAmountWaitLoanfromown() {
    return amountWaitLoanfromown;
  }

  public String getBlockReward() {
    return blockReward;
  }

  public int getCustomerId() {
    return customerId;
  }

  public String getDescriptions() {
    return descriptions;
  }

  public String getProfitNonTerm() {
    return profitNonTerm;
  }

  public String getStatus() {
    return status;
  }

  public String getTotalRewardClaimed() {
    return totalRewardClaimed;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public void setAmountBlock(String amountBlock) {
    this.amountBlock = amountBlock;
  }

  public void setAmountGetmoney(String amountGetmoney) {
    this.amountGetmoney = amountGetmoney;
  }

  public void setAmountInvestment(String amountInvestment) {
    this.amountInvestment = amountInvestment;
  }

  public void setAmountLoan(String amountLoan) {
    this.amountLoan = amountLoan;
  }

  public void setAmountLoanCredit(String amountLoanCredit) {
    this.amountLoanCredit = amountLoanCredit;
  }

  public void setAmountLoanDebit(String amountLoanDebit) {
    this.amountLoanDebit = amountLoanDebit;
  }

  public void setAmountWaitInvestment(String amountWaitInvestment) {
    this.amountWaitInvestment = amountWaitInvestment;
  }

  public void setAmountWaitLoanfromown(String amountWaitLoanfromown) {
    this.amountWaitLoanfromown = amountWaitLoanfromown;
  }

  public void setBlockReward(String blockReward) {
    this.blockReward = blockReward;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  public void setDescriptions(String descriptions) {
    this.descriptions = descriptions;
  }

  public void setProfitNonTerm(String profitNonTerm) {
    this.profitNonTerm = profitNonTerm;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setTotalRewardClaimed(String totalRewardClaimed) {
    this.totalRewardClaimed = totalRewardClaimed;
  }
}
