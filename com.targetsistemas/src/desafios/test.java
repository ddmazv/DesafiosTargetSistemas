package desafios;

import java.util.Scanner;

import desafios.stringverify.StringVerify;
import desafios.valorsoma.SomaValue;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("teste calc");
		SomaValue soma = new SomaValue(12,0,1);
		System.out.println(soma.calc());
		*/
		
		
		StringVerify str = new StringVerify();
		Scanner scan = new Scanner(System.in);
		System.out.print("digite a palavra para verificar: ");
		String text = scan.next();
		String character = scan.next();
		System.out.println(str.containAChar(text, character));
		
		
		System.out.print("digite a palavra para verificar usando metodos do java: ");
		text = scan.next();
		character = scan.next();
		System.out.println(str.containACharJavaM(text, character));
		
		
		
		
		
	}

}
