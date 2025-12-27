package com.example.barter.service.impl;

import com.example.barter.model.BarterTransaction;
import com.example.barter.repository.BarterTransactionRepository;
import com.example.barter.service.BarterTransactionService;
import org.springframework.stereotype.Service;

@Service
public class BarterTransactionServiceImpl implements BarterTransactionService {

    private final BarterTransactionRepository repository;

    public BarterTransactionServiceImpl(BarterTransactionRepository repository) {
        this.repository = repository;
    }

    @Override
    public BarterTransaction create(BarterTransaction transaction) {
        return repository.save(transaction);
    }
}
