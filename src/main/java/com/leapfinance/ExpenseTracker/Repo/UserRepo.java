package com.leapfinance.ExpenseTracker.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leapfinance.ExpenseTracker.Models.User;

public interface UserRepo extends JpaRepository<User,Long> {
    

    Optional<User> findByUsername(String username);
}
