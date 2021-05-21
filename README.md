# RESTE API Star Wars

## API desenvolvida para servir ao jogo da franquia Star Wars

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
[Git](https://git-scm.com), [Java JDK 8](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html) ou [Java JRE 8](https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR).

### 🎲 Como executar o Back End

```bash
# Clone este repositório
git clone https://github.com/cipolli/starwars

# Acesse esse dertório pelo terminal \starwars\target e execute:
starwars-0.0.1-SNAPSHOT.jar

# A API inciará na porta:8080
http://localhost:8080
```

Use o client insomnia para testar os endpoints.
Importe o json no insomnia e teste os endpoints: [Insomnia endpoints API Star Wars](https://github.com/cipolli/starwars/blob/9fcce86122d6c137a67460806bb1e4eba04bace8/src/main/resources/Insomnia_all_endpoints.json)

[Como importar configurações de endpoints para o insomnia](https://support.insomnia.rest/article/172-importing-and-exporting-data)

### Endpoints

* Retorna todos os planets: GET - http://localhost:8080/planets/
* Retorna o planet pelo id: GET - http://localhost:8080/planet/{id}
* Retorna o planet pelo nome: GET - http://localhost:8080/planet/name
* Adiciona um planet ao batabse: POST - http://localhost:8080/planet/
* Atualiza um planet: PUT - http://localhost:8080/planet/{id}
* Remove um planet: DELETE - http://localhost:8080/planet/{id}


