package br.fag.aula08;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Localidade {
	public static void main(String[] args) {

		NumberFormat formatoNumerico;
		String formatoMonetario;
		BigDecimal value = new BigDecimal(12345);

		System.out.printf("Localidade padrão: %s\n", Locale.getDefault().getDisplayName());
		formatoNumerico = NumberFormat.getCurrencyInstance();
		formatoMonetario = formatoNumerico.format(value);
		System.out.printf("%s\n", formatoMonetario);
		formatoNumerico.setCurrency(Currency.getInstance("USD"));
		formatoMonetario = formatoNumerico.format(value);
		System.out.printf("%s\n\n", formatoMonetario);


		Locale.setDefault(Locale.JAPAN);
		System.out.printf("Localidade padrão: %s\n", Locale.getDefault().getDisplayName());
		formatoNumerico = NumberFormat.getCurrencyInstance();
		formatoMonetario = formatoNumerico.format(value);
		System.out.printf("%s\n", formatoMonetario);
		formatoNumerico.setCurrency(Currency.getInstance("JPY"));
		formatoMonetario = formatoNumerico.format(value);
		System.out.printf("%s\n\n", formatoMonetario);

		Locale.setDefault(Locale.US);
		System.out.printf("Localidade padrão: %s\n", Locale.getDefault().getDisplayName());
		formatoNumerico = NumberFormat.getCurrencyInstance();
		formatoMonetario = formatoNumerico.format(value);
		System.out.printf("%s\n", formatoMonetario);
		formatoNumerico.setCurrency(Currency.getInstance(Locale.US));
		formatoMonetario = formatoNumerico.format(value);
		System.out.printf("%s\n\n", formatoMonetario);

		Locale.setDefault(Locale.FRANCE);
		System.out.printf("Localidade padrão: %s\n", Locale.getDefault().getDisplayName());
		formatoNumerico = NumberFormat.getCurrencyInstance();
		formatoMonetario = formatoNumerico.format(value);
		System.out.printf("%s\n", formatoMonetario);
		formatoNumerico.setCurrency(Currency.getInstance("USD"));
		formatoMonetario = formatoNumerico.format(value);
		System.out.printf("%s\n\n", formatoMonetario);


	}
}