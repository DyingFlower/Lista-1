package Lista1;
import java.util.Scanner;
public class questão11 {
/*11)Verifique se A é maior que 10 se não for verifique se A mais B é igual a
20, imprima: "A + B == 20''. Caso A não seja maior que 10 e A mais B
for diferente de 20, imprima: "número não válido".*/
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Forneça o valor de A:");
		int A=leitor.nextInt();// questão meio confusa, não entendi se era para imprimir avulsamente "A + B == 20,
		System.out.println("Forneça o valor de B:");
		int B=leitor.nextInt();// para fazer mais sentido coloquei como condição de sua verificação e não coloquei nada no if
		if(A>10) { // pois não foi pedido
		}
		else if(A+B==20){
			System.out.println("A + B == 20");
		}
		else {
			System.out.println("número inválido");
		}
		leitor.close();
	}
}
