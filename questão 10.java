package Lista1;
import java.util.Scanner;
public class questão10 {
/*10)Verifique se A é maior que 10 se não for imprima: "número menor que
10". Verifique se A mais B é igual a 20 se não for verdade imprima
"número diferente de 20".*/
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		System.out.println("Forneça o valor de A:");
		int A=leitor.nextInt();// como a questão so pede as não verdades, usei logo o equivalente delas nos ifs
		System.out.println("Forneça o valor de B:");
		int B=leitor.nextInt();// não coloquei nada para caso fosse verdadeiro pois a questão não pede
		if(A<=10) {
			System.out.println("número menor que 10");
		}
		if(A+B!=20){
			System.out.println("número diferente de 20");
		}
		leitor.close();
	}
}
