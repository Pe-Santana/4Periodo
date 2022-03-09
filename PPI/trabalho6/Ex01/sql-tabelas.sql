CREATE TABLE cliente
(
   id int PRIMARY KEY auto_increment,
   nome varchar(50),
   cpf char(14) UNIQUE,
   email varchar(50) UNIQUE,
   hash_senha varchar(255),
   data_nascimento date,
   estado_civil varchar(30),
   altura int
) ENGINE=InnoDB;

CREATE TABLE endereco_entrega
(
   id int PRIMARY KEY auto_increment,
   cep char(10),
   endereco varchar(100),
   bairro varchar(50),
   cidade varchar(50),
   id_cliente int not null,
   FOREIGN KEY (id_cliente) REFERENCES cliente(id) ON DELETE CASCADE
) ENGINE=InnoDB;

CREATE TABLE endereco
(
   id int PRIMARY KEY auto_increment,
   cep char(10),
   logradouro varchar(100),
   bairro varchar(50),
   cidade varchar(50),
   estado varchar(2)
) ENGINE=InnoDB;

CREATE TABLE user
(
   id int PRIMARY KEY auto_increment,
   email varchar(50) UNIQUE,
   hash_senha varchar(255)
) ENGINE=InnoDB;

CREATE TABLE pessoa
(
   id int PRIMARY KEY auto_increment,
   nome varchar(50),
   sexo char(1),
   email varchar(50) UNIQUE,
   telefone varchar(50),
   cep char(10),
   logradouro varchar(100),
   cidade varchar(50),
   estado varchar(2)

) ENGINE=InnoDB;

CREATE TABLE paciente
(
   id int PRIMARY KEY auto_increment,
   peso numeric(9,2),
   altura int,
   tipoSanguineo varchar(3),
   codigo_pessoa int not null,
   FOREIGN KEY (codigo_pessoa) REFERENCES pessoa(id) ON DELETE CASCADE
) ENGINE=InnoDB;