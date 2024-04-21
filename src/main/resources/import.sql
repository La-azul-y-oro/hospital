INSERT INTO hospital (id, number, phone, name, street, deleted) VALUES (1, 1, 3416275157, 'Hospital uno', 'Calle uno', false);
INSERT INTO hospital (id, number, phone, name, street, deleted) VALUES (2, 2, 3364254127, 'Hospital dos', 'Calle dos', false);
INSERT INTO hospital (id, number, phone, name, street, deleted) VALUES (3, 3, 1234578966, 'Hospital tres', 'Calle tres', false);

INSERT INTO department (id, name, hospital_id, deleted) VALUES (1, 'department uno', 1, false);
INSERT INTO department (id, name, hospital_id, deleted) VALUES (2, 'department uno', 1, false);
INSERT INTO department (id, name, hospital_id, deleted) VALUES (3, 'department uno', 2, false);
INSERT INTO department (id, name, hospital_id, deleted) VALUES (4, 'department uno', 2, false);
INSERT INTO department (id, name, hospital_id, deleted) VALUES (5, 'department uno', 3, false);
INSERT INTO department (id, name, hospital_id, deleted) VALUES (6, 'department uno', 3, false);

INSERT INTO staff (birthdate, department_id, id, joined, family_name, gender, given_name, deleted) VALUES ('1989-08-17', 1,1, '2024-04-21', 'Pedrozo', 'MALE', 'Miguel', false);
INSERT INTO staff (birthdate, department_id, id, joined, family_name, gender, given_name, deleted) VALUES ('1991-09-16', 1,2, '2024-04-21', 'Arce', 'FEMALE', 'Maria', false);
INSERT INTO staff (birthdate, department_id, id, joined, family_name, gender, given_name, deleted) VALUES ('1992-10-03', 2,3, '2024-04-21', 'Gonzalez', 'MALE', 'Lucas', false);
INSERT INTO staff (birthdate, department_id, id, joined, family_name, gender, given_name, deleted) VALUES ('1985-05-14', 3,4, '2024-04-21', 'De Miguel', 'FEMALE', 'Juana', false);
INSERT INTO staff (birthdate, department_id, id, joined, family_name, gender, given_name, deleted) VALUES ('1999-01-01', 4,5, '2024-04-21', 'Lhotse', 'FEMALE', 'Rafaela', false);
