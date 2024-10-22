package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import jakarta.validation.constraints.Email; 
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Column;

@Data
@Document(collection = "users")
public class User {
    @Id
    private String id; 
    @Email
    @NotNull
    @Column(unique = true)
    private String email;

    private String password;
}
