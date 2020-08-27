package cesarKryptering;

public class CesarKryptering {
	
	public static String dekrypter(String s, int forskyv) {
		String kryptertStreng = "";
		int n = forskyv % 26;
		
		char[] charTab = s.toCharArray();
		for(char c : charTab) {
			if(c >= 'a' && c <= 'z') {
				kryptertStreng += (char)((((c - 'a') + n) % 26) + 'a');
			}
			else if(c >= 'A' && c <= 'Z') {
				kryptertStreng += (char)((((c - 'A') + n) % 26) + 'A');
			}
			else if(c == ' ') {
				kryptertStreng += c;
			}
		}
		
		return kryptertStreng;
	}
	
	public static String dekrypterFraFrekvens(String s, double[] normalFrequency) {
		double[] frequencyThis = tekstOgTelling.FrequencyOfString.frequencyOfString(s);
		
		int highestNormal = 0;
		for(int i = 0; i < normalFrequency.length; i++) {
			if(normalFrequency[i] > normalFrequency[highestNormal]) {
				highestNormal = i;
			}
		}
		
		int highestThis = 0;
		for(int i = 0; i < frequencyThis.length; i++) {
			if(frequencyThis[i] > frequencyThis[highestNormal]) {
				highestThis = i;
			}
		}
		
		System.out.println(highestThis + " " + highestNormal);
		
		int offset = highestThis - highestNormal;
		
		return dekrypter(s, (26 - offset) % 26);
	}
	
	public static String dekrypterE(String s) {
		double[] frequencyThis = tekstOgTelling.FrequencyOfString.frequencyOfString(s);
		
		int highestNormal = 'e' - 'a';
		
		int highestThis = 0;
		for(int i = 0; i < frequencyThis.length; i++) {
			if(frequencyThis[i] > frequencyThis[highestNormal]) {
				highestThis = i;
			}
		}
		
		int offset = highestThis - highestNormal;
		
		return dekrypter(s, (26 - offset) % 26);
	}
	
	public static void skrivAlleDekrypteringer(String s) {
		for(int i = 0; i < 26; i++) {
			System.out.println(dekrypter(s, i));
		}
	}

}






