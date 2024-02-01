package com.leapfinance.ExpenseTracker.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leapfinance.ExpenseTracker.Models.User;
import com.leapfinance.ExpenseTracker.Services.UserService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/")
    public String getPage() {
        return "hello";
    }

    @GetMapping(path = "/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    // @PostMapping(path = "/user")
    // public String saveUser(@RequestBody User user){
    //     userRepo.save(user);
    //     return "Saved";
    // }

    // @PutMapping(path = "/user/{id}")
    // public String updateUser(@PathVariable long id,@RequestBody User user){
    //     User updatedUser = userRepo.findById(id).get();
    //     updatedUser.setFirstName(user.getFirstName());
    //     updatedUser.setLastName(user.getLastName());
    //     updatedUser.setAge(user.getAge());
    //     updatedUser.setOccupation(user.getOccupation());
    //     userRepo.save(updatedUser);
    //     return "Updated..";
    // }

    // @DeleteMapping(path = "user/{id}")
    // public String deleteUser(@PathVariable long id) {
    //     User deletedUser = userRepo.findById(id).get();
    //     userRepo.delete(deletedUser);

    //     return "User Deleted";
    // }

}
