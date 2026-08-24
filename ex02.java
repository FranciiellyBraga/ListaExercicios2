import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> alunos = new ArrayList<>();
		
		
		for (int i = 0; i < 10; i++){
		    System.out.println("Digite o " + (i+1) + "º nome");
		    String nome = sc.next();
		    alunos.add(nome);
		}
		
		System.out.println("Alunos cadastrados: " + alunos);
		
		System.out.println("Pesquisar: ");
		String busca = sc.next();
		
		if(alunos.contains(busca)){
		
		System.out.println("Resultado: Aluno encontrado!");
		} else {
		    System.out.println("Resultado: Aluno não encontrado.");
		}
		
		sc.close();
	}
}
