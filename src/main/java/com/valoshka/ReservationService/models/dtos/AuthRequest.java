package com.valoshka.ReservationService.models.dtos;

import lombok.Data;

@Data
public class AuthRequest {

    private String email;
    private String password;
}
