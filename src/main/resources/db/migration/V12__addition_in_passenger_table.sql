ALTER TABLE driver  ADD is_available BOOLEAN;

CREATE TABLE passenger_review (
  id BIGINT NOT NULL,
   passenger_review VARCHAR(255) NULL,
   CONSTRAINT pk_passengerreview PRIMARY KEY (id)
);

ALTER TABLE passenger_review ADD CONSTRAINT FK_PASSENGERREVIEW_ON_ID FOREIGN KEY (id) REFERENCES booking_review (id);


ALTER TABLE passenger ADD  exact_location_id BIGINT NULL;
ALTER TABLE passenger ADD  last_location_id BIGINT NULL;
ALTER TABLE passenger ADD  rating DOUBLE NULL;

ALTER TABLE passenger ADD CONSTRAINT FK_PASSENGER_ON_EXACT_LOCATION FOREIGN KEY (exact_location_id) REFERENCES location (id);

ALTER TABLE passenger ADD CONSTRAINT FK_PASSENGER_ON_LAST_LOCATION FOREIGN KEY (last_location_id) REFERENCES location (id);