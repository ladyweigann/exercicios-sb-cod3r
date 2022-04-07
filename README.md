# Exercícios Spring Boot - Cod3r.com

##Este repositório contém exercícios simples utilizando o Spring Boot, com padrão MVC, e interligado ao banco de dados MySQL.

Para utilizar, você deverá ter instalada a ferramenta Postman, para realizar as requisições HTTP.

Além disso, precisa criar um schema no mySQL e alterar de acordo com suas preferências o arquivo src/main/resources/application.properties

Após iniciar o servidor, rode na porta 8080 a seguinte rota: ```http://localhost:8080/api/produtos/```

1. Requisição POST para cadastrar produtos: ```http://localhost:8080/api/produtos/```
- Deverá passar os parâmetros nome, preco, desconto no body da requisição;


2. Requisição GET para listar todos:  ```http://localhost:8080/api/produtos/```


3. Requisição GET para listar por nome: ```http://localhost:8080/api/produtos/nome/{nomeEscolhido}```
- Substituir último parâmetro da rota (nomeEscolhido) para o nome do produto que você deseja pesquisar;


4. Requisição GET para listar por páginas: ```http://localhost:8080/api/produtos/pagina/{numeroPagina}/{qtdPagina}```
- Substituir últimos parâmetros da rota {numeroPagina} e {qtdPagina} para o número da página que você deseja visualizar e a quantidade de itens (máximo 10) exibido por página, respectivamente;

5. Requisição GET para listar por id: ```http://localhost:8080/api/produtos/{id}```
- Substituir último parâmetro da rota (id) para o id do produto que você deseja pesquisar;

6. Requisição DELETE para deletar por id: ```http://localhost:8080/api/produtos/{id}```
- Substituir último parâmetro da rota (id) para o id do produto que você deseja deletar;

7. Requisição PUT para alterar um ou mais campos do objeto: ```http://localhost:8080/api/produtos```


Também contém outras classes para exercícios de apredizagem.
