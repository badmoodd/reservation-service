package com.valoshka.ReservationService.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@jakarta.persistence.Table(name = "tables")
@Data
@NoArgsConstructor
public class Table {

    @Id
    @Column(name = "table_id")
    private long tableID;

    @Column(name = "availability")
    @NonNull
    private boolean availability;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "table_id_key")
    private Restaurant restaurant;
}
