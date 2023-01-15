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
@Table(name = "account_banks")
public class AccountBank {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  public AccountBank() {
    super();
  }

  @OneToOne
  @JoinColumn(name = "id")
  private Account account;

  @Column(name = "PVCOMBank_number")
  private String PVCOMBankNumber;

  @Column(name = "VPBank_number")
  private String VPBankNumber;

  @Column(name = "account_number")
  private String accountNumber;

  @Column(name = "account_number_status")
  private String accountNumberStatus;

  @Column(name = "account_number_declineReason")
  private String accountNumberDeclineReason;

  @Column(name = "bank_name")
  private String bankName;

  @Column(name = "bank_name_status")
  private String bankNameStatus;

  @Column(name = "bank_name_decline_reason")
  private String bankNameDeclineReason;

  @Column(name = "owner_name")
  private String ownerName;

  @Column(name = "owner_name_status")
  private String ownerNameStatus;

  @Column(name = "owner_name_decline_reason")
  private String ownerNameDeclineReason;

  @Column(name = "status")
  private String status;

  @Column(name = "customer_id")
  private String customerId;

  public String getAccountNumber() {
    return accountNumber;
  }

  public Account getAccount() {
    return account;
  }

  public String getAccountNumberDeclineReason() {
    return accountNumberDeclineReason;
  }

  public String getAccountNumberStatus() {
    return accountNumberStatus;
  }

  public String getBankName() {
    return bankName;
  }

  public String getBankNameDeclineReason() {
    return bankNameDeclineReason;
  }

  public String getBankNameStatus() {
    return bankNameStatus;
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public String getOwnerNameDeclineReason() {
    return ownerNameDeclineReason;
  }

  public String getOwnerNameStatus() {
    return ownerNameStatus;
  }

  public String getPVCOMBankNumber() {
    return PVCOMBankNumber;
  }

  public String getVPBankNumber() {
    return VPBankNumber;
  }

  public String getStatus() {
    return status;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public void setAccountNumberDeclineReason(String accountNumberDeclineReason) {
    this.accountNumberDeclineReason = accountNumberDeclineReason;
  }

  public void setAccountNumberStatus(String accountNumberStatus) {
    this.accountNumberStatus = accountNumberStatus;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public void setBankNameDeclineReason(String bankNameDeclineReason) {
    this.bankNameDeclineReason = bankNameDeclineReason;
  }

  public void setBankNameStatus(String bankNameStatus) {
    this.bankNameStatus = bankNameStatus;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public void setOwnerNameDeclineReason(String ownerNameDeclineReason) {
    this.ownerNameDeclineReason = ownerNameDeclineReason;
  }

  public void setOwnerNameStatus(String ownerNameStatus) {
    this.ownerNameStatus = ownerNameStatus;
  }

  public void setPVCOMBankNumber(String pVCOMBankNumber) {
    PVCOMBankNumber = pVCOMBankNumber;
  }

  public void setVPBankNumber(String vPBankNumber) {
    VPBankNumber = vPBankNumber;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}