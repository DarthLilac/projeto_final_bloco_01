package loja.repository;

import loja.model.Loja;

public interface LojaRepository {
	
		public void procurarPorCodigo(int codigo);
		public void listarTodos();
		public void cadastrar(Loja produto);
		public void atualizar(Loja produto);
		public void deletar(int codigo);
		
		//public void removerEstoque(int codigo, int itens);
		//public void adicionarEstoque(int codigo, int itens);

}
