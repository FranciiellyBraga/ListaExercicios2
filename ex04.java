import java.util.ArrayList;
import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> alunos = new ArrayList<>();
		
		double soma = 0;
		int ap = 0, rp = 0;
		
		for (int i = 0; i < 10; i++){
		    System.out.println("Digite o " + (i+1) + "ª nota");
		    double nota = sc.nextDouble();
		    alunos.add(nota);
		    
		    soma += nota;
		    
		    if (nota>=6) {
		    	ap++; 
		    } else {
		    	rp++;
		    }
		}
		
		double med = soma / 10;
		
		System.out.println("Notas: " + alunos);
		System.out.println("Média: " + med);
		System.out.println("Aprovados: " + ap);
		System.out.println("Reprovados: " + rp);
		
		sc.close();
	}
}