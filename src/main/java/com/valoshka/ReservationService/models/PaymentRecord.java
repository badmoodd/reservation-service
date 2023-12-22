package com.valoshka.ReservationService.models;

import com.valoshka.ReservationService.models.enums.PaymentType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PaymentRecord {
    private long paymentID;
    private BigDecimal amount;
    private LocalDateTime dateTime;
    private PaymentType paymentType;
    private Reservation reservation;
    private Customer customer;

}
