package loja.model;

public class Alimentos extends Loja {

	private int validade;

	public Alimentos(int codigo, int quantidade, int tipo, String produto, float valor, int validade) {
		super(codigo, quantidade, tipo, produto, valor);
		this.validade = validade;
	}

	public int getValidade() {
		return validade;
	}

	public void setValidade(int validade) {
		this.validade = validade;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Validade do produto: " + this.validade);
	}

}
