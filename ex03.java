import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(10,20,30,40,50));
		
		System.out.println("Lista inicial: " + num);
		
		System.out.println("Digite o número que deseja remover: ");
		int remover = sc.nextInt();
		
		if(num.contains(remover)){
			for ( int i = 0; i < num.size(); i++) {
				if (num.get(i) == remover) {
					num.remove(i);
					break;
				}
			}
			System.out.println("Resultado: " + num);
		} else {
		    System.out.println("Número não encontrado na lista.");
		}
		
		sc.close();
	}
}