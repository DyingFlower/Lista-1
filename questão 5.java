package Lista1;
import java.util.Scanner;
public class questão5 {
/*5) Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
imprima: "número válido". Caso as afirmações não sejam verdadeiras,
imprima: "número não válido".*/
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Forneça o valor de A:");
		int A=leitor.nextInt(); 
		System.out.println("Forneça o valor de B:");
		int B=leitor.nextInt();
		if(A>10 || A+B==20) {
			System.out.println("número válido");
		}
		else {
			System.out.println("número não válido");
		}
		leitor.close();
	}
}
