package com.sursan.SpringsecurityEazybank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

    @GetMapping("/myloans")
    public String getLoanDetails()
    {
        return "Here are the loan details from DB";
    }
}
