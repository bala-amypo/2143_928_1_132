package com.example.barter.repository;

import com.example.barter.model.BarterTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarterTransactionRepository extends JpaRepository<BarterTransaction, Long> {
}
