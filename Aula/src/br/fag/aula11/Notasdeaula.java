package br.fag.aula11;

import br.fag.restaurante.EstruturaCliente;

public class Notasdeaula {
	
	// Tipos de Dado Abstrato:
	// Listas, Filas e Pilhas
	
	/* Tradicionalmente conhecidos como tipos de dado abstrato, são algumas 
	 * Estruturas de dados básicas e importantes para a construção de algoritmos mais bem elaborados
	 * ALUNO
	 * PROFESSOR
	 * SECRETÁRIA
	 * COORDENADOR
	 * DIREÇÃO
	 * 
	 * LISTAS - INTRODUÇÃO
	 * 
	 * Conjuntos de elementos, objetos, variáveis, tarefas ou qualquer coisa que se possa enumerar e formar
	 * um conjunto
	 * As listas estão presentes em nossa vida, desde o nosso nascimento, por exemplo, com a lista de compras
	 * que nossos pais tiveram que fazer para nós
	 * Exemplo de listas
	 * Compras --> Produto{
	 * 	ID
	 * 	QTD
	 * 	UM
	 * 	DESCRI
	 * }
	 * Telefônica --> Contatos{
	 * 	Nome
	 * 	Sobrenome
	 * 	Código de área
	 * 	Número tel
	 * }
	 * 
	 * Comportamento de uma lista
	 * Pode sacar o elemento de uma lista
	 * 
	 * Lista: Vazia! --> só pode adicionar um elemento
	 * Se for ordenada ele inclui os novos elementos na ordem correta, (exemplo do C,D,B), incluindo
	 * elementos no meio da lista
	 * 
	 * Listas - implementação
	 * Podem ser implementadas de várias formas, mas num aspecto mais geral podemos separa em duas
	 * 
	 * Arrays ou 
	 * Encadeadas
	 * 
	 * Imagine que a lista anterior tinha posições fixas e pré-determinadas
	 * 	Um array é uma estrutura com posições fixas, cada elemento da lista deve ser colocado em uma 
	 * 	posição no array;
	 * 
	 * 	Ao inserir ou excluir um elemento, talvez seja necessário realocar todos os demais elementos.
	 * 
	 * Prós
	 * 		Criar um array de qualquer tamanho é muito simples;
	 * 		Não há necessidade de compreender ponteiros ou referências;
	 * 
	 * Contras:
	 * 		Limitações quanto ao tamanho de memória;
	 * 		Custo computacional maior;
	 * 		Alocação de memória exagerada
	 * 
	 * Listas encadeadas
	 * 
	 * Encadeado, dicionário houaiss
	 * 		Disposto ou ligado como cadeias, ordenado, junto
	 * 		preso, submetido
	 * 
	 * Prós
	 * 		Extremamente eficiente no custo de memória e de processamento
	 * 		Nunca acarreta em movimentar todos os elementos
	 * Contras
	 * 		Envolve conceitos mais avançados de programação
	 * 			-Ponteiros ou Referências
	 * 
	 * Para criar uma lista encadeada deve ser definido o que será armazenado nela
	 * 
	 * Contato: Nome, telefone e email
	 * 
	 * Ideia do encadeamento é utilizar o objeto inteiro como referência
	 * 
	 * Cria elementos na memória do computador, estes elementos vão ficando espalhados e desconexos
	 * 
	 * Para criar listas encadeadas:
	 * 
	 *Encadeamento simples --> Contato: Nome; telefone; email; Contato: Próximo;
	 *
	 *Duplamente encadeado--> Contato: Nome; telefone; email; Contato: Próximo; Contato: Anterior;
	 *
	 *Iniciar uma lista vazia
	 * - Contato Inicio_lista = null;
	 * - Contato Fim_lista = null;
	 * 	O valor de referência nullé usado para quando ainda não existe um objeto 
	 * 
	 * visibilidade private nos atributos das classes que compões a lista
	 * 
	 * Contato Inicio_lista = new Contato();
	 * 
	 * Contato aux = Inicio_Lista;
	 * while(aux != null){
	 * 	comandos
	 * 	aux = aux.Proximo
	 * }
	 * Inicio_Lista.Proximo = Null;
	 * 
	 * Listas em java
	 * Collection - ArrayList
	 * 
	 * Java disponibiliza diversas classes que implementam diversas funcionalidades de diferentes
	 * estruturas de dados
	 * 	Conjunto chamado de Collections
	 * 
	 * Para a estrutura de dados Lista, iremos utilizar a classe disponível em 
	 * 
	 * java.util.ArrayList
	 * 
	 * ArrayList<ClasseArmazenada>lista = new ArrayList();
	 * 
	 * Onde iremos criar  uma lista dinâmica que armazena objetos da "ClasseArmazenada"
	 * Exemplo para lista de int	 * 
	 * ArrayList<integer>lista = new ArrayList();
	 * 
	 * métodos mais utilizados do array
	 * Adicionar um elemento:
	 * lista.add(99); //99 é o valor armazenado
	 * 
	 * Recuperar um elemento:
	 * int valor = lista.get(0); //0 é o índice
	 * 
	 * Verificar a quantidade de elementos:
	 * int qdade = lista.size(); // Neste caso será 1
	 * 
	 * Esvaziar a lista
	 * lista.clear();
	 * 
	 * Pesquisar por um elemento
	 * int pos = lista.indexOf(99); //retorna a posição do elemento. Se não for encontrado, retorna -1
	 * 
	 * Ordenar a Lista:
	 * Collections.sort(lista);
	 * 
	 * Remover um elemento;
	 * lista.remove(0); // 0 é o índice
	 * 
	 * Boa prática, encontrar o índice do elemento com indexOf depois excluir o elemento
	 * 
	 * Filas
	 * Conjunto de itens a partir do qual podem-se eliminar itens em apenas uma extremidade (chamada de início
	 * da fila) e no qual podem-se inserir itens na outra extremidade (chamada final da fila)
	 * 
	 * Fila existe a regra básica:
	 * Primeiro a chegar é o primeiro a sair FIFO
	 * 
	 * O novo elemento da fila é inserido na última posição
	 * 
	 * Elementos só podem ser removidos da primeira posição
	 * fila de impressão
	 * fila de processos
	 * fila de tarefas
	 * fila de prioridades
	 * 	Cada item tem uma prioridade. Elementos mais prioritários podem ser atendidos antes, 
	 * 	mesmo não estando no início da fila
	 * fila circular
	 * 	Neste tipo de fila os elementos nem sempre são removidos ao serem atendidos, 
	 * 	mas voltam ao fim da fila para serem atendidos novamente mais tarde.
	 * 
	 * Vetores
	 * Lista encadeada
	 * 
	 * Collections - Fila
	 * 
	 * Construir:
	 * 	Queue<Integer> fila = new LinkedList();
	 * 
	 * Adicionar:
	 * 	fila.add(20);
	 * 
	 * Remover
	 * 	int.x = fila.remove();
	 * 
	 * Examinar:
	 * 	int.y = fila.elemente();
	 * 
	 * Esvaziar:
	 * 	fila.clear();
	 * 
	 * Tamanho:
	 * 	fila.size();
	 * 
	 * Pilha:
	 * 
	 * Um dos conceitos mais úteis na ciência da computação é o de pilha;
	 * 
	 * Como eram as listas?
	 * 	- Insere, remove ou utiliza qualquer elemento inserido;
	 * 	Como eram as filas?
	 * 	- Insere apenas no fim da fila, utiliza e remove apenas o primeiro inserido
	 * 
	 * Pilha
	 * 	Insere-se elementos no topo da pilha
	 * 	Remove-se ou utiliza-se apenas o elemento que estiver no topo da pilha
	 * 
	 * LIFO ou (FILO)
	 * Last In First Out
	 * 
	 * Pilha Vazia: Topo = null
	 * 
	 * Inserindo elemento Z; Topo = Z
	 * 
	 * Inserindo Y; Topo = Y
	 * 
	 * Insere X; Topo =X
	 * 
	 * Aux = desempilha(p);
	 * remove e volta para a pilha
	 * 
	 * Podem ser implmentadas em listas encadeadas ou em vetores;
	 * 
	 * Vetores: ter uma variável indicando o topo da pilha
	 * 
	 * Pilha:
	 * 	Stack<Integer>pilha = new Stack();
	 * 
	 * Adicionar:
	 * pilha.push(20);
	 * 
	 * Remover
	 * int x = pilha.pop();
	 * 
	 * Examinar
	 * int y = pilha.peek();
	 * 
	 * Esvaziar
	 * pilha.clear();
	 * 
	 * Tamanho 
	 * pilha.size();
	 * 
	 * 
	 * 
	 * */
	
//	Contato Inicio_Lista = new Contato();
//	Contato Fim_Lista = Inicio_Lista;
	
//	EstruturaCliente cliente1 = new EstruturaCliente();
//	cliente1.setId(0);
//	cliente1.setNome("Leia Organa");	
//	cliente1.setIdBebida();
//	cliente1.setIdCardapio();	
//	cliente1.setIdChocolate();
//	
//	EstruturaCliente cliente2 = new EstruturaCliente();
//	cliente2.setId(1);
//	cliente2.setNome("Luke Skywalker");	
//	cliente2.setIdBebida();
//	cliente2.setIdCardapio();	
//	cliente2.setIdChocolate();
//	
//	EstruturaCliente cliente3 = new EstruturaCliente();
//	cliente3.setId(2);
//	cliente3.setNome("Boba Fett");	
//	cliente3.setIdBebida();
//	cliente3.setIdCardapio();	
//	cliente3.setIdChocolate();
//	
//	EstruturaCliente cliente4 = new EstruturaCliente();
//	cliente4.setId(3);
//	cliente4.setNome("Anakin Skywalker");	
//	cliente4.setIdBebida();
//	cliente4.setIdCardapio();	
//	cliente4.setIdChocolate();
//	
//	EstruturaCliente cliente5 = new EstruturaCliente();
//	cliente5.setId(4);
//	cliente5.setNome("Padmé Amidala");	
//	cliente5.setIdBebida();
//	cliente5.setIdCardapio();	
//	cliente5.setIdChocolate();
//	
//	EstruturaCliente cliente6 = new EstruturaCliente();
//	cliente6.setId(5);
//	cliente6.setNome("Obi-Wan Kenobi");	
//	cliente6.setIdBebida();
//	cliente6.setIdCardapio();	
//	cliente6.setIdChocolate();
//	
//	EstruturaCliente cliente7 = new EstruturaCliente();
//	cliente7.setId(6);
//	cliente7.setNome("Han Solo");	
//	cliente7.setIdBebida();
//	cliente7.setIdCardapio();	
//	cliente7.setIdChocolate();
//	
//	EstruturaCliente cliente8 = new EstruturaCliente();
//	cliente8.setId(7);
//	cliente8.setNome("Kylo Ren");	
//	cliente8.setIdBebida();
//	cliente8.setIdCardapio();	
//	cliente8.setIdChocolate();
//	
//	EstruturaCliente cliente9 = new EstruturaCliente();
//	cliente9.setId(8);
//	cliente9.setNome("Rey Palpatine");	
//	cliente9.setIdBebida();
//	cliente9.setIdCardapio();	
//	cliente9.setIdChocolate();
//	
//	EstruturaCliente cliente10 = new EstruturaCliente();
//	cliente10.setId(9);
//	cliente10.setNome("Chewbacca");	
//	cliente10.setIdBebida();
//	cliente10.setIdCardapio();	
//	cliente10.setIdChocolate();
//	
//	EstruturaCliente cliente11 = new EstruturaCliente();
//	cliente11.setId(10);
//	cliente11.setNome("Lando Calrissian");	
//	cliente11.setIdBebida();
//	cliente11.setIdCardapio();	
//	cliente11.setIdChocolate();
//	
//	EstruturaCliente cliente12 = new EstruturaCliente();
//	cliente12.setId(11);
//	cliente12.setNome("Poe Dameron");	
//	cliente12.setIdBebida();
//	cliente12.setIdCardapio();	
//	cliente12.setIdChocolate();
//	
//	EstruturaCliente cliente13 = new EstruturaCliente();
//	cliente13.setId(12);
//	cliente13.setNome("Finn");	
//	cliente13.setIdBebida();
//	cliente13.setIdCardapio();	
//	cliente13.setIdChocolate();
//	
//	EstruturaCliente cliente14 = new EstruturaCliente();
//	cliente14.setId(13);
//	cliente14.setNome("Yoda");	
//	cliente14.setIdBebida();
//	cliente14.setIdCardapio();	
//	cliente14.setIdChocolate();
//	
//	EstruturaCliente cliente15 = new EstruturaCliente();
//	cliente15.setId(14);
//	cliente15.setNome("Qui-Gon-Jin");	
//	cliente15.setIdBebida();
//	cliente15.setIdCardapio();	
//	cliente15.setIdChocolate();
//	
//	EstruturaCliente cliente16 = new EstruturaCliente();
//	cliente16.setId(15);
//	cliente16.setNome("Mace Windu");	
//	cliente16.setIdBebida();
//	cliente16.setIdCardapio();	
//	cliente16.setIdChocolate();
//	
//	EstruturaCliente cliente17 = new EstruturaCliente();
//	cliente17.setId(16);
//	cliente17.setNome("Ahsoka Tano");	
//	cliente17.setIdBebida();
//	cliente17.setIdCardapio();	
//	cliente17.setIdChocolate();
//	
//	EstruturaCliente cliente18 = new EstruturaCliente();
//	cliente18.setId(17);
//	cliente18.setNome("Kit Fisto");	
//	cliente18.setIdBebida();
//	cliente18.setIdCardapio();	
//	cliente18.setIdChocolate();
//	
//	EstruturaCliente cliente19 = new EstruturaCliente();
//	cliente19.setId(18);
//	cliente19.setNome("Conde Dookan");	
//	cliente19.setIdBebida();
//	cliente19.setIdCardapio();	
//	cliente19.setIdChocolate();
//	
//	EstruturaCliente cliente20 = new EstruturaCliente();
//	cliente20.setId(19);
//	cliente20.setNome("Palpatine");	
//	cliente20.setIdBebida();
//	cliente20.setIdCardapio();	
//	cliente20.setIdChocolate();
	
	
	

}
