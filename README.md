# CRUDGermatech

## O QUE É A APLICAÇÃO :

Essa é uma aplicação de CRUD básico em que consiste em manipular dados no banco através da entidade Pessoa.

## FUNCIONALIDADES :

- Encontra uma pessoa registrada no sistema por ID.
- Encontra uma lista de pessoas registradas no sistema.
- Registra uma pessoa no sistema.
- Atualiza dados de uma pessoa do sistema.
- Deleta uma pessoa do sistema.

## VERSIONAMENTO :

Versão do Java: 17

Versão do Spring Boot: 3.0.2

## FERRAMENTAS :

Back end:

      - Java
      - Spring Data JPA
      - Maven

Dependências:

     Data JPA - > Utilizando o JPA para fazer a ponte entre o banco de dados e a aplicação -> ORM

     Web -> É uma aplicação WEB, Utilizado para receber requisições, devolver uma resposta ...

     PostgreSQL -> Utilizado esse BANCO no ambiente de desenvolvimento e produção.

     LomBok -> Utilizado para evitar muitas linhas de código através de annotations.

     Toncat -> Servidor usado para abrir a aplicação

Programas Utilizados :

    Postman - Utilizado para fazer as requisições (CONSUMIR) a aplicação.
    
    IntelliJ - IDE escolhida para desenvolver o projeto.
    
    pgAdmin4 - Plataforma utilizada para fazer a manipulação e a leitura dos dados de uma base de dados do banco PostgreSQL.
    
    Git e GitHub - Utilizados para commitar o projeto e subir o código para a nuvem(remoto).

Bancos de Dados :

    PostgreSQL - Usado em ambiente de desenvolvimento e produção.


Dev Teste JAVA - Germantech Sistemas

Faça um programa (CRUD) em JAVA com os requisitos abaixo, utilizando um banco de dados para armazenar as informações (preferencialmente PostgreSQL).


O programa deve cadastrar um usuário com as informações de: Nome, telefone, e-mail, CPF e senha.
Deverá existir outra classe chamada "CadastroUsuarios" que seja responsável por gerenciar a lista de usuários. Esta classe deve permitir as seguintes operações:

Faça uma interface para permitir ao usuário escolher entre as operações mencionadas abaixo. A tela poderá ser em JFrame ou como preferir.

1 - Adicionar um novo usuário.
2 - Editar as informações de um usuário existente (com base no CPF).
3 - Excluir um usuário (com base no CPF).
4 - Listar todos os usuários cadastrados.

Além disso, outras funcionalidades necessárias:
A conexão com o banco de dados pode ser feito preferencialmente com: JDBC Connection ou Hibernate;
Organização na estrutura de pastas (em MVC ou alguma estrutura de sua escolha);
Implementação de Interface com os respectivos métodos do CRUD;
As senhas dos usuários devem ser armazenadas de forma segura no banco de dados utilizando hashing (por exemplo, usando bcrypt ou outro algoritmo seguro);
Ao listar usuários, implemente filtros (por nome, email ou parte do CPF) para tornar a consulta mais eficiente e prática.
Deve existir tratamento de exceções adequado para casos como tentar cadastrar CPF's duplicados e/ou usuário não encontrado para edição/exclusão.

Regras básicas:
Adicionar máscara no campo de CPF.
O campo CPF deve ser validado, para permitir apenas CPF's válidos.
Os campos CPF e nome devem ser obrigatórios.






Dev Teste JAVA 2 - Germantech Sistemas

1 - Crie um programa para verificar e gerar cadastros de CPF/CNPJ. Esse programa deverá conter uma interface gráfica de sua escolha.

Regras: Deverão ser utilizadas bibliotecas para a verificação dos CPF's / CNPJ's.


O usuário deve poder:
-Verificar se o CNPJ e/ou CPF informado é válido.
-Poder escolher gerar novos CPF's/CNPJ's fictícios válidos.


--O exercício 2 pode ser feito na sequência, continuando o mesmo código.

2 - Quando o CNPJ informado pelo usuário for válido (essa validação deve ser feita automaticamente após terminar de digitar os 14 caracteres), um botão "Consultar" deve ser automaticamente exibido, para que o usuário possa clicar e seja retornado os dados referentes àquele CNPJ (consumindo o endpoint da api: "https://api.gtech.site/companies/:cnpj/is_blocked").

JSON que espera ser retornado:
    {
        "id":1613,
        "cnpj":"11586637000128",
        "name":"GERMAN TECH SISTEMAS E SERVICOS ADMINISTRATIVOS LTDA",
        "lock_date":"2099-03-26",
        "is_blocked":false,
        "test_date":"2020-01-31",
        "test_system":false,
        "active":true,
        "installation_date":"2019-03-16",
        "phone":"04504533789090",
        "version":"4.103.0",
        "system":"GOURMET",
        "observation":"Mensalidades"
    }
