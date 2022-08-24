package Lista1;
import java.util.Scanner;
public class questão7 {
/*7) Verifique se A é maior que 10 ou se o A mais B é igual a 20, caso sejam
verdadeiras as afirmações imprima: "números válidos”. Caso a primeira
afirmação não seja verdadeira, imprima: "número não válido".*/
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Forneça o valor de A:");
		int A=leitor.nextInt();// não vou colocar nada para caso a segunda afirmação seja falsa pois não é pedido
		System.out.println("Forneça o valor de B:");
		int B=leitor.nextInt(); //entendi que somente uma impressão deveria ser feita, então coloquei o limitante escrito primeiro
		if(A<=10 && A+B!=20){
			System.out.println("número não válido");
		}
		else if(A>10 || A+B==20){
			System.out.println("números válidos");

		}
		leitor.close();
	}
}
