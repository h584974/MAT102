package cesarKryptering;

public class Test {

	public static void main(String... blaaaa) {
		
		String s1 = "This is a test String that hopefully gets decrypted correctly";
		double[] frequency = tekstOgTelling.FrequencyOfString.frequencyOfString(s1);
		String s2 = CesarKryptering.dekrypter(s1, 15);
		
		System.out.println(s1);
		System.out.println("Encrypted String: " + s2);
		System.out.println(CesarKryptering.dekrypterFraFrekvens(s2, frequency));
		System.out.println(CesarKryptering.dekrypterE(s2));
		
	}
	
}