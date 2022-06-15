package jana60.shop;

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

	float calcoloPrezzoConIva() {
		float prezzoIva = (prezzo * 22) / 100 + prezzo;
		return prezzoIva;
	}

}
