package loja.model;

public class Brinquedos extends Loja{
	
	String tipoBrinquedo;

	public Brinquedos(int codigo, String produto, int tipo, String marca, float valor, String tipoBrinquedo) {
		super(codigo, produto, tipo, marca, valor);
		this.tipoBrinquedo = tipoBrinquedo;
	}

	public String getTipoBrinquedo() {
		return tipoBrinquedo;
	}

	public void setTipoBrinquedo(String tipoBrinquedo) {
		this.tipoBrinquedo = tipoBrinquedo;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Marca do produto: " + this.tipoBrinquedo);
	}

}
