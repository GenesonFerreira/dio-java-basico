##  Padrão de nomeclatura

## Arquivo .java:

Todo arquivo '.java' deve começar com letra MAIÚSCULA. Se a palavra for composta, a segunda palavra tambem deve ser maiúscula;

* Exemplo: 'Calculadora.java' ; 'CalculadoraCientifica.java'

## Nome da classe:

A classe deve possuir o mesmo nome do arquivo '.java';

* Exemplo: // arquivo 'CalculadoraCientifica.java'

* public class CalculadoraCientifica {
}

## Nome variavel:

Toda variavel deve ser escrita com a letra minúscula, porém se a palavra dor composta, a primeira letra da segunda palavra deve ser maiúscula;

* Exemplo: 'ano' e 'anoFabricacao'
* o nome dessa forma se chama "camelCase"

Existem algumas regras adicionais nas quais palavras sao 'final' e nao se pode modificar as variaveis delas, um exemplo basico é o 'br' que sempre representara 'Brasil'

* Exemplo: 
'final' String BR = "Brasil",
'final' double PI = 3.14
'final' int ESTADOS_BRASILEIROS = 27
'final' int ANO_2000 = 2000

## Declaração de variaveis:

* Deve conter apenas letras, underline ( _ ), sifrão( $ ) ou números de 0 à 9;
* Deve obrigatoriamente se iniciar por uma letra (PREFERENCIALMENTE), underline ou cifrão, JAMAIS POR NUMERO
* Deve iniciar com letra minuscula
* Nao pode conter espaço
* Nao podemos usar palavras-chave da linguagem
* O nome deve ser único dentro de um escopo

* Exemplos de declaraçoes invalidas: 
int numero&um = 1;
int 1numero = 1;
int numero um = 1;
int long = 1;

* Exemplo de declaraçoes validas: 
int numero_um = 1;
int numero1 = 1;
int numeroUm = 1;
int longo = 1;