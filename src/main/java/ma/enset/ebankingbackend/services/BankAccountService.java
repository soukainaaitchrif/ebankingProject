package ma.enset.ebankingbackend.services;

import ma.enset.ebankingbackend.dtos.*;

import java.util.List;

public interface BankAccountService {
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) ;
    SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) ;
    List<CustomerDTO> listCustomers();
    BankAccountDTO getBankAccount(String accountId) ;
    void debit(String accountId, double amount, String description) ;
    void credit(String accountId, double amount, String description) ;

    List<BankAccountDTO> bankAccountList();

    CustomerDTO getCustomer(Long customerId) ;


}