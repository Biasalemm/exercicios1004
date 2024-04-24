package estruturaCondicional;
import java.util.Scanner;
public class Bonuscelular {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double temp;

		System.out.print("Informe o seu tempo na empresa: ");
		temp = ler.nextDouble();
		
		String mensagem = temp <= 3 ? "O seu bonus é de 5% " : "O seu bonus é de 7% ";
		System.out.println(mensagem);
		
		
	ler.close();
	}
}
	
	
	
	
	
	

		
	








