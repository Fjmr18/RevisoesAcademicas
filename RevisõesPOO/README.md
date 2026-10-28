### Desafio Prático: "Smart Home Manager"
	*Objetivo*: Criar um mini-sistema em Java para gerir dispositivos inteligentes numa casa, aplicando os pilares da Programação Orientada a Objetos.

## O que o programa deve conter:
# 1. Interface (Conectavel)
	- Cria uma interface com um método conectar().
	
# 2. Classe Abstrata / Superclasse (Dispositivo)
	- Deve implementar a interface Conectavel.
	- Atributos encapsulados (private): nome (String) e ligado (boolean).
	- Construtor para inicializar o nome (o dispositivo começa sempre desligado).
	- Getters e Setters necessários (com validação para garantir que o nome não está vazio).
	- Um método abstrato mostrarDetalhes().
	
# 3. Subclasses (Lampada e CamaraVigilancia)
	- Lampada herda de Dispositivo. Adiciona o atributo intensidadeBrilho (int, de 0 a 100). Sobrescreve o método mostrarDetalhes() e o método conectar()
	- CamaraVigilancia herda de Dispositivo. Adiciona o atributo resolucao (String, ex: "1080p"). Sobrescreve os mesmos métodos.
	
# 4. Classe de Teste (Main)
	- Cria uma lista/array de Dispositivo com pelo menos uma lâmpada e uma câmara.
	- Usa um ciclo (for) para percorrer a lista, ligar os dispositivos, chamar conectar() e invocar o mostrarDetalhes() (a demonstrar o polimorfismo em ação).
	
