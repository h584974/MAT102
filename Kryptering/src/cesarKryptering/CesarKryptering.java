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
		}
		
		return kryptertStreng;
	}

}