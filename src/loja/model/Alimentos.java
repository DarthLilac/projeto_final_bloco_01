package loja.model;

public class Alimentos extends Loja {

    String categoriaAlimento;

	public Alimentos(int codigo, String produto, int tipo, String marca, float valor, String marcaAlimento) {
		super(codigo, produto, tipo, marca, valor);
		this.categoriaAlimento = marcaAlimento;
	}

	public String getMarcaAlimento() {
		return categoriaAlimento;
	}

	public void setMarcaAlimento(String marcaAlimento) {
		this.categoriaAlimento = marcaAlimento;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Categoria do produto: " + this.categoriaAlimento);
	}

}
