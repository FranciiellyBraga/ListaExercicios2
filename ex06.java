import java.util.ArrayList;
import java.util.Scanner;

class Aluno {
	String nome;
	int idade;
	double  nota;
	
	public Aluno (String nome, int idade, double nota) {
		this.nome = nome;
		this.idade = idade;
		this.nota = nota;
	}
}

public class ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Aluno> alunos = new ArrayList<>();
		int op = 0;

		while (op != 7) {
			System.out.println("Menu: ");
			System.out.println("1- Cadastrar aluno");
			System.out.println("2- Listar alunos");
			System.out.println("3- Pesquisar aluno");
			System.out.println("4- Remover aluno");
			System.out.println("5- Calcular média da turma");
			System.out.println("6- Mostrar alunos aprovados");
			System.out.println("7- Sair");
			System.out.println("Escolha uma opção");

			op = sc.nextInt();
			sc.nextLine();

			switch (op) {
			case 1:
				System.out.println("Digite o nome do aluno: ");
				String nome = sc.nextLine();
				
				System.out.println("Digite a idade do aluno: ");
				int idade = sc.nextInt();
				
				System.out.println("Digite a nota do aluno: ");
				double nota = sc.nextDouble();
				
				sc.nextLine();
				
				Aluno al = new Aluno(nome, idade, nota);
				alunos.add(al);
				
				System.out.println("Aluno cadastrado com sucesso!");
				break;
				
			case 2:
				System.out.println("Lista de Alunos: ");
				if (alunos.isEmpty()) {
					System.out.println("Nenhum aluno cadastrado.");
				} else {
					for (Aluno a : alunos) {
						System.out.println("Nome: " + a.nome + " Idade: " + a.idade + " Nota: " + a.nota);
					}
				}
				break;
				
			case 3:
				System.out.println("Digite o nome do aluno para pesquisar: ");
				String busca = sc.nextLine();

				boolean encontrado = alunos.stream().anyMatch(a -> a.nome.equalsIgnoreCase(busca));
				String r = (encontrado) ? "Aluno encontrado!" : "Aluno não encontrado.";
				System.out.println(r);
				break;
				
			case 4:
				System.out.println("Digite o nome do aluno que deseja remover: ");
				String remover = sc.nextLine();

				boolean removido = alunos.removeIf(a -> a.nome.equalsIgnoreCase(remover));
				String result = (removido) ? "Aluno removido com sucesso!" : "Aluno não encontrado.";
				System.out.println(result);
				break;
				
			case 5:
				if (alunos.isEmpty()) {
					System.out.println("Nenhum aluno cadastrado.");
				} else {
					double soma = 0;
					for (Aluno a : alunos) {
						soma += a.nota;
					}
					double med = soma / alunos.size();
					System.out.printf("Média da turma: %.2f\n ", med);
				}
				break;
				
			case 6:
				if (alunos.isEmpty()) {
					System.out.println("Nenhum aluno cadastrado.");
				} else {
					int ap = 0;
					System.out.println("Alunos aprovados: ");
					for (Aluno a : alunos) {
						if (a.nota >= 6) {
							System.out.println("- " + a.nome + " | Nota: " + a.nota);
							ap++;
						}
					}
					System.out.println("Aprovados: " + ap);
				}
				break;
				
			case 7:
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