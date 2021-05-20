/*Atividade 3
Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as
informações dos alunos deste registro dessa escola.
Crie uma tabela alunos/a/e e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos alunos/a/e para se trabalhar com o serviço dessa escola.

Popule esta tabela com até 8 dados;
Faça um select que retorne o/as alunos/a/e com a nota maior do que 7.
Faça um select que retorne o/as alunos/a/e com a nota menor do que 7.
Ao término atualize um dado desta tabela através de uma query de atualização.
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.
*/


CREATE DATABASE db_escola;

USE db_escola;

CREATE TABLE tb_alunos(
	id_aluno BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255),
    nasc DATE,
    turma VARCHAR(255),
    ultimanota FLOAT(3,2),
    media FLOAT(3,2),
    PRIMARY KEY(id_aluno)
);

INSERT INTO tb_alunos (nome, nasc, turma, ultimanota, media)
VALUES
("Davi", '2005-09-12', "B",  7.5, 7.9),
("Bianca", '2007-06-19', "A",  9.5, 8.9),
("Carlos", '2004-07-26', "A",  5.3, 6.5),
("Thamires", '2008-04-24', "C",  6.9, 6),
("Pedro", '2009-06-12', "A",  8.5, 8),
("Carolina", '2005-09-16', "A",  7.5, 8.5),
("Miguel", '2003-12-06', "B",  5.5, 6.9),
("David", '2009-02-01', "B",  9.5, 9.2);

SELECT nome, media FROM tb_alunos WHERE media > 7;
SELECT nome, media FROM tb_alunos WHERE media < 7;

UPDATE tb_alunos SET nasc = '2007-06-20' WHERE id_aluno = 2;

SELECT * FROM tb_alunos