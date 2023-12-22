package com.valoshka.ReservationService.models;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private String customerID;

    @Column(name = "email")
    @NonNull
    private String email;

    @Column(name = "username")
    @NonNull
    private String username;

    @Column(name = "password")
    @NonNull
    private String password;

    @Column(name = "profile_info")
    private String profileInfo;

    @Column(name = "profile_image")
    private String profileImage;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private List<Reservation> reservationList;

}
