package com.learning.entityService.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PassengerReview extends  Review{
    @Column(nullable = true)
    protected String passengerReview;
}
