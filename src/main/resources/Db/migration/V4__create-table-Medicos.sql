CREATE TABLE Medicos(
    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    crm VARCHAR(10) NOT NULL UNIQUE,  
    especialidade VARCHAR(100) NOT NULL,
    telefone VARCHAR(20),  
    logradouro VARCHAR(100) NOT NULL,
    bairro VARCHAR(100) NOT NULL,
    cep CHAR(8) NOT NULL,  
    complemento VARCHAR(100),
    numero VARCHAR(20),
    uf char(2) not null,
    cidade VARCHAR(100) NOT NULL,
    PRIMARY KEY(id)
);