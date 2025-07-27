package com.learning.entityService.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.DecimalMin;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Passenger extends BaseModel {
    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String mobileNumber;

    @OneToOne
    private Location exactLocation;

    @OneToOne
    private Location lastLocation;

    @DecimalMin(value = "0.0",message = "Rating must be greater or equal to 0.0")
    @DecimalMin(value = "5.0", message = "Rating must be less than or equal to 5.0")
    private Double rating;

    @OneToMany(mappedBy = "passenger")
    List<Booking> bookings = new ArrayList<>();

}