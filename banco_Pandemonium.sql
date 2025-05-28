CREATE DATABASE Pandemonium;
USE pandemonium;

CREATE TABLE Usuarios(
 id INT AUTO_INCREMENT PRIMARY KEY,
 senha VARCHAR(200) NOT NULL,
 email VARCHAR(200) NOT NULL,
 telefone INT (17) NOT NULL,
 nome_musica VARCHAR(200) NOT NULL,
 nome_banda VARCHAR(200) NOT NULL
);

CREATE TABLE Instrumentos(

-- eu pensei em vc aqui colocar nao so o nome pra vc se exibir, mas tbm qual linha, guitarra lead ,rythm, solo ou drive
 guitarra VARCHAR(200) NOT NULL,
 baixo VARCHAR (200) NOT NULL,
 bateria VARCHAR(200) NOT NULL,
 banjo VARCHAR(200) NOT NULL,
 piano VARCHAR(200) NOT NULL,
 trompete VARCHAR(200) NOT NULL,
 batuque VARCHAR(200) NOT NULL,
 teclado VARCHAR(200) NOT NULL,
 tambor VARCHAR(200) NOT NULL,
 teremim VARCHAR(200) NOT NULL,
 orgao VARCHAR(200) NOT NULL,
 vocal VARCHAR(200) NOT NULL,
 violao VARCHAR(200) NOT NULL,
 viola VARCHAR(200) NOT NULL,
 sintetizador VARCHAR(200) NOT NULL,
 -- fiz tudo o que lembrei caraio
 pedal VARCHAR(100) NOT NULL
 );
 
 CREATE TABLE guitarra(
 qtd_cordas INT NOT NULL,
 cordas_nome VARCHAR(20) NOT NULL, 
 tom VARCHAR(2) NOT NULL,
 knobs INT NOT NULL,  -- ?
 captadores INT NOT NULL, -- tbm nao sei pq coloquei essa merda
 drive VARCHAR (2), -- aqui vc poe se vai usar ou nao,entao usa o S ou N
 chave_seletora VARCHAR (5) NOT NULL,
  FOREIGN KEY (id) REFERENCES Usuarios(id));
 
 
 CREATE TABLE violao(
 qtd_cordas INT NOT NULL,
 cordas_nome VARCHAR(20) NOT NULL, 
 tom VARCHAR(2) NOT NULL,
 FOREIGN KEY (id) REFERENCES Usuarios(id));
 
 CREATE TABLE baixo(
 qtd_cordas INT NOT NULL,
 cordas_nome VARCHAR(20) NOT NULL, 
 tom VARCHAR(2) NOT NULL,
 knobs INT NOT NULL,  -- ?
 captadores INT NOT NULL, -- tbm e importante saber
 drive VARCHAR (2),
FOREIGN KEY (id) REFERENCES Usuarios(id)); -- tem louco pra tudo nessa porra desse mundo
 
  CREATE TABLE banjo(
 qtd_cordas INT NOT NULL,
 cordas_nome VARCHAR(20) NOT NULL, 
 tom VARCHAR(2) NOT NULL,
  FOREIGN KEY (id) REFERENCES Usuarios(id));
 
  CREATE TABLE bateria(
 qtd_pratos INT NOT NULL,
 partes VARCHAR(20) NOT NULL, 
 tom VARCHAR(2) NOT NULL,
FOREIGN KEY (id) REFERENCES Usuarios(id));
 
  CREATE TABLE viola(
 qtd_cordas INT NOT NULL,
 cordas_nome VARCHAR(20) NOT NULL, 
 tom VARCHAR(2) NOT NULL,
 FOREIGN KEY (id) REFERENCES Usuarios(id));
 
  CREATE TABLE teclado(
 qtd_teclas INT NOT NULL,
 qtd_oitavas VARCHAR(20) NOT NULL, 
 tom VARCHAR(2) NOT NULL,
 FOREIGN KEY (id) REFERENCES Usuarios(id));
 
  CREATE TABLE piano(
 qtd_teclas INT NOT NULL,
 qtd_oitavas VARCHAR(20) NOT NULL, 
 tom VARCHAR(2) NOT NULL,
  FOREIGN KEY (id) REFERENCES Usuarios(id));
 
  CREATE TABLE orgao(
 qtd_teclas INT NOT NULL,
 qtd_oitavas VARCHAR(20) NOT NULL, 
 tom VARCHAR(2) NOT NULL,
  FOREIGN KEY (id) REFERENCES Usuarios(id));
 
  CREATE TABLE pedal(
 tipo VARCHAR(200) NOT NULL,
 nome VARCHAR(20) NOT NULL, 
 efeitos VARCHAR(30) NOT NULL,
 knobs VARCHAR(2) NOT NULL,
 FOREIGN KEY (id) REFERENCES Usuarios(id),
 FOREIGN KEY (guitarra) REFERENCES Instrumentos(guitarra),
 FOREIGN KEY (baixo) REFERENCES Instrumentos(baixo));
 
  CREATE TABLE bateria(
 tom VARCHAR(2) NOT NULL,
 qtd_pratos int(20) NOT NULL,
 qtd_pedal int(20) NOT NULL,
 partes VARCHAR(30) NOT NULL,
  FOREIGN KEY (id) REFERENCES Usuarios(id));
 
 
 
 