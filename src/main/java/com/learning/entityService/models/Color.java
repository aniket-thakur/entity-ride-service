package com.learning.entityService.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jdk.jfr.BooleanFlag;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Color extends BaseModel{
    @Column(unique = true, nullable = false)
    private String color;
}
