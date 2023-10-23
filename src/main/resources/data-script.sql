insert into role values(1, 'ADMINISTRADOR');
insert into role values(2, 'USUARIO');

insert into user values (1, 'admin@admin', 'admin', '$2a$10$uhnIWWDa.PrGOqpoLda6fuevn/RTJquP5GsGLhjVDpaNg64Ymf1Ee', 'admin');

insert into user_role values (1, 1);