package loja.controller;

import loja.model.Loja;
import loja.repository.LojaRepository;
import java.util.ArrayList;

public class LojaController implements LojaRepository{

	
	int codigo = 0;
	
	public ArrayList<Loja> listaLoja= new ArrayList<Loja>();

	@Override
	public void procurarPorCodigo(int codigo) {
		var produto = buscarNaLoja(codigo);
		if (produto != null) {
			produto.visualizar();
		}else {
			System.out.println("\n Código não foi encontrado.");
		}
	}
	
	@Override
	public void cadastrar(Loja produto) {
        listaLoja.add(produto);
        System.out.println("\n O produto " + produto.getProduto() + " foi cadastrado com sucesso!");
    }
	
	@Override
    public void listarTodos() {
        for(var produto: listaLoja) {
            produto.visualizar();
        }
    }
	
	@Override
    public void atualizar(Loja produto) {
        var buscaProduto = buscarNaLoja(produto.getCodigo());

        if(buscaProduto != null) {
            listaLoja.set(listaLoja.indexOf(buscaProduto), produto);
            System.out.println("\nO produto com código: " + produto.getCodigo() + " foi atualizado!");
        } else {
            System.out.println("\nO produto com código: " + produto.getCodigo() + " não foi encontrado! Tente novamente");
        }

    }
	
	@Override
    public void deletar(int numero) {
        var produto = buscarNaLoja(numero);
        if(produto != null) {
            if(listaLoja.remove(produto) == true) {
                System.out.println("\nO produto com código: " + numero + " foi excluído com sucesso!");
            } else {
                System.out.println("\nO produto com código: " + numero + " não foi encontrado! Tente novamente");
            }
        }

    }
	
	public Loja buscarNaLoja(int numero) {
        for (var produto : listaLoja) {
            if(produto.getCodigo() == numero) return produto;
        }

        return null;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
