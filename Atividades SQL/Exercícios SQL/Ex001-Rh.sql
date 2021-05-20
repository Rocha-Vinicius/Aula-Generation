/* Atividade 1
Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema
trabalhará com as informações dos funcionaries desta empresa.
Crie uma tabela de funcionaries e utilizando a habilidade de abstração e determine 5
atributos relevantes dos funcionaries para se trabalhar com o serviço deste RH.
Popule esta tabela com até 5 dados;
Faça um select que retorne os funcionaries com o salário maior do que 2000.
Faça um select que retorne os funcionaries com o salário menor do que 2000.
Ao término atualize um dado desta tabela através de uma query de atualização.
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.
*/

CREATE DATABASE db_rhempresa;

USE db_rhempresa;

CREATE TABLE tb_funcionarios (
	id_funcionarios BIGINT NOT NULL AUTO_INCREMENT,
	nome VARCHAR(255) DEFAULT 'Funcionario',
    tel INT,
    data_inicio DATE,
    salario DECIMAL(10,2),
    data_saida DATE,
    PRIMARY KEY (id_funcionarios)
);

INSERT INTO tb_funcionarios (nome, tel, data_inicio, salario, data_saida)
VALUES 
("Vinicius",  123456789, '2015-08-15',  6500.00, '2018-04-17'),
("Fernanda", 123456789, '2015-02-15',  1890.00, '2018-11-17'),
("Gabriela", 123456789, '2013-10-05',  8500.00, '2016-07-25'),
("Fernando", 123456789, '2019-02-15',  1650.00, '2020-03-15'); 

SELECT nome, salario FROM tb_funcionarios WHERE salario > 2000.00;
SELECT nome, salario FROM tb_funcionarios WHERE salario < 2000.00; 

UPDATE tb_funcionarios SET salario = 2200.00 WHERE id_funcionarios = 2;

SELECT * FROM tb_funcionarios;