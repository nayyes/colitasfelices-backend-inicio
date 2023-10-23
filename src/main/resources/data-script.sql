insert into Role values(1, 'ADMINISTRADOR');
insert into Role values(2, 'USUARIO');

insert into User values (1, 'admin@admin', 'admin', '$2a$10$uhnIWWDa.PrGOqpoLda6fuevn/RTJquP5GsGLhjVDpaNg64Ymf1Ee', 'admin');

insert into User_Role values (1, 1);