/*Atividade 3

Crie um banco de dados para um serviço de farmácia de uma empresa, o nome do banco
deverá ter o seguinte nome db_farmacia_do_bem, onde o sistema trabalhará com as
informações dos produtos desta empresa.

O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.

siga exatamente esse passo a passo:

Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço desta farmacia.

Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5
atributos relevantes dos tb_produto para se trabalhar com o serviço deste farmacia(não
esqueça de criar a foreign key de tb_categoria nesta tabela).

Popule esta tabela Categoria com até 5 dados.

Popule esta tabela Produto com até 8 dados.

Faça um select que retorne os Produtos com o valor maior do que 50 reais.

Faça um select trazendo os Produtos com valor entre 3 e 60 reais.

Faça um select utilizando LIKE buscando os Produtos com a letra B.

Faça um um select com Inner join entre tabela categoria e produto.

Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são cosméticos).
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.
*/

-- DROP DATABASE db_farmacia_do_bem;
	
CREATE DATABASE db_farmacia_do_bem;

USE db_farmacia_do_bem;

CREATE TABLE tb_categoria(
	id_categoria BIGINT NOT NULL AUTO_INCREMENT,
	categoria VARCHAR(255),
	estoque BIGINT,
    
    PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produtos(
	id_produtos BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255),
    laboratorio VARCHAR(255) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
	id_categoria BIGINT,
    
    PRIMARY KEY (id_produtos),
    FOREIGN KEY (id_categoria) REFERENCES tb_categoria(id_categoria)
);

INSERT INTO tb_categoria (categoria, estoque)
VALUES
	('Medicamentos', 300),
    ('Higiene', 200),
    ('Cosmético', 230);
    
INSERT INTO tb_produtos (nome, laboratorio, id_categoria, preco)
VALUES
	('Citalopram', 'MEDLEY', 1, 60.92),
    ('Amoxilina', 'EMS', 1, 52.92),
    ('Escova de dente', 'COLGATE', 2, 22.90),
    ('Barbeador', 'GILLETTE', 2, 48.92),
    ('Dorflex', 'SANOFI', 1, 5.89),
    ('Hidratante Facial', 'NEUTROGENA', 3, 67.99),
    ('Novalgina', 'SANOFI', 1, 17.55),
    ('Hidratante Corporal','NEUTROGENA', 3, 74.72);
    
SELECT nome, laboratorio, preco FROM tb_produtos WHERE preco > 50;

SELECT nome, laboratorio, preco FROM tb_produtos WHERE preco BETWEEN 3 AND 60;

SELECT nome, laboratorio, preco FROM tb_produtos WHERE nome LIKE '%B%';

SELECT tb_produtos.nome, tb_produtos.laboratorio, tb_categoria.categoria AS categoria, tb_produtos.preco
FROM tb_produtos
INNER JOIN tb_categoria ON tb_produtos.id_categoria = tb_categoria.id_categoria;

SELECT tb_produtos.nome, tb_produtos.laboratorio, tb_categoria.categoria AS categoria, tb_produtos.preco
FROM tb_produtos
INNER JOIN tb_categoria ON tb_produtos.id_categoria = tb_categoria.id_categoria
WHERE tb_categoria.categoria LIKE '%Cosmetico%';
