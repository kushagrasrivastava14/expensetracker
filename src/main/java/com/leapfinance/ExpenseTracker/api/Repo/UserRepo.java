package com.leapfinance.ExpenseTracker.api.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leapfinance.ExpenseTracker.api.Models.User;

public interface UserRepo extends JpaRepository<User,Long> {
    
}
