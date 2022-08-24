package Lista1;
import java.util.Scanner;
public class questão13 {
/*13) Verifique se A é maior que 10, se verdade imprima: "A > 10". Ainda,
verifique se o A mais B é igual a 20, se verdade imprima: "A + B == 20”.
Caso as afirmações não sejam verdadeiras, imprima: "números não
válidos".*/
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Forneça o valor de A:");
		int A=leitor.nextInt();//entendi que só seria colocados numeros invalidos caso as duas afirmações não fossem verdadeiras
		System.out.println("Forneça o valor de B:");
		int B=leitor.nextInt();
		if(A<=10 && A+B!=20){
			System.out.println("números não válidos");// analisando primeiro o limitante
		}
		if(A>10){
			System.out.println("A > 10");
		}
		if(A+B==20){
			System.out.println("A + B == 20");
		}
		leitor.close();
	}
}
