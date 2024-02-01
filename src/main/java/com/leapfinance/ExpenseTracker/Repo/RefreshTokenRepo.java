package com.leapfinance.ExpenseTracker.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leapfinance.ExpenseTracker.Models.RefreshToken;


public interface RefreshTokenRepo extends JpaRepository<RefreshToken, Long> {
    
}
