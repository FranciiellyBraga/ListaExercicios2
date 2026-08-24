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
		
		System.out.println("Lista de nomes: " + alunos);
		
		sc.close();
	}
}
