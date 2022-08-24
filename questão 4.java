package Lista1;
import java.util.Scanner;
public class questão4 {
/*4) Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
imprima: "número válido". Caso as afirmações não sejam verdadeiras,
Verificar se A é igual B, caso verdade imprima: (A é igual B; A e B são
diferentes de 10; A é menor que 10) caso não seja verdade imprima:
"número não válido".*/
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Forneça o valor de A:");
		int A=leitor.nextInt();
		System.out.println("Forneça o valor de B:");
		int B=leitor.nextInt();
		if(A>10 || A+B==20){
			System.out.println("número válido");
			if(A==10){ // escolhi adicionar esse if pois daria comflito com o else if abaixo
				System.out.println("A é igual B e os dois são iguais a 10");
			}
		}
		else if(A==B && A!=10){ // coloquei desta forma pois se os dois fossem 10 não iria para esse if
			System.out.println("A é igual B, A e B são diferentes de 10, A é menor que 10");	
		}
		else {
			System.out.println("número inválido");
		}
		leitor.close();
	}
}
