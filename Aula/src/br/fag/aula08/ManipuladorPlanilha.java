package br.fag.aula08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;

import br.fag.listasorteio.Dados;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.read.biff.BiffException;
import jxl.write.DateFormats;
import jxl.write.DateTime;
import jxl.write.Formula;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.NumberFormat;
import jxl.write.NumberFormats;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableImage;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class ManipuladorPlanilha {

//	http://jexcelapi.sourceforge.net/

	public static void main(String[] args) {
		try {
			String nomeArquivo = "./src/arquivos/entrada.xls";
			WorkbookSettings pastaTrabalho = new WorkbookSettings();
			pastaTrabalho.setLocale(new Locale("pt-br", "PT-BR"));
			WritableWorkbook workbook = Workbook.createWorkbook(new File(nomeArquivo), pastaTrabalho);
			WritableSheet imagem = workbook.createSheet("Folha2", 0);
			WritableSheet dados = workbook.createSheet("Folha1", 0);

			criarPlanilhaComImagem(imagem);
			criarPlanilhaComDados(dados);
			lerPlanilha();
			lerCSV();
			workbook.write();
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (WriteException e) {
			e.printStackTrace();
		}
	}

	private static void lerCSV() {
        String arquivoCSV = "./src/arquivos/planilha.csv";
        BufferedReader bufferedReader = null;
        String linha = "";
        String caractereQuebra = ";";
        String[] dados;
        try {

            bufferedReader = new BufferedReader(new FileReader(arquivoCSV));
            while ((linha = bufferedReader.readLine()) != null) {
                dados = linha.split(caractereQuebra);

                System.out.println("01: " + dados[0] + " - 02: "+dados[1]+" - 03: "+dados[2]+" - 04: "+dados[3]+" - 05: "+dados[4] +" - 06: "+dados[5]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
	}

	private static void criarPlanilhaComDados(WritableSheet planilha) throws WriteException {

		WritableFont fonte = new WritableFont(WritableFont.ARIAL, 10, WritableFont.BOLD);
		WritableCellFormat formato1 = new WritableCellFormat(fonte);
		formato1.setWrap(true);

		Label rotulo = new Label(0, 0, "Data", formato1);
		planilha.addCell(rotulo);
		WritableCellFormat formatoCelulas = new WritableCellFormat(DateFormats.FORMAT9);

		DateTime data = new DateTime(0, 1, new Date(), formatoCelulas, DateTime.GMT);

		planilha.addCell(data);

		rotulo = new Label(2, 0, "Float", formato1);
		planilha.addCell(rotulo);
		WritableCellFormat formato2 = new WritableCellFormat(NumberFormats.FLOAT);
		Number numero = new Number(2, 1, 3.1415926535, formato2);
		planilha.addCell(numero);

		numero = new Number(2, 2, -3.1415926535, formato2);
		planilha.addCell(numero);

		rotulo = new Label(3, 0, "3 decimais", formato1);
		planilha.addCell(rotulo);
		NumberFormat formato3 = new NumberFormat("#.###");
		WritableCellFormat tresDecimais = new WritableCellFormat(formato3);
		numero = new Number(3, 1, 3.1415926535, tresDecimais);
		planilha.addCell(numero);

		rotulo = new Label(4, 0, "Acrescenta 2 c�lulas", formato1);
		planilha.addCell(rotulo);
		numero = new Number(4, 1, 10);
		planilha.addCell(numero);
		numero = new Number(4, 2, 16);
		planilha.addCell(numero);
		Formula formula = new Formula(4, 3, "E2+E3");
		planilha.addCell(formula);

		rotulo = new Label(5, 0, "Multiplica por 2", formato1);
		planilha.addCell(rotulo);
		numero = new Number(5, 1, 10);
		planilha.addCell(numero);
		formula = new Formula(5, 2, "F2 * 2");
		planilha.addCell(formula);

		rotulo = new Label(6, 0, "Divide por 2.5", formato1);
		planilha.addCell(rotulo);
		numero = new Number(6, 1, 12);
		planilha.addCell(numero);
		formula = new Formula(6, 2, "G2/2.5");
		planilha.addCell(formula);
	}

	private static void criarPlanilhaComImagem(WritableSheet planilha) throws WriteException {
		Label rotulo = new Label(0, 0, "Imagem");
		planilha.addCell(rotulo);
		WritableImage imagem = new WritableImage(0, 3, 20, 14, new File("./src/arquivos/imagem.png"));
		planilha.addImage(imagem);
	}

	private static void lerPlanilha() {
		String dados[][] = new String[10][6];
		try {
			Workbook workbook = Workbook.getWorkbook(new File("./src/arquivos/planilha.xls"));
			Sheet sheet = workbook.getSheet(0);

			File arquivo = new File("./src/arquivos/planilha.xls");
			FileReader leitura;
			leitura = new FileReader(arquivo);
			BufferedReader ler = new BufferedReader(leitura);

			for (int linha = 0; linha < 10; linha++) {
				for (int coluna = 0; coluna < 6; coluna++) {
					Cell celula = sheet.getCell(coluna, linha);
					String valor = celula.getContents();
					dados[linha][coluna] = valor;
				}
			}

			mostrarMatriz(dados);

			workbook.close();
			ler.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (BiffException e) {
			e.printStackTrace();

		}
	}

	private static void mostrarMatriz(String[][] dados) {
		for (int linha = 0; linha < dados.length; linha++) {
			for (int coluna = 0; coluna < dados[linha].length; coluna++) {
				System.out.print(dados[linha][coluna] + " ");
			}
			System.out.println();
		}
	}

}