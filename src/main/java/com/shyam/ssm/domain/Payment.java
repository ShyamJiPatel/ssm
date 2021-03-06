package com.shyam.ssm.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Payment {
    @GeneratedValue
    @Id
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column
    private PaymentState state;
    @Column
    private BigDecimal amount;
}
