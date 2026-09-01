import java.util.ArrayList;
import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> produtos = new ArrayList<>();
		int op = 0;

		while (op != 5) {
			System.out.println("===== MENU =====");
			System.out.println("1- Adicionar produto");
			System.out.println("2- Listar produtos");
			System.out.println("3- Pesquisar produto");
			System.out.println("4- Remover produto");
			System.out.println("5- Sair");
			System.out.println("Escolha uma opção");

			op = sc.nextInt();
			sc.nextLine();

			switch (op) {
			case 1:
				System.out.println("Digite o nome do produto: ");
				String prod = sc.nextLine();
				produtos.add(prod);
				System.out.println("Produto adicionado com sucesso!");
				break;
			case 2:
				System.out.println("Lista de Produtos: ");
				if (produtos.isEmpty()) {
					System.out.println("Nenhum produto cadastrado.");
				} else {
					for (String p : produtos) {
						System.out.println("- " + p);
					}
				}
				break;
			case 3:
				System.out.println("Digite o nome do produto para pesquisar: ");
				String busca = sc.nextLine();

				boolean encontrado = produtos.contains(busca);
				String r = (encontrado) ? "Produto encontrado!" : "Produto não encontrado.";
				System.out.println(r);
				break;
			case 4:
				System.out.println("Digite o nome do produto que deseja remover: ");
				String remover = sc.nextLine();

				boolean removido = produtos.removeIf(p -> p.equalsIgnoreCase(remover));
				String result = (removido) ? "Produto removido com sucesso!" : "Produto não encontrado.";
				System.out.println(result);
	
				break;
			case 5:
				System.out.println("Encerrando o programa...");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
				break;
			}
		}
		sc.close();
	}
}