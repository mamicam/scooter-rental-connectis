package com.example.scooterRentalApp.service;

import com.example.scooterRentalApp.api.BasicResponse;
import org.springframework.http.ResponseEntity;

public interface RentalService {

    ResponseEntity<BasicResponse> rentScooter(Long scooterId, Long accountId);

    ResponseEntity<BasicResponse> returnScooter(Long scooterId, Long accountId);
}
