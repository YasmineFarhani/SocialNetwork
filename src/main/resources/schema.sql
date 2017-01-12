drop table Message if EXISTS;

CREATE TABLE Message
(
  id              VARCHAR(64) PRIMARY KEY,
  message         TEXT NOT NULL,
  friend          TEXT NOT NULL
);