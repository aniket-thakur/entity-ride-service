CREATE TABLE named_location (
  id BIGINT AUTO_INCREMENT NOT NULL,
   created_at datetime NOT NULL,
   updated_at datetime NOT NULL,
   location_id BIGINT NULL,
   name VARCHAR(255) NULL,
   pin_code VARCHAR(255) NULL,
   city VARCHAR(255) NULL,
   country VARCHAR(255) NULL,
   state VARCHAR(255) NULL,
   CONSTRAINT pk_namedlocation PRIMARY KEY (id)
);

ALTER TABLE named_location ADD CONSTRAINT FK_NAMEDLOCATION_ON_LOCATION FOREIGN KEY (location_id) REFERENCES location (id);