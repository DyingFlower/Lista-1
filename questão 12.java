package Lista1;
import java.util.Scanner;
public class questão12 {
/*12) Verifique se A é maior que 10 imprima: "A > 10" ou verifique se A mais
B é igual a 20, imprima: "A + B == 20'', caso as afirmações não sejam
verdadeiras, imprima: "números não válidos". Sejam as afirmações
anteriores falsas ou verdadeiras imprima: “Sejam bem-vindos à
disciplina de Técnicas de Programação”.*/
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Forneça o valor de A:");
		int A=leitor.nextInt();// a forma que eu achei de verificar um ou outro foi essa, aí separa as respostas
		System.out.println("Forneça o valor de B:");
		int B=leitor.nextInt();
		if(A>10){
			System.out.println("A > 10");
		}
		else if(A+B==20) {
			System.out.println("A + B == 20");
		}
		else {
			System.out.println("números não válidos");
		}
		System.out.println("Sejam bem-vindos à disciplina de Técnicas de Programação");
		leitor.close();
	}
}
