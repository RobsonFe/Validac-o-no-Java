# Validação no Java Sem Bibliotecas

![Banner](link_para_sua_imagem_banner)

## Introdução

Bem-vindo(a) ao repositório **ValidaçãoNoJavaSemLib**, um lugar onde exploramos o empolgante mundo da validação em Java, tudo isso sem a necessidade de depender de bibliotecas externas. Se você já se perguntou como poderia realizar validações de entrada de dados sem recorrer a bibliotecas prontas, você está no lugar certo!

## Sobre o Projeto

Neste repositório, você encontrará soluções que vão além das bibliotecas convencionais. Mergulhamos no desafio de validar entradas em Java de maneira elegante e eficaz, e tudo isso foi inspirado por uma experiência pessoal.

### O Desafio Inicial

Eu me perguntava: "Como posso realizar validações em Java sem depender de bibliotecas externas?" Especialmente porque eu estava acostumado a usar a `RestrictedTextField` para restringir campos em projetos desktop com o Swing. A busca por uma abordagem mais personalizada e lógica era o objetivo.

### A Descoberta

Minha jornada de descoberta me levou a várias abordagens, mas uma delas brilhou: utilizar o método `TryCatch` em conjunto com o tratamento do `Scanner`. Essa técnica utiliza a exceção `InputMismatchException`, que retorna uma mensagem personalizada - "Digite apenas números!".

## Como Funciona

A abordagem é incrivelmente limpa e eficaz para exercícios de lógica. Aqui está um vislumbre:

```java
 try {
        int n = scan.nextInt();
        System.out.println(n);
    } catch (InputMismatchException e) {
        System.out.println("Digite apenas números!");
    }
```

## Como Usar Este Repositório

Navegue pelos arquivos e pastas deste repositório para explorar soluções de validação em Java. Sinta-se à vontade para examinar o código-fonte, testar as implementações e adaptá-las aos seus próprios projetos. 

## Contribua

Se você tem ideias para melhorar ou deseja compartilhar suas próprias abordagens de validação em Java, sinta-se à vontade para contribuir! Basta fazer um fork deste repositório, adicionar suas melhorias e enviar um pull request.

## Contato

Você pode me encontrar [aqui](https://www.linkedin.com/in/robson-ferreira-508247134/) para discutir ideias, compartilhar feedback ou apenas trocar algumas palavras sobre programação, Java e desenvolvimento em geral.

Espero que este repositório seja útil e inspire você a abordar a validação de forma única em seus projetos!

