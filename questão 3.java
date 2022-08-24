package Lista1;
import java.util.Scanner;
public class questão3 {
/*3) Verifique se A é igual a 10, se verdade imprima: "A == 10", e verifique
se o A mais B é igual a 20, se verdade imprima: "A + B == 20". verifique
se o B é igual a 10, se verdade imprima: "B == 10", (obs: todas as três
impressões são permitidas na saída do programa).*/
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Forneça o valor de A:");
		int A = leitor.nextInt();
		System.out.println("Forneça o valor de B:");
		int B = leitor.nextInt();
		if(A==10){
			System.out.println("A == 10");
		}
		if(A+B==20){
			System.out.println("A + B == 20");
		}
		if(B==10){
			System.out.println("B == 10");
		}
		leitor.close();
	}
}
