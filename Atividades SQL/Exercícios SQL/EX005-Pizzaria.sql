/*Atividade 2

Crie um banco de dados para um serviço de pizzaria de uma empresa, o nome do banco
deverá ter o seguinte nome db_pizzaria_legal, onde o sistema trabalhará com as
informações dos produtos desta empresa.

O sistema trabalhará com 2 tabelas tb_pizza e tb_categoria.

siga exatamente esse passo a passo:

Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço dessa pizzaria.

Crie uma tabela de tb_pizza e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos tb_produto para se trabalhar com o serviço dessa pizzaria(não esqueça de
criar a foreign key de tb_categoria nesta tabela).

Popule esta tabela Categoria com até 5 dados.

Popule esta tabela pizza com até 8 dados.

Faça um select que retorne os Produtos com o valor maior do que 45 reais.

Faça um select trazendo os Produtos com valor entre 29 e 60 reais.

Faça um select utilizando LIKE buscando os Produtos com a letra C.

Faça um um select com Inner join entre tabela categoria e pizza.

Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são pizza doce).
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.
*/

-- DROP DATABASE db_pizzaria_legal;

CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria (
	id_categoria BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    massa VARCHAR(255) NOT NULL,
    
    PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_pizza (
	id_pizza BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
	id_categoria BIGINT NOT NULL,
    
    PRIMARY KEY (id_pizza),
    FOREIGN KEY (id_categoria) REFERENCES tb_categoria(id_categoria)
);

INSERT INTO tb_categoria (nome, massa)
VALUES
	('Salgada', 'Massa Tradicional'),
    ('Vegana', 'Massa Integral'),
    ('Doce', 'Massa Tradicional');

INSERT INTO tb_pizza (nome, descricao, id_categoria, preco)
VALUES
	('Calabresa', 'Calabresa em rodelas e cebola', 1, 56.90),
    ('Muçarela ', 'Muçarela', 1, 42.90),
    ('A moda da casa', 'Calabresa, muçarela e catupiry com bacon picado', 1, 66.90),
    ('Verguerita', 'Muçarela de castanha, tomate e manjericão', 2, 70.90),
    ('Suprema', 'Provolone de castanha, alcachofra, azeitona fatiada e cream gourmet', 2, 78.90),
    ('Queijo Mix', 'Muçarela de castanha, provolone de castanha cheddar vegano e cream gourmet', 2, 76.90),
    ('Brigadeiro', 'Chocolate e granulado', 3, 44.90),
    ('Caramelita', 'Creme de Leite Ninho e Crocante de caramelo', 3, 56.90);


SELECT nome, descricao, preco FROM tb_pizza WHERE preco > 45;

SELECT nome, descricao, preco FROM tb_pizza WHERE preco BETWEEN 29 AND 60;

SELECT nome, descricao, preco FROM tb_pizza WHERE nome LIKE '%C%';

SELECT tb_pizza.nome, tb_pizza.descricao, tb_categoria.nome AS categoria, tb_pizza.preco
FROM tb_pizza
INNER JOIN tb_categoria ON tb_pizza.id_categoria = tb_categoria.id_categoria;


SELECT tb_pizza.nome, tb_pizza.descricao, tb_categoria.nome AS categoria, tb_pizza.preco
FROM tb_pizza
INNER JOIN tb_categoria ON tb_pizza.id_categoria = tb_categoria.id_categoria
WHERE tb_categoria.nome LIKE '%Vegana%';