package Lista1;
import java.util.Scanner;
public class questão9 {
/*9) Verifique se A é maior que 10 e verifique se A mais B é igual a 20, se
verdadeiro, imprima: "A + B == 20''. Caso as afirmações não forem
verdadeiras imprima: "número não válido".*/
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Forneça o valor de A:");
		int A=leitor.nextInt();// para considerar verdadeiro precisa que as duas condições estejam de acordo
		System.out.println("Forneça o valor de B:");
		int B=leitor.nextInt();
		if(A>10 && A+B==20){
			System.out.println("A + B == 20");
		}
		else{
			System.out.println("número não válido");
		}
		leitor.close();
	}
}
