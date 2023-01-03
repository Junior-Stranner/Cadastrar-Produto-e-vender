package DesafioProduto;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {



		Scanner in = new Scanner(System.in);

		Produto prod = new Produto();

		mostrarProduto(prod);

		lerMenu(prod);

	}


	private static void lerMenu(Produto prod ) {
		Scanner in = new Scanner(System.in);

		int op;
		int produto = 0;
		do {
			op = Menu();
			switch(op) {

			case 1: System.out.print("Mostrar produto \n="+prod.mostrarProduto());
			break;

			case 2: System.out.print("Visualizar Estoque \n ="+prod.vizualizaEstoque());
			break;

			case 3: System.out.print("comprar o novo PS5 !");
			produto = Integer.parseInt(in.nextLine());
			if(produto == 1) {
				System.out.println(" Quantidade do Estoque = "+prod.getQntdPro());
				if(prod.getQntdPro() < prod.Estoque(produto))
					prod.setQntdPro((int) (prod.getQntdPro() - prod.Estoque(produto)));
				System.out.println(" quantidade atualizada no esyoque = " +prod.getQntdPro());
				break;
			}
			case 4: System.out.print(" sair do sistema !!");
			break;

			}

		}while(op != 4 );
		System.out.println(" Sair do Sistema !");
	}

	private static int Menu() {
		Scanner in = new Scanner(System.in);

		int op;
		do {
			System.out.println("\n Menu \n"
					+ "\n 1 - Cadastrar Produto"
					+ "\n 2 - ver estoque"
					+ "\n 3 - comprar Produto "
					+ "\n 4 - sair ");
			op = Integer.parseInt(in.nextLine());

		}while(op < 1 || op > 4);
		return op;
	}

	private static void mostrarProduto(Produto prod ) {
		Scanner in = new Scanner(System.in);

		System.out.println("codigo =");
		prod.setCodigo(Integer.parseInt(in.nextLine()));
		System.out.println(" nome do Produto =");
		prod.setNomePro(in.nextLine());
		System.out.println(" valor do Produto =");
		prod.setValorPro(Double.parseDouble(in.nextLine()));
		System.out.println("Estoque =");
		prod.setQntdPro(Integer.parseInt(in.nextLine()));
	}

}
