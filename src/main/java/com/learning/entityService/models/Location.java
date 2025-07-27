package com.learning.entityService.models;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Location extends BaseModel {

    private Double latitude;

    private Double longitude;
}
