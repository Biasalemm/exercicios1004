package estruturaCondicional;
import java.util.Scanner;
public class notaAluno {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	double nota1,nota2,nota3,nota4,med;
    
    System.out.println("Informe a primeira nota: ");
    nota1 = ler.nextDouble();
    
    System.out.println("Informe a segunda nota: ");
    nota2 = ler.nextDouble();
    
    System.out.println("Informe a terceira nota: ");
    nota3 = ler.nextDouble();
    
    System.out.println("Informe a quarta nota: ");
    nota4 = ler.nextDouble();
    
    med = (nota1+nota2+nota3+nota4)/4;
    
    String mensagem = med >= 6 ? "Voce está aprovado! Sua media foi :"+ med : "Voce está reprovado, sua media foi:" + med;
	System.out.println(mensagem); 
    
ler.close();
	}

}
