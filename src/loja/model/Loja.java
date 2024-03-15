package loja.model;

public abstract class Loja {

	int codigo, tipo;
	String produto, marca;
	float valor;

	public Loja(int codigo, String produto, int tipo, String marca, float valor) {
		this.codigo = codigo;
		this.tipo = tipo;
		this.produto = produto;
		this.valor = valor;
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Alimentos";
			break;
		case 2:
			tipo = "Brinquedos";
			break;
		}

		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("***********************************************************");
		System.out.println("Código do Produto: " + this.codigo);
		System.out.println("Produto: " + this.produto);
		System.out.println("Marca do produto: " + this.marca);
		System.out.println("Tipo do Produto: " + tipo);
		System.out.println("Valor: " + this.valor);

	}
}
