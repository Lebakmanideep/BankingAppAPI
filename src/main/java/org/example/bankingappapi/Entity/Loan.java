package org.example.bankingappapi.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "loan")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private long customerId;

    private double amount;

    private double interestRate;

    private int duration;

    private Date startDate;

    private Date endDate;

    private String repaymentSchedule;

}
