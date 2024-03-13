package loja;

import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;

import loja.controller.LojaController;
import loja.util.Cores;

public class Menu {

    public static void main(String[] args) {

        int opcao = 0;
        int idProcura, quantidade, tipo;
        String produto;
        float valor;
        
        Scanner leia = new Scanner(System.in);
        
        LojaController produtos = new LojaController();

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
            System.out.println("            6 - Remover Estoque                      ");
            System.out.println("            7 - Adicionar Estoque                    ");
            System.out.println("            8 - Sair                                 ");
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
            
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar Produto\n\n");

                    keyPress();
                    break;
                case 2:
                    System.out.println("Listar Todos os Produtos\n\n");
                    produtos.listarTodos();
                    keyPress();
                    break;
                case 3:
                    System.out.println("Consultar Produto por código\n\n");
                    System.out.print("Digite o código do produto procurado ==> ");
                    idProcura = leia.nextInt();
                    produtos.procurarPorCodigo(idProcura);

                    keyPress();
                    break;
                case 4:
                    System.out.println("Atualizar Dados de um produto\n\n");

                    keyPress();
                    break;
                case 5:
                    System.out.println("Apagar Produto\n\n");
                    System.out.print("Digite o ID do produto ==> ");
                    idProcura = leia.nextInt();
                    produtos.deletar(idProcura);

                    keyPress();
                    break;
                case 6:
                    System.out.println("Remover Estoque\n\n");

                    keyPress();
                    break;
                case 7:
                    System.out.println("Adicionar Estoque\n\n");

                    keyPress();
                    break;
                case 8:
                    System.out.println("\nFluffy Pets - A loja onde a fofura encontra seu lar");
                    sobre();
                    leia.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");

                    keyPress();
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