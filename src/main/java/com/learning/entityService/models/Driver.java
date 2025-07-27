package com.learning.entityService.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.awt.print.Book;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends BaseModel {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String licenseNumber;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = true)
    private String mobileNumber;

    //    A driver can have many bookings
    @OneToMany(mappedBy = "driver",  fetch = FetchType.LAZY)
    @Fetch(FetchMode.SUBSELECT)
    private List<Booking> bookings;

    @OneToOne(mappedBy = "driver",cascade = CascadeType.ALL)
    private Car car;  // A driver has a car (non owning side)

    @Enumerated(value = EnumType.STRING)
    private DriverApprovalStatus driverApprovalStatus;

    private String activeCity;

    @OneToOne
    private Location lastLocation;

    @OneToOne
    private Location home;

    @DecimalMin(value = "0.0",message = "Rating must be greater or equal to 0.0")
    @DecimalMin(value = "5.0", message = "Rating must be less than or equal to 5.0")
    private Double rating;

    @OneToMany(mappedBy = "driver")
    @Fetch(FetchMode.SUBSELECT)
    private List<Booking> booking;
}
