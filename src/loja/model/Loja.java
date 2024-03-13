package loja.model;

public abstract class Loja {

	private int codigo, quantidade, tipo;
	private String produto;
	private float valor;

	public Loja(int codigo, int quantidade, int tipo, String produto, float valor) {
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.tipo = tipo;
		this.produto = produto;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public boolean removerEstoque(int itens) {

		if (this.getQuantidade() < itens) {
			System.out.println("\n Estoque insuficiente!");
			return false;
		}

		this.setQuantidade(this.getQuantidade() - itens);
		return true;
	}

	public void adicionarEstoque(int itens) {

		this.setQuantidade(this.getQuantidade() + itens);
	}

	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Alimentos";
			break;
		case 2:
			tipo = "Brinquedos";
			break;
		case 3:
			tipo = "Acessórios";
			break;
		}

		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("***********************************************************");
		System.out.println("Código do Produto: " + this.codigo);
		System.out.println("Produto: " + this.produto);
		System.out.println("Tipo do Produto: " + tipo);
		System.out.println("Quantidade: " + this.quantidade);
		System.out.println("Valor: " + this.valor);

	}
}
