package estruturaCondicional;
import java.util.Scanner;
public class desafioMes1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o número do dia da semana: ");
		int mes = ler.nextInt();

		switch (mes) {
		case 1:
			System.out.println("O mês correpondente é Janeiro ");
			break;	
		case 2:
			System.out.println("O mês correpondente é Fevereiro ");
			break;    
		case 3:
			System.out.println("O mês correpondente é Março ");
			break;
		case 4:
			System.out.println("O mês correpondente é Abril ");
			break;		
		case 5:
			System.out.println("O mês correpondente é Maio ");
			break;		
		case 6:
			System.out.println("O mês correpondente é junho ");
			break;
		case 7:
			System.out.println("O mês correpondente é julho ");
			break;
		case 8:
			System.out.println("O mês correpondente é Agosto ");
			break;	
		case 9:
			System.out.println("O mês correpondente é Setembro ");
			break;
		case 10:
			System.out.println("O mês correpondente é Outubro ");
			break;
		case 11:
			System.out.println("O mês correpondente é Novembro ");
			break;
		case 12:
			System.out.println("O mês correpondente é Dezembro");
			break;
		default:
			System.out.println("mês inexistente");   

			ler.close();
		}
	}
	}
	
