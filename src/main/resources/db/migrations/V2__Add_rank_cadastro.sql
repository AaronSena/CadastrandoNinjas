-- V2: Migration para adicionar a coluna de ranking na tabela cadastro

ALTER TABLE cadastro
ADD COLUMN rank VARCHAR(255);