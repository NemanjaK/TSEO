INSERT INTO users(ime, password, prezime, role, username) VALUES ('Pera', 'a', 'Peric', 'ADMINISTRATOR', 'pera');
INSERT INTO users(ime, password, prezime, role, username) VALUES ('Marko', 'n', 'Markovic', 'NASTAVNIK', 'marko');
INSERT INTO users(ime, password, prezime, role, username) VALUES ('Laza', 's', 'Lazic', 'STUDENT', 'laza');
INSERT INTO users(ime, password, prezime, role, username) VALUES ('Milos', 's', 'Teodosic', 'STUDENT', 'milos');
INSERT INTO users(ime, password, prezime, role, username) VALUES ('Nikola', 's', 'Jokic', 'STUDENT', 'nikola');
INSERT INTO users(ime, password, prezime, role, username) VALUES ('Boban', 'n', 'Marjanovic', 'NASTAVNIK', 'boban');
INSERT INTO users(ime, password, prezime, role, username) VALUES ('Nikola', 'n', 'Kalinic', 'NASTAVNIK', 'dzoni');

INSERT INTO student(adresa, broj_indeksa, broj_telefona, jmbg, stanje, tekuci_racun, user_id) VALUES ('Bulevar Evrope 1', 'SF-1-2016', '063124356', '0101997123456', 2000, '123-5783986278103-12', 3);
INSERT INTO student(adresa, broj_indeksa, broj_telefona, jmbg, stanje, tekuci_racun, user_id) VALUES ('Narodnog fronta 3', 'SF-2-2016', '0601242353', '0202997678543', 1000, '321-1234567890123-33', 4);
INSERT INTO student(adresa, broj_indeksa, broj_telefona, jmbg, stanje, tekuci_racun, user_id) VALUES ('Bulevar Oslobodjenja 12', 'SF-3-2016', '0641413523', '0303997658921', 1000, '367-6489263785103-99', 5);

INSERT INTO nastavnik(adresa, jmbg, uloga_nastavnika, user_id) VALUES('Safarikova 5', '0404980765423', 'PROFESOR', 2);
INSERT INTO nastavnik(adresa, jmbg, uloga_nastavnika, user_id) VALUES('Fruskogorska 13', '0505993098263', 'ASISTENT', 6);
INSERT INTO nastavnik(adresa, jmbg, uloga_nastavnika, user_id) VALUES('Bulevar Patrijarha Pavla 65', '0606992123456', 'ASISTENT', 7);

INSERT INTO uplata(datum, iznos, poziv_na_broj, racun_primaoca, svrha_uplate, student_id) VALUES('2020-01-01', 200, '22-55555-1-4444-4444', '123-1234567-12', 'Prijava ispita', 1);
INSERT INTO uplata(datum, iznos, poziv_na_broj, racun_primaoca, svrha_uplate, student_id) VALUES('2020-01-02', 200, '12-12345-3-1234-1234', '123-1234567-12', 'Prijava ispita', 2);
INSERT INTO uplata(datum, iznos, poziv_na_broj, racun_primaoca, svrha_uplate, student_id) VALUES('2020-01-02', 9000, '34-87623-5-7892-8395', '123-1234567-12', 'Uplata skolarine', 3);

INSERT INTO rok(naziv) VALUES ('Januarski');
INSERT INTO rok(naziv) VALUES ('Aprilski');
INSERT INTO rok(naziv) VALUES ('Junski');
INSERT INTO rok(naziv) VALUES ('Septembarski');
