package com.valoshka.ReservationService.models;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "restaurants")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_id")
    private String restaurantID;

    @Column(name = "name")
    @NonNull
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "profile_image")
    private String profileImage;

    @Column(name = "address")
    private String address;

    @Column(name = "working_schedule")
    private String workingSchedule;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "restaurant")
    private List<com.valoshka.ReservationService.models.Table> tablesList;


}
