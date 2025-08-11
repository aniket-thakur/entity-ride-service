ALTER TABLE booking ADD pickup_point_id BIGINT NULL;
ALTER TABLE booking ADD drop_point_id BIGINT NULL;

ALTER TABLE booking  ADD CONSTRAINT fk_booking_pickup_point FOREIGN KEY(pickup_point_id)
REFERENCES location(id);
ALTER TABLE booking  ADD CONSTRAINT fk_booking_drop_point FOREIGN KEY(drop_point_id)
REFERENCES location(id);