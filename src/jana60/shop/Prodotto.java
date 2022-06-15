package jana60.shop;

import java.text.DecimalFormat;

public class Prodotto {

	// attributi

	String marca;
	String nome;
	float prezzo;
	float iva;

	// costruttori

	Prodotto(String marca, String nome, float prezzo, float iva) {
		this.marca = marca;
		this.nome = nome;
		this.prezzo = prezzo;
		this.iva = iva;

	}

	// metodi
	DecimalFormat df = new DecimalFormat("#0.00€");

	String calcoloPrezzoConIva() {
		float prezzoIva = (prezzo * iva) / 100 + prezzo;

		return df.format(prezzoIva);
	}

}
