# Capítulo 2 — How to Use Emacs, an Excellent Clojure Editor

**Livro:** [Clojure for the Brave and True](https://www.braveclojure.com/basic-emacs/)

## Sobre o capítulo

Este capítulo apresenta o **Emacs** como editor para desenvolvimento Clojure, com foco em:

- Instalação e configuração básica do Emacs
- Configuração do **CIDER** (Clojure Interactive Development Environment that Rocks)
- Navegação básica no Emacs
- Integração do Emacs com o REPL via CIDER
- Avaliação de código diretamente no editor

## Conceitos-chave

| Atalho / Conceito | Descrição |
|-------------------|-----------|
| `C-x C-f` | Abrir arquivo |
| `C-x C-s` | Salvar arquivo |
| `C-x C-e` | Avaliar expressão antes do cursor |
| `M-x cider-jack-in` | Iniciar REPL integrado |
| `C-c C-k` | Compilar buffer atual |
| `C-c C-d C-d` | Ver documentação do símbolo |
| `M-x paredit-mode` | Ativar edição estruturada de parênteses |

## Exercícios

Este capítulo não possui exercícios formais. O foco é configurar e se familiarizar
com o ambiente de edição.

### Sugestões de prática

1. Configure o Emacs com o arquivo `~/.emacs.d/init.el` sugerido no livro.
2. Instale os pacotes necessários: `cider`, `paredit`, `company`.
3. Abra um projeto Clojure e inicie o CIDER com `M-x cider-jack-in`.
4. Experimente avaliar expressões diretamente do buffer com `C-x C-e`.
5. Pratique os atalhos de navegação básicos do Emacs.

> **Nota:** Você pode usar outros editores como VS Code (com Calva), IntelliJ (com Cursive)
> ou Neovim (com Conjure) se preferir ao Emacs.

## Links

- [Capítulo online](https://www.braveclojure.com/basic-emacs/)
- [CIDER](https://cider.mx/)
- [Calva para VS Code](https://calva.io/)
