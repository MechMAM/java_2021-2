package br.fag.listasorteio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ContarSorteios {
	
	private static String dados[][] = new String[2408][6];
	private static int ocorrencias[] = new int[60];
	
	public static void main(String[] args) {
		
		lerPlanilha();
		contarOcorrencias();
		exibirResultado();
	}
	
private static void exibirResultado() {
	System.out.println("A quantidade de vezes que os números foram sorteados são:");
	for (int i = 0; i < ocorrencias.length; i++) {
		if ((i+1)%6==0) {
			System.out.print((i+1)+" : "+ocorrencias[i]+"; ");
			System.out.println(" ");
		}else {
			System.out.print((i+1)+" : "+ocorrencias[i]+"; ");			
		}		
	}		
	}

private static void contarOcorrencias() {
	
	for (int i = 0; i < ocorrencias.length; i++) {
		int contador=0;
		String inteiro=Integer.toString(i+1);
		for (int linha = 0; linha < dados.length; linha++) {
			for (int coluna = 0; coluna < dados[linha].length; coluna++) {
				if (dados[linha][coluna].equals(inteiro)) {
					contador++;
				}
			}
		}
		ocorrencias[i]=contador;
	}
	}

	private static void lerPlanilha() {
		try {
			Workbook workbook = Workbook.getWorkbook(new File("./src/arquivos/mega_sena_asloterias_ate_concurso_2408_crescente.xls"));
			Sheet sheet = workbook.getSheet(0);

			File arquivo = new File("./src/arquivos/mega_sena_asloterias_ate_concurso_2408_crescente.xls");
			FileReader leitura = new FileReader(arquivo);;
			BufferedReader ler = new BufferedReader(leitura);

			for (int linha = 0; linha < dados.length; linha++) {
				for (int coluna = 0; coluna < dados[linha].length; coluna++) {
					Cell celula = sheet.getCell((coluna+2), (linha+7));
					String valor = celula.getContents();
					dados[linha][coluna] = valor;
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
