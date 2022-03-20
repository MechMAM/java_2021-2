package br.fag.listasorteio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ConferirSorteio {
	
	private static String sorteios[][] = new String[2408][8], opcao = "";
	private static int jogoUsuario[] = new int[6], jogoAleatorio[] = new int[6], indiceConferido=-1;
	private static Random randomizar = new Random();
	
	public static void main(String[] args) {		
			exibirOpcoes();
			obterOpcao();
			lerPlanilha();
			processarOpcao();				
	}
	
	private static void processarOpcao() {
		switch (opcao) {
		case "a":
			apostaUsuario();
			verificarSorteio(jogoUsuario);
			exibirResultado();
			break;
		case "b":
			apostaAleatoria();			
			verificarSorteio(jogoAleatorio);
			exibirResultado();
			break;
		case "c":
			int numeroApostas=0;
			while (indiceConferido==-1) {
				apostaAleatoria();			
				verificarSorteio(jogoAleatorio);
				numeroApostas++;
			}
			exibirResultado();
			Dados.exibirMensagem("O número total de apostas foi: "+numeroApostas);			
			break;		
		default:
			Dados.exibirMensagem("\n Opção inválida, execute novamente! ");
			break;
		}		
	}
	
	private static void exibirResultado() {
		Dados.exibirMensagem("A aposta foi: ");
		if (jogoAleatorio[0]!=-1) {
			Dados.exibirVetor(jogoAleatorio);			
		} else {
			Dados.exibirVetor(jogoUsuario);
		}
		if (indiceConferido!=-1) {
			Dados.exibirMensagem("Você acertou o concurso: "+sorteios[indiceConferido][0]+" \nna data de "+sorteios[indiceConferido][1]);			
		}else {
			Dados.exibirMensagem("Você não acertou nenhum concurso");
		}		
	}

	private static void obterOpcao() {
		opcao = Dados.obterDadosString(" Entre com uma opção ");
		jogoUsuario[0] = -1;
		jogoAleatorio[0]=-1;
	}

	private static void exibirOpcoes() {
		Dados.exibirMensagem(" Opções: \n a) Fazer uma aposta \n b) Aposta aleatória única \n c) Aposta aleatória até o sucesso \n");		
	}

	private static void verificarSorteio(int[] aposta) {
			for (int linha = 0; linha < sorteios.length; linha++) {
				int acertos = 0;
				for (int coluna = 2; coluna < sorteios[linha].length; coluna++) {
					for (int i = 0; i < aposta.length; i++) {
						String numeroAposta = Integer.toString(aposta[i]);
					if (sorteios[linha][coluna].equals(numeroAposta)) {
						acertos++;						
					}
				}
				if (acertos==6) {
					indiceConferido = linha;
				}
			}			
		}		
	}

	private static void apostaUsuario() {
		for (int i = 0; i < jogoUsuario.length; i++) {
			
			int valor = Dados.obterDadosInteiros("Digite um valor ");
			while(validarNumero(valor)) {
				valor = Dados.obterDadosInteiros("Valor inválido, tente novamente: ");
			}			
			jogoUsuario[i] = valor;
		}
	}
	
	private static void apostaAleatoria() {
		for (int i = 0; i < jogoAleatorio.length; i++) {
			int valor = randomizar.nextInt(60);
			while(validarNumero(valor)) {
				valor = randomizar.nextInt(60);
			}			
			jogoAleatorio[i] = valor;		
		}
	}
	
	private static boolean validarNumero(int valor) {
		boolean valorIgual = false;
		for (int j = 0; j < jogoUsuario.length; j++) {
			if ((valor==jogoAleatorio[j]) || (valorIgual) || (valor<1) || (valor>60) || (valor==jogoUsuario[j])) {
				valorIgual = true;
			}else {
				valorIgual = false;
			}				
		}
		return valorIgual;	
	}

	private static void lerPlanilha() {
		try {
			Workbook workbook = Workbook.getWorkbook(new File("./src/arquivos/mega_sena_asloterias_ate_concurso_2408_crescente.xls"));
			Sheet sheet = workbook.getSheet(0);

			File arquivo = new File("./src/arquivos/mega_sena_asloterias_ate_concurso_2408_crescente.xls");
			FileReader leitura = new FileReader(arquivo);;
			BufferedReader ler = new BufferedReader(leitura);

			for (int linha = 0; linha < sorteios.length; linha++) {
				for (int coluna = 0; coluna < sorteios[linha].length; coluna++) {
					Cell celula = sheet.getCell((coluna), (linha+7));
					String valor = celula.getContents();
					sorteios[linha][coluna] = valor;
				}
			}
			workbook.close();
			ler.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (BiffException e) {
			e.printStackTrace();
		}		
	}
}
