CREATE TABLE location (
  id BIGINT AUTO_INCREMENT NOT NULL,
   created_at datetime NOT NULL,
   updated_at datetime NOT NULL,
   latitude DOUBLE NULL,
   longitude DOUBLE NULL,
   CONSTRAINT pk_location PRIMARY KEY (id)
);