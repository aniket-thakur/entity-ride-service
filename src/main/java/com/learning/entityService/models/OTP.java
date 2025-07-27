package com.learning.entityService.models;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.Random;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OTP extends BaseModel {

    private String otpCode;

    private String sendToMobileNumber;

    public static OTP generateOTP(String mobileNumber){
        Random random = new Random();
        int code = random.nextInt( 99999) + 10000;
        return OTP.builder()
                .otpCode(Integer.toString(code))
                .sendToMobileNumber(mobileNumber)
                .build();
    }
}
