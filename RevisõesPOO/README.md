# Desafio Prático: Smart Home Manager 🏠

**Objetivo:** Criar um mini-sistema em Java para gerir dispositivos inteligentes numa casa, aplicando os principais pilares e conceitos da Programação Orientada a Objetos (POO).

---

## 📚 Enquadramento Teórico

Antes de passar ao código, é fundamental compreender a utilidade de cada conceito arquitetural no ecossistema de software:

### 1. Interface (`Conectavel`) — O Contrato
* **O que é:** Uma interface é um "contrato" ou conjunto de regras sem implementação. Uma classe que implemente a interface (`implements`) obriga-se a fornecer uma implementação concreta para todos os métodos aí declarados.
* **Aplicação no Desafio:** A interface `Conectavel` garante que qualquer equipamento da casa saiba executar a ação `conectar()`. Uma lâmpada pode conectar-se à rede Zigbee, enquanto uma câmara se liga via Wi-Fi 5GHz, mas ambas respeitam a mesma assinatura de método.

### 2. Herança e Classes Abstratas (`Dispositivo`) — A Hierarquia "É Um"
* **O que é:** 
  * **Herança:** Permite que classes filhas herdem atributos e comportamentos de uma classe base (mãe), promovendo a reutilização de código e evitando duplicações. Estabelece uma relação do tipo **"é um"**.
  * **Classe Abstrata:** É uma estrutura de modelação incompleta que não pode ser instanciada diretamente (`new Dispositivo()` lança erro de compilação). Define o molde base e pode conter métodos abstratos (métodos sem corpo) que as filhas são obrigadas a concretizar.
* **Aplicação no Desafio:** A `Lampada` e a `CamaraVigilancia` partilham características como `nome` e estado de `ligado`. Em vez de duplicar este código, isolamo-lo na superclasse `Dispositivo`. Como o conceito genérico de "dispositivo" não existe fisicamente sem ser uma categoria específica, declaramos a classe como `abstract`.

### 3. Encapsulamento — O Controlo de Acesso
* **O que é:** Técnica de ocultar o estado interno de um objeto e restringir o acesso direto aos seus atributos através de modificadores (`private`, `protected`). O acesso é intermediado por métodos públicos (`getters` e `setters`), onde se aplicam regras de validação.
* **Aplicação no Desafio:** Os atributos `nome` e `ligado` são trancados como `private`. Impede-se, por exemplo, que o nome seja alterado para um valor nulo ou vazio sem passar por uma validação prévia.

### 4. Polimorfismo — Uma Interface, Múltiplas Formas
* **O que é:** Propriedade que permite a objetos de diferentes classes derivadas responder ao mesmo estímulo (chamada de método) de maneiras distintas. A decisão sobre qual método executar é tomada em tempo de execução (*dynamic binding*).
* **Aplicação no Desafio:** Ao iterar por uma lista genérica do tipo `Dispositivo[]`, invocamos `mostrarDetalhes()`. O Java identifica automaticamente se a instância em memória é uma lâmpada ou câmara, executando a lógica específica de cada uma sem necessidade de instruções condicionais (`if/else` ou `switch`).

---

## 📋 Requisitos do Programa

### 1. Interface `Conectavel`
- [ ] Declarar o método `void conectar();`.

### 2. Classe Abstrata `Dispositivo` (Superclasse)
- [ ] Implementar a interface `Conectavel`.
- [ ] Atributos encapsulados (`private`): `nome` (String) e `ligado` (boolean).
- [ ] Construtor que recebe o `nome` (o dispositivo inicia por defeito como `ligado = false`).
- [ ] Getters e Setters adequados (com validação no `setNome` para não aceitar Strings vazias).
- [ ] Métodos auxiliares `ligar()` e `desligar()` para alterar o estado do atributo `ligado`.
- [ ] Declarar o método abstrato `public abstract void mostrarDetalhes();`.

### 3. Subclasses Concretas
- [ ] **`Lampada`**:
  - Herda de `Dispositivo`.
  - Adiciona o atributo `intensidadeBrilho` (`int`, valor de 0 a 100).
  - Sobrescreve (`@Override`) o método `mostrarDetalhes()`.
  - Sobrescreve (`@Override`) o método `conectar()`.
- [ ] **`CamaraVigilancia`**:
  - Herda de `Dispositivo`.
  - Adiciona o atributo `resolucao` (`String`, ex: `"1080p"` ou `"4K"`).
  - Sobrescreve (`@Override`) o método `mostrarDetalhes()`.
  - Sobrescreve (`@Override`) o método `conectar()`.

### 4. Classe Principal (`Main`)
- [ ] Criar uma coleção/array de elementos do tipo `Dispositivo`.
- [ ] Adicionar pelo menos uma `Lampada` e uma `CamaraVigilancia`.
- [ ] Iterar a coleção utilizando um ciclo `for` / `for-each` e, para cada dispositivo:
  1. Chamar o método `ligar()`.
  2. Executar `conectar()`.
  3. Invocar `mostrarDetalhes()` para demonstrar o polimorfismo.
