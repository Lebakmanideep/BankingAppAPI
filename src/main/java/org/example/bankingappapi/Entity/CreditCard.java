package org.example.bankingappapi.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "credit_card")
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long creditCardNumber;

    private long customerId;

    private Date expiryDate;

    private double creditLimit;

    private double availableLimit;

    private String billingAddress;

    private String transcationHistory;



}
