package org.example.bankingappapi.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account")
public class Account {

    // define the fields
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountType;

    private long customerId;

    private double balance;

    private String accountNumber;

    private Date dateCreated;

    private Boolean isActive;

    private double interestRate;

    private double overdraftLimit;



}
