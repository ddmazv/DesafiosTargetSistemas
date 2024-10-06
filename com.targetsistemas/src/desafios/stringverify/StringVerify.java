package desafios.stringverify;

import java.util.ArrayList;

public class StringVerify {
	ArrayList<Character> charactersmach;
	int qtdchars;

	public String containAChar(String text, String verifychar) {
		char[] charactersArray = new char[text.length()];
		charactersmach = new ArrayList<Character>();
		text.getChars(0, text.length(), charactersArray, 0);

		for (char character : charactersArray) {
			if (character == upChar(verifychar) || character == lowChar(verifychar)) {
				charactersmach.add(character);
			}

		}
		qtdchars = charactersmach.size();
		if (qtdchars < 1) {
			System.out.println("caractere não encontrado");
		}
		return charactersmach.toString();
	}

	
	public char upChar(String verify) {
		char cutupper = verify.toUpperCase().charAt(0);
		return cutupper;
	}

	public char lowChar(String verify) {
		char cutlower = verify.toLowerCase().charAt(0);
		return cutlower;
	}

	public int getQtdChars() {
		return qtdchars;
	}
}
