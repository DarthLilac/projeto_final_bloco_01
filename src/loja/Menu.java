package loja;

import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;

import loja.controller.LojaController;
import loja.util.Cores;
import loja.model.Alimentos;
import loja.model.Brinquedos;

public class Menu {

    public static void main(String[] args) {
    	
        LojaController produtos = new LojaController();

        int opcao = 0;
        int codigoProduto, tipo;
        String produto, marca, marcaAlimento, tipoBrinquedo;
        float valor;   
        int codigoInicio = 0;
        Scanner leia = new Scanner(System.in);
        
        while (opcao != 6) {

            System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
            System.out.println("                                                     ");
            System.out.println("                    Fluffy Pets                      ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Cadastrar Produto                    ");
            System.out.println("            2 - Listar Todos os Produtos             ");
            System.out.println("            3 - Consultar Produto por Código         ");
            System.out.println("            4 - Atualizar Dados de um Produto        ");
            System.out.println("            5 - Apagar Produto                       ");
            System.out.println("            6 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada:                          ");
            System.out.println("                                                     " + Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}
			
			if (opcao == 6) {
				System.out.println(Cores.TEXT_CYAN_BOLD + "\nFluffy Pets - A loja onde a fofura encontra seu lar");
				leia.close();
				System.exit(0);
			}
            
            switch (opcao) {
                case 1:
                    System.out.println(Cores.TEXT_CYAN_BOLD +"Cadastrar Produto\n\n");
                    System.out.print("Digite o nome do produto:");
					produto = leia.next();
					do {
						System.out.println("Digite o tipo do produto: \n[1] - Alimentos Pet \n[2] - Brinquedos");
						tipo = leia.nextInt();
					} while(tipo <1 && tipo > 2);
					
					System.out.print("Digite a marca do produto: ");
					marca = leia.next();
					System.out.print("Digite o preço do produto: ");
					valor = leia.nextFloat();	
                    
					switch(tipo) {
					case 1 -> {
						System.out.print("Digite a marca do alimento:) ==> ");
						marcaAlimento = leia.next();
						codigoInicio += 1;
						codigoProduto = codigoInicio;
						produtos.cadastrar(new Alimentos(codigoProduto, produto, tipo, marca, valor, marcaAlimento));
					}
					case 2 -> {
						System.out.print("Digite o tipo de brinquedo: (Pelúcia ou Plástico) ==> ");
						tipoBrinquedo = leia.next();
						codigoInicio += 1;
						codigoProduto = codigoInicio;
						produtos.cadastrar(new Brinquedos(codigoProduto, produto, tipo, marca, valor, tipoBrinquedo));
					}	
				}  
                    keyPress();
                    break;
                    
                case 2:
                    System.out.println("Listar Todos os Produtos\n\n");
                    produtos.listarTodos();
                    keyPress();
                    break;
                    
                case 3:
                    System.out.println("Consultar Produto por código\n\n");
                    System.out.print("Digite o código do produto procurado: ");
                    codigoProduto = leia.nextInt();
                    produtos.procurarPorCodigo(codigoProduto);
                    keyPress();
                    break;
                    
                case 4:
                    System.out.println("Atualizar Dados de um Produto\n\n");
                    System.out.print("Digite o Codigo do Produto para atualizar: ");
					codigoProduto = leia.nextInt();
					var buscaProduto = produtos.buscarNaLoja(codigoProduto);
					if (buscaProduto != null) {
						tipo = buscaProduto.getTipo();
						System.out.print("Digite o nome do produto:");
						produto = leia.next();
						System.out.print("\nDigite a marca do produto: ");
						marca = leia.next();
						System.out.print("\nDigite o valor do produto:");
						valor = leia.nextFloat();
						
						switch(tipo) {
							case 1 -> {
								System.out.print("Digite a marca de celular compatível com o produto(se for compatível com todos os celulares, digite 'todas') ==> ");
								marcaAlimento = leia.next();
								produtos.cadastrar(new Alimentos(codigoProduto, produto, tipo, marca, valor, marcaAlimento));
							}
							case 2 -> {
								System.out.print("Digite o tipo de computador(notebook ou desktop) compatível com o produto (se for compatível com todos, digite 'todos') ==> ");
								tipoBrinquedo = leia.next();
								produtos.cadastrar(new Brinquedos(codigoProduto, produto, tipo, marca, valor, tipoBrinquedo));
							}
							default -> {
								System.out.println("Tipo de produto inválido!");
							}
					    }
					
					} else {
						System.out.println("O produto não foi encontrado!");
					}
                     
                    keyPress();
                    break;
                    
                case 5:
                    System.out.println("Apagar Produto\n\n");
                    System.out.print("Digite o código do produto: ");
                    codigoProduto = leia.nextInt();
                    produtos.deletar(codigoProduto);
                    keyPress();
                    break;
                    
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        }
    }

    public static void sobre() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por: Andressa Rocha ");
        System.out.println("Generation Brasil - Turma 73");
        System.out.println("github.com/DarthLilac");
        System.out.println("*********************************************************");
    }

    public static void keyPress() {

        try {

            System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
            System.in.read();

        } catch (IOException e) {

            System.out.println("Você pressionou uma tecla diferente de enter!");

        }

    }
}