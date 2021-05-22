/*Atividade 1

Crie um banco de dados para um serviço de um game Online , o nome do banco deverá ter
o seguinte nome db_generation_game_online, onde, o sistema trabalhará com as
informações dos personagens desse game.

O sistema trabalhará com 2 tabelas tb_personagem e tb_classe.

siga exatamente esse passo a passo:

Crie uma tabela tb_classe utilizando a habilidade de abstração e determine 3 atributos
relevantes da classe para se trabalhar com o serviço desse game Online.

Crie uma tabela tb_personagem e utilizando a habilidade de abstração e determine 5
atributos relevantes dos funcionários para se trabalhar com o serviço desse game Online
(não esqueça de criar a foreign key de tb_classe nesta tabela).

Popule esta tabela classe com até 5 dados.

Popule esta tabela personagem com até 8 dados.

Faça um select que retorne os personagens com o poder de ataque maior do que 2000.

Faça um select trazendo os personagens com poder de defesa entre 1000 e 2000.

Faça um select utilizando LIKE buscando os personagens com a letra C.

Faça um um select com Inner join entre tabela classe e personagem.

Faça um select onde traga todos os personagem de uma classe específica (exemplo todos
os personagens que são arqueiros).
salve as querys para cada uma dos requisitos do exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.
*/
-- DROP DATABASE db_generation_game_online;

CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE  tb_classe(
	id_classe BIGINT NOT NULL AUTO_INCREMENT,
	classe VARCHAR(255),
    arma VARCHAR(255),
    PRIMARY KEY(id_classe)
);

CREATE TABLE tb_personagem(
	id_personagem BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    ataque INT,
    defesa INT,
	agilidade INT,
    inteligencia INT,
    raca VARCHAR(255),
    id_classe BIGINT,
   
   FOREIGN KEY (id_classe) REFERENCES tb_classe (id_classe),
   PRIMARY KEY(id_personagem) 
);

INSERT INTO tb_classe (classe, arma)
VALUES 
('Caçador', 'Espada'), 
('Alquimista', 'Varinha'), 
('Feiticeiro', 'Cajado'), 
('Assassino', 'Adagas'),
('Paladino', 'Espada Curta');

INSERT INTO tb_personagem (nome, raca, id_classe, ataque, defesa, agilidade, inteligencia)
VALUES 
('Ykdora', 'Humano', 3, 1100, 1500, 650, 900),
('Skaronul', 'Demonio', 2, 2500, 850, 650, 1700),
('Clabyran', 'Elfo', 4, 900, 650, 1580, 1500),
('Skaldr', 'Barbaro', 1, 2200, 850, 670, 750),
('Jazeg', 'Demonio', 4, 1000, 750, 1050, 1100),
('Madson', 'Humano', 2, 1400, 1050, 550, 2000),
('Chriises', 'Elfo', 1, 1860, 950, 850, 1570),
('Valwraek', 'Barbaro', 3, 1400, 1050, 550, 1800);

SELECT * FROM tb_personagem
WHERE ataque > 2000;

SELECT * FROM tb_personagem
WHERE defesa BETWEEN 1000 AND 2000;

SELECT * FROM tb_personagem
WHERE nome LIKE "%c%";

SELECT * FROM tb_personagem
INNER JOIN tb_classe ON tb_personagem.id_classe = tb_classe.id_classe;

SELECT * FROM tb_personagem
INNER JOIN tb_classe ON tb_personagem.id_classe = tb_classe.id_classe
AND tb_classe.classe = 'Alquimista';