package loja.model;

public class Alimentos extends Loja {

	private int limite;

	public Alimentos(int codigo, int quantidade, int tipo, String produto, float valor, int validade, int limite) {
		super(codigo, quantidade, tipo, produto, valor);
		this.limite = limite;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int quantidade) {
		this.limite = limite;
	}

	@Override
	public boolean removerEstoque(int itens) {

		if (this.getQuantidade() + this.getLimite() < itens) {
			System.out.println("\n Retire menos itens!");
			return false;
		}

		this.setQuantidade(this.getQuantidade() - itens);
		return true;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de Retirada: " + this.limite);
	}

}
