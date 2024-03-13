package loja;

import java.util.Scanner;

import loja.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while (true) {

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
			System.out.println("                                                     "+ Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println("\nFluffy Pets - A loja onde a fofura encontra seu lar");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Cadastrar Produto\n\n");

					break;
				case 2:
					System.out.println("Listar Todos os Produtos\n\n");

					break;
				case 3:
					System.out.println("Consultar Produto por código\n\n");

					break;
				case 4:
					System.out.println("Atualizar Dados de um produto\n\n");

					break;
				case 5:
					System.out.println("Apagar Produto\n\n");

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

}
