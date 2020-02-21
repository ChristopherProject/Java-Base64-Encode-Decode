import java.util.Scanner;

import javax.xml.bind.DatatypeConverter;

public class Cifratura {
	
	public static boolean isEncrypt;
	public static boolean isDECRYPT;

	public static String decrypt(String Stringa) {
		isDECRYPT = false;
		isEncrypt = true;
		String risolto = DatatypeConverter.printBase64Binary(Stringa.getBytes());
		return risolto;
	}

	public static String encrypt(String Stringa) {
		isEncrypt = false;
		isDECRYPT = true;
		if (Stringa.contains(" ")) {
			Stringa.replace(" ", "\n");
		}
		String cryptato = new String(DatatypeConverter.parseBase64Binary(Stringa));
	return cryptato;
	}
}
