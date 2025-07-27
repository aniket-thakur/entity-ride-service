package com.learning.entityService.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Car extends BaseModel {
    @Column(unique = true, nullable = false)
    private String vehicleNumber;
    @Enumerated(value = EnumType.STRING)
    private CarBrand brand;
    private String model;
    private String variant;

    @ManyToOne
    private Color color;

    @OneToOne  // No mapping here, so this is the owning side
    private Driver driver;  // A car belongs to a driver
}
