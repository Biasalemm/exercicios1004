package estruturaCondicional;
import java.util.Scanner;
public class Multiplo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a;
		System.out.print("Informe um valor: ");
		a = ler.nextDouble();

		String mensagem = a % 5 == 0 ? "O numero : "+ a + " é multiplo de 5" : "O numero: " + a + " não é multiplo de 5";
		System.out.println(mensagem);

		ler.close();
	}

}
