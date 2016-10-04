CREATE TABLE person (
  id         INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(15) NOT NULL,
  last_name  VARCHAR(15) NOT NULL,
  address_id INT         NOT NULL,
  FOREIGN KEY (address_id) REFERENCES address (id)
);
CREATE TABLE address (
  id      INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  address VARCHAR(25)
);

INSERT INTO address VALUE (1, 'Ap #999-6608 Felis, St.');
INSERT INTO address VALUES (id, '8403 In Road');
INSERT INTO address VALUE (id, '4895 Dolor. Road');
INSERT INTO address VALUES (id, '233-3092 Sem Av.'), (id, 'Ap #258-8948 At, Rd.');
INSERT INTO address
VALUES (id, '2911 Nec, Rd.'), (id, '7886 Proin St.'), (id, 'Ap #314-418 Lorem Av.'), (id, 'Ap #821-4665 Lorem, Rd.'),
  (id, 'Ap #650-4921 Aptent Ave');

INSERT INTO person
VALUES (1, 'Vincent', 'Keith', 1), (id, 'Fritz', 'Bray', 2), (id, 'Lyle', 'Patterson', 3), (id, 'Holmes', 'Hardy', 4),
  (id, 'Cody', 'Larson', 5);
INSERT INTO person
VALUES (id, 'Gary', 'Ellis', 6), (id, 'Victor', 'Jensen', 7), (id, 'Galvin', 'Freeman', 8), (id, 'Jack', 'Foley', 9);
INSERT INTO person VALUES (id, 'Christian', 'Torres', 10), (id, 'Peter', 'Haney', 3), (id, 'Cameron', 'Barry', 2),
  (id, 'Aladdin', 'Barnett', 9);