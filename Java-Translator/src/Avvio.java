import java.util.Scanner;
import java.util.Stack;

import javax.xml.bind.DatatypeConverter;

public class Avvio {

	
	public static void main(String[] args) {
		//select
		Cifratura.isDECRYPT = false;
		Cifratura.isEncrypt = true;
		//load
		Systema();
	}
	
	private static void Systema() {
		if(Cifratura.isEncrypt) {
			System.out.print("Inserisci La Stringa da Cryptare: ");
		}else if(Cifratura.isDECRYPT) {
			System.out.print("Inserisci La Stringa Cryptata: ");
		}
		try (Scanner scanner = new Scanner(System.in)) {
			String s = scanner.nextLine();
			if(Cifratura.isEncrypt) {
				String stringaCrytpata = Cifratura.encrypt(s);
				System.out.println("Stringa Cryptata: " +  stringaCrytpata);
			}else if(Cifratura.isDECRYPT) {
				String stringaDecrytpata = Cifratura.decrypt(s);
				System.out.println("Stringa Decryptata: " +  stringaDecrytpata);
			}
		}
	}
}


