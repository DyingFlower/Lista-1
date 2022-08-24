package Lista1;
import java.util.Scanner;
public class questão1 {
/* 1) Verifique se A é maior que 10, se verdade imprima: "A > 10" e verifique
se o A mais B é igual a 20, se verdade imprima: "A + B == 20". Caso a
segunda afirmação não seja verdadeira, imprima: "número não válido". */
	public static void main(String[] args) {
		//comecei a testar coletar valores de variáveis
		Scanner leitor = new Scanner(System.in);
		System.out.println("Forneça o valor de A:");
		int A = leitor.nextInt();
		System.out.println("Forneça agora o valor de B:");
		int B = leitor.nextInt();
		if(A>10) {
			System.out.println("A > 10");
		}
		if(A+B==20) {
			System.out.println("A + B == 20");
		}
		else {
			System.out.println("número não válido");
		}
		leitor.close();
	}

}
