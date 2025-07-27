CREATE TABLE otp (
  id BIGINT AUTO_INCREMENT NOT NULL,
   created_at datetime NOT NULL,
   updated_at datetime NOT NULL,
   otp_code VARCHAR(255) NULL,
   send_to_mobile_number VARCHAR(255) NULL,
   CONSTRAINT pk_otp PRIMARY KEY (id)
);