//package com.alamin.bank;
//// BankingController.java
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/bank")
//public class BankingController {
//    private final AccountService accountService;
//
//    public BankingController(AccountService accountService) {
//        this.accountService = accountService;
//    }
//
//    @PostMapping("/createAccount")
//    public void createAccount(@RequestParam String accountNumber, @RequestParam double initialBalance) {
//        accountService.createAccount(accountNumber, initialBalance);
//    }
//
//    @GetMapping("/getBalance")
//    public double getBalance(@RequestParam String accountNumber) {
//        return accountService.getBalance(accountNumber);
//    }
//
//    @PostMapping("/deposit")
//    public void deposit(@RequestParam String accountNumber, @RequestParam double amount) {
//        accountService.deposit(accountNumber, amount);
//    }
//
//    @PostMapping("/withdraw")
//    public void withdraw(@RequestParam String accountNumber, @RequestParam double amount) {
//        accountService.withdraw(accountNumber, amount);
//    }
//}
