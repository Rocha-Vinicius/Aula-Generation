/*Atividade 4

Crie um banco de dados para um serviço de um açougue ou uma quitanda, o nome do
banco deverá ter o seguinte nome db_cidade_das_carnes ou db_cidade_das_frutas, onde o
sistema trabalhará com as informações dos produtos desta empresa.

O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.

siga exatamente esse passo a passo:

Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço desse açougue.

Crie uma tabela de tb_produto e utilize a habilidade de abstração e determine 5 atributos
relevantes dos tb_produto para se trabalhar com o serviço desse açougue(não esqueça de
criar a foreign key de tb_categoria nesta tabela).

Popule esta tabela Categoria com até 5 dados.

Popule esta tabela Produto com até 8 dados.

Faça um select que retorne os Produtos com o valor maior do que 50 reais.

Faça um select trazendo os Produtos com valor entre 3 e 60 reais.

Faça um select utilizando LIKE buscando os Produtos com a letra C.

Faça um um select com Inner join entre tabela categoria e produto.

Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são aves ou legumes).

Salve as querys para cada uma dos requisitos do exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.
*/

-- DROP DATABASE db_cidade_das_carnes;

CREATE DATABASE db_cidade_das_carnes;

USE db_cidade_das_carnes;

CREATE TABLE tb_categoria (
	id_categoria BIGINT NOT NULL AUTO_INCREMENT,
    tipo VARCHAR(255),
    estoque BIGINT,
    
    PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produtos(
	id_produtos BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    corte VARCHAR(255),
    preco DECIMAL(10,2),
    id_categoria BIGINT,
    
    PRIMARY KEY (id_produtos),
    FOREIGN KEY (id_categoria) REFERENCES tb_categoria (id_categoria)
); 

INSERT INTO tb_categoria(tipo, estoque)
VALUES
("Aves",80),
("Peixes",65),
("Bovinos",150);

INSERT INTO tb_produtos(nome, corte, preco, id_categoria)
VALUES
("Filé Mignon", "Bife", 60.45, 3),
("Fraldinha", "Medalhão", 33.50, 3),
("Alcatra", "Cubos", 35.60, 3),
("Coxa e sobrecoxa", "Corte simples", 22.45, 1),
("Asa de frango", "Corte simples", 20.70, 1),
("Salmão", "Corte simples", 48.75, 2),
("Atum", "Corte simples", 22.65, 2),
("Bacalhau", "Corte simples", 38.70, 2);

SELECT nome, tipo, preco FROM tb_produtos
WHERE preco > 50; 

SELECT nome, corte, preco FROM tb_produtos
WHERE preco BETWEEN 3 AND 60;

SELECT nome, preco FROM tb_produtos
WHERE nome LIKE "%C%";

SELECT * FROM tb_produtos
INNER JOIN tb_categoria
ON tb_produtos.id_categoria = tb_categoria.id_categoria; 

SELECT * FROM tb_produtos
INNER JOIN tb_categoria
ON tb_produtos.id_categoria = tb_categoria.id_categoria
WHERE tb_categoria.tipo = "Bovinos";
