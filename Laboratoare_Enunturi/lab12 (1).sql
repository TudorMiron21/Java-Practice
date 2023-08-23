-- CREATE TABLE IF NOT EXISTS author (
--   id INTEGER NOT NULL PRIMARY KEY,
--   name VARCHAR(50) NOT NULL,
--   country VARCHAR(25) NOT NULL,
--   city VARCHAR(25) NOT NULL 
-- ) ;

INSERT INTO author(id, name, country, city) VALUES (1, 'William Norton', 'UK', 'Cambridge');
INSERT INTO author(id, name, country, city) VALUES (2, 'William Maugham', 'Canada', 'Toronto');
INSERT INTO author(id, name, country, city) VALUES (3, 'William Anthony', 'UK', 'Leeds');
INSERT INTO author(id, name, country, city) VALUES (4, 'S.B.Swaminathan', 'India', 'Bangalore');
INSERT INTO author(id, name, country, city) VALUES (5, 'Thomas Morgan', 'Germany', 'Arnsberg');
INSERT INTO author(id, name, country, city) VALUES (6, 'Thomas Merton', 'USA', 'New York');
INSERT INTO author(id, name, country, city) VALUES (7, 'Piers Gibson', 'UK', 'London');
INSERT INTO author(id, name, country, city) VALUES (8, 'Nikolai Dewey', 'USA', 'Atlanta');
INSERT INTO author(id, name, country, city) VALUES (9, 'Marquis de Ellis', 'Brazil', 'Rio De Janerio');
INSERT INTO author(id, name, country, city) VALUES (10, 'Joseph Milton', 'USA', 'Houston');
INSERT INTO author(id, name, country, city) VALUES (11, 'John Betjeman Hunter', 'Australia', 'Sydney');
INSERT INTO author(id, name, country, city) VALUES (12, 'Evan Hayek', 'Canada', 'Vancouver');
INSERT INTO author(id, name, country, city) VALUES (13, 'E. Howard', 'Australia', 'Adelaide');
INSERT INTO author(id, name, country, city) VALUES (14, 'C. J. Wilde', 'UK', 'London');
INSERT INTO author(id, name, country, city) VALUES (15, 'Butler Andre', 'USA', 'Florida');

-- CREATE TABLE IF NOT EXISTS category (
--   id INTEGER NOT NULL PRIMARY KEY,
--   description VARCHAR(25) NOT NULL 
-- );

INSERT INTO category(id, description) VALUES (21, 'Science');
INSERT INTO category(id, description) VALUES (22, 'Technology');
INSERT INTO category(id, description) VALUES (23, 'Computers');
INSERT INTO category(id, description) VALUES (24, 'Nature');
INSERT INTO category(id, description) VALUES (25, 'Medical');
INSERT INTO category(id, description) VALUES (26, 'Literature');

-- CREATE TABLE IF NOT EXISTS book (
--   id INTEGER NOT NULL PRIMARY KEY,
--   name VARCHAR(50) NOT NULL,
--   isbn VARCHAR(15) NOT NULL,
--   cat_fk INTEGER NOT NULL,
--   aut_fk INTEGER NOT NULL,
--   no_page INTEGER NOT NULL,
--   price FLOAT
-- );

INSERT INTO book(id, name, isbn, cat_fk, aut_fk, no_page, price) VALUES (31, 'Introduction to Electrodynamics', '0000979001', 21, 1, 201, 85.00);
INSERT INTO book(id, name, isbn, cat_fk, aut_fk, no_page, price) VALUES (32, 'Understanding of Steel Construction', '0000979002', 22, 2, 300, 105.50);
INSERT INTO book(id, name, isbn, cat_fk, aut_fk, no_page, price) VALUES (33, 'Guide to Networking', '0000979003', 23, 3, 510, 200.00);
INSERT INTO book(id, name, isbn, cat_fk, aut_fk, no_page, price) VALUES (34, 'Transfer  of Heat and Mass', '0000979004', 22, 4, 600, 250.00);
INSERT INTO book(id, name, isbn, cat_fk, aut_fk, no_page, price) VALUES (35, 'Conceptual Physics', '0000979005', 21, 5, 345, 145.00);
INSERT INTO book(id, name, isbn, cat_fk, aut_fk, no_page, price) VALUES (36, 'Fundamentals of Heat', '0000979006', 21, 6, 247, 112.00);
INSERT INTO book(id, name, isbn, cat_fk, aut_fk, no_page, price) VALUES (37, 'Advanced 3d Graphics', '0000979007', 23, 7, 165, 56.00);
INSERT INTO book(id, name, isbn, cat_fk, aut_fk, no_page, price) VALUES (38, 'Human Anatomy', '0000979008', 25, 8, 88, 50.50);
INSERT INTO book(id, name, isbn, cat_fk, aut_fk, no_page, price) VALUES (39, 'Mental Health Nursing', '0000979009', 25, 9, 350, 145.00);
INSERT INTO book(id, name, isbn, cat_fk, aut_fk, no_page, price) VALUES (40, 'Fundamentals of Thermodynamics', '0000979010', 22, 10, 400, 225.00);
INSERT INTO book(id, name, isbn, cat_fk, aut_fk, no_page, price) VALUES (41, 'The Experimental Analysis of Cat', '0000979011', 24, 11, 225, 95.00);
INSERT INTO book(id, name, isbn, cat_fk, aut_fk, no_page, price) VALUES (42, 'The Nature  of World', '0000979012', 24, 5, '350', 88.00);
INSERT INTO book(id, name, isbn, cat_fk, aut_fk, no_page, price) VALUES (43, 'Environment a Sustainable Future', '0000979013', 24, 12, 165, 100.00);
INSERT INTO book(id, name, isbn, cat_fk, aut_fk, no_page, price) VALUES (44, 'Concepts in Health', '0000979014', 25, 13, 320, 180.00);
INSERT INTO book(id, name, isbn, cat_fk, aut_fk, no_page, price) VALUES (45, 'Anatomy & Physiology', '0000979015', 25, 14, 225, 135.00);
INSERT INTO book(id, name, isbn, cat_fk, aut_fk, no_page, price) VALUES (46, 'Networks and Telecommunications', '00009790_16', 23, 15, 95, 45.00);

