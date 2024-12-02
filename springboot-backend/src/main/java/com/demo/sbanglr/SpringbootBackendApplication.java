package com.demo.sbanglr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.sbanglr.model.User;
import com.demo.sbanglr.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String...args) throws Exception {
        this.userRepository.save(new User("Naveen", "Sajan", "ns@gmail.com"));
        this.userRepository.save(new User("Rahul", "Prasad", "rp@gmail.com"));
        this.userRepository.save(new User("Sanjo", "Shaji", "ss@gmail.com"));
        this.userRepository.save(new User("Alvin", "Aji", "aj@gmail.com"));
        this.userRepository.save(new User("Sahil", "Sharma", "sash@gmail.com"));
    }
}