package com.example.barter.controller;

import com.example.barter.model.BarterTransaction;
import com.example.barter.service.BarterTransactionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transactions")
public class BarterTransactionController {

    private final BarterTransactionService service;

    public BarterTransactionController(BarterTransactionService service) {
        this.service = service;
    }

    @PostMapping
    public BarterTransaction create(@RequestBody BarterTransaction transaction) {
        return service.create(transaction);
    }
}
