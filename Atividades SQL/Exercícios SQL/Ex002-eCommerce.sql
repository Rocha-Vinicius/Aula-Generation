/*Atividade 2
Crie um banco de dados para um e commerce, onde o sistema trabalhará com as
informações dos produtos deste ecommerce.
Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos produtos para se trabalhar com o serviço deste ecommerce.
Popule esta tabela com até 8 dados;
Faça um select que retorne os produtos com o valor maior do que 500.
Faça um select que retorne os produtos com o valor menor do que 500.
Ao término atualize um dado desta tabela através de uma query de atualização.
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.
*/

CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_produtos (
	id_produtos BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255),
    marca VARCHAR(255),
    categoria VARCHAR(255),
    tamanho VARCHAR (255),
    preco DECIMAL (6,2),
    PRIMARY KEY(id_produtos)
);

INSERT INTO tb_produtos (nome, marca, categoria, tamanho, preco)
VALUES
("Camiseta Basica", "NIKE", "Camiseta", "M", 89.90),
("Lebron Witness V", "NIKE", "Tenis", "42", 399.90),
("Camiseta Scraw Core", "MCD", "Camiseta", "G", 99.90),
("Moletom Skull Clothing", "MCD", "Moletom", "G", 169.90),
("Air Jordan 1", "NIKE", "Tenis", "42", 1349.90),
("XplrS", "ADIDAS", "Tenis", "40", 339.99),
("Camiseta Basica", "ADIDAS", "Camiseta", "M", 69.90),
("Moletom", "ADIDAS", "Moletom", "M", 269.90);

SELECT nome, preco FROM tb_produtos WHERE preco >500;
SELECT nome, preco FROM tb_produtos WHERE preco <500;

UPDATE tb_produtos SET preco = 999.90 WHERE id_produtos = 5;

SELECT * FROM tb_produtos; 