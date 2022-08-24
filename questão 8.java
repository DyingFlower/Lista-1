package Lista1;
import java.util.Scanner;
public class questão8 {
/*8) Verifique se A é maior que 10, se verdade imprima: "A > 10" e verifique
se A mais B é igual a 20, se verdadeiro, imprima: "A + B == 20” se não
for verdade: imprima "número não válido ". */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Forneça o valor de A:");
		int A=leitor.nextInt(); // entendi que a segunda verificação que deve receber uma opção caso seja falsa
		System.out.println("Forneça o valor de B:");
		int B=leitor.nextInt(); // a primeira não vou escrever nada caso seja falsa, foi o que interpretei
		if(A>10){// no caso sairá 1 ou 2 impressões
			System.out.println("A > 10");
		}
		if(A+B==20){
			System.out.println("A + B == 20");
		}
		else{
			System.out.println("número não válido");
		}
		leitor.close();
	}
}
