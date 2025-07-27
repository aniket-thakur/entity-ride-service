package com.learning.entityService.models;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NamedLocation extends BaseModel {
    @OneToOne
    private Location location;

    private String  name;

    private String pinCode;

    private String city;

    private String country;

    private String state;

}
