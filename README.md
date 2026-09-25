# Cardápio Mobile - Cadastro e Login

## Sobre o projeto

Módulo de cadastro com autenticação de usuários e login desenvolvido para um aplicativo de cardápio. O projeto contempla o fluxo completo de criação de contas e validação de login dos clientes, integrado a uma API RESTful para persistência segura dos dados em banco relacional.

A aplicação mobile é desenvolvida de forma nativa utilizando Java para Android, com as interfaces de usuário (layouts, formulários e componentes visuais) construídas em **XML** e consumindo as rotas da API através da biblioteca Retrofit. O backend consiste em uma API RESTful construída com Spring Boot (Java) e Spring Data JPA, utilizando o banco de dados PostgreSQL para o armazenamento das informações dos usuários.

## Tecnologias utilizadas

- Android Native (Java)
- Interface UI em XML
- Retrofit 2
- Java 23
- Spring Boot
- Spring Data JPA / Hibernate
- PostgreSQL
- Maven

## Demonstração

### Cadastro
<img width="200" alt="Screenshot_20260924_232318" src="https://github.com/user-attachments/assets/98fd06d3-944f-4de5-8fbe-7a9b3af4ca76" />

<br>

### Login

<img width="200" alt="Screenshot_20260924_232033" src="https://github.com/user-attachments/assets/fd94df40-7bbe-45d4-a65c-868652cc7a7b" />

<br>

## Estrutura do projeto

```text
projeto-cardapio-completo/
│
├── Cardapio/                         # Aplicativo Android
│   ├── app/
│   │   ├── src/
│   │   │   └── main/
│   │   │       ├── java/com/example/cardapio/
│   │   │       │   ├── model/
│   │   │       │   │   └── Usuario.java
│   │   │       │   ├── ApiService.java
│   │   │       │   ├── RetrofitClient.java
│   │   │       │   ├── FormCadastro.java
│   │   │       │   ├── FormLogin.java
│   │   │       │   └── MainActivity.java
│   │   │       ├── res/
│   │   │       │   └── layout/       # Layouts de interface em XML
│   │   │       │       ├── activity_form_cadastro.xml
│   │   │       │       ├── activity_form_login.xml
│   │   │       │       └── activity_main.xml
│   │   │       └── AndroidManifest.xml
│   │   └── build.gradle
│   └── build.gradle
│
└── apiCardapioMobile/                # API Backend Spring Boot
    ├── src/
    │   └── main/
    │       ├── java/com/cardapio_mobile/apiCardapioMobile/
    │       │   ├── controller/
    │       │   │   └── UserController.java
    │       │   ├── dto/
    │       │   │   └── UserCreateDTO.java
    │       │   ├── model/
    │       │   │   └── User.java
    │       │   ├── repository/
    │       │   │   └── UserRepository.java
    │       │   ├── service/
    │       │   │   └── UserService.java
    │       │   └── ApiCardapioMobileApplication.java
    │       └── resources/
    │           └── application.properties
    └── pom.xml
