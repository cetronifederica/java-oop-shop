package jana60.shop;

public class Main {

	public static void main(String[] args) {

		String marca = "Apple";
		String nome = "Iphone";
		float prezzo = 399.99F;
		float iva = 0F;

		Prodotto prod = new Prodotto(marca, nome, prezzo, iva);

		System.out.println("Marca prodotto: " + prod.marca);
		System.out.println("Nome prodotto: " + prod.nome);
		System.out.println("Prezzo prodotto (iva escl) : " + prod.prezzo + "€");
		System.out.println("Prezzo prodotto iva inclusa: " + prod.calcoloPrezzoConIva());

	}

}
