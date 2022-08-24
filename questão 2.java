package Lista1;
import java.util.Scanner;
public class questão2 {
/* 2) Verifique se A é menor que 10, se verdade imprima: "A < 10", e verifique
se o A mais B é igual a 20, se verdade imprima: "A + B == 20". Caso
nenhumas das afirmação não seja verdadeira, imprima: "número não
válido", (obs: apenas uma impressão é permitida na saída do programa).*/
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Forneça o valor de A:");
		int A = leitor.nextInt();
		System.out.println("Forneça o valor de B:");
		int B = leitor.nextInt();
		if(A<10){
			if(A+B==20) {
				System.out.println("A < 10 e A + B = 20");
			}
			else {
				System.out.println("A < 10");
			}
		}
		else if(A+B==20) {
			System.out.println("A + B = 20");
		}
		else {
			System.out.println("número não válido");
		}
		leitor.close();
	}

}
