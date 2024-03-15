package loja.model;

public class Alimentos extends Loja {

    String marcaAlimento;

	public Alimentos(int codigo, String produto, int tipo, String marca, float valor, String marcaAlimento) {
		super(codigo, produto, tipo, marca, valor);
		this.marcaAlimento = marcaAlimento;
	}

	public String getMarcaAlimento() {
		return marcaAlimento;
	}

	public void setMarcaAlimento(String marcaAlimento) {
		this.marcaAlimento = marcaAlimento;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Marca do produto: " + this.marcaAlimento);
	}

}
