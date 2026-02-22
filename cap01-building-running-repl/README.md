# Capítulo 1 — Building, Running, and the REPL

**Livro:** [Clojure for the Brave and True](https://www.braveclojure.com/getting-started/)

## Sobre o capítulo

Este capítulo cobre a configuração do ambiente de desenvolvimento Clojure:

- Instalação do **Leiningen** (ferramenta de build e gerenciamento de dependências)
- Criação de um projeto Clojure com `lein new app <nome>`
- Estrutura de um projeto Leiningen
- Compilação e execução de um projeto: `lein run`
- Geração de um JAR standalone: `lein uberjar`
- Uso do **REPL** (Read-Eval-Print Loop) com `lein repl`

## Conceitos-chave

| Conceito | Descrição |
|----------|-----------|
| `lein new app <nome>` | Cria um novo projeto Clojure |
| `lein run` | Executa o projeto |
| `lein uberjar` | Empacota o projeto em um JAR |
| `lein repl` | Inicia o REPL interativo |
| `(+ 1 2)` | Exemplo de expressão no REPL |
| `(println "Hello!")` | Imprime no REPL |

## Exercícios

Este capítulo não possui exercícios formais. O objetivo é configurar o ambiente
e se familiarizar com o fluxo básico de trabalho Clojure.

### Sugestões de prática

1. Instale o Leiningen e crie seu primeiro projeto com `lein new app hello-world`.
2. Explore a estrutura de diretórios gerada pelo Leiningen.
3. Abra o REPL com `lein repl` e experimente algumas expressões básicas.
4. Modifique a função `-main` para imprimir uma mensagem personalizada e execute com `lein run`.
5. Gere um uberjar e execute-o diretamente com `java -jar`.

## Links

- [Capítulo online](https://www.braveclojure.com/getting-started/)
- [Leiningen](https://leiningen.org/)
