package tekstOgTelling;

public class FrequencyOfString {
	
	public static double[] frequencyOfString(String text) {
		double[] frequencyTable = new double[26];
		char[] textAsArray = text.toCharArray();
		int numberOfLetters = 0;
		
		for(char c : textAsArray) {
			if(c >= 'a' && c <= 'z') {
				frequencyTable[c - 'a']++;
				numberOfLetters++;
			}
			else if(c >= 'A' && c <= 'Z') {
				frequencyTable[c - 'A']++;
				numberOfLetters++;
			}
		}
		
		for(int i = 0; i < frequencyTable.length; i++) {
			frequencyTable[i] /= numberOfLetters;
		}
		
		return frequencyTable;
	}
	
	public static void writeFrequencyTable(double[] frequencyTable) {
		String s = null;
		for(int i = 0; i < frequencyTable.length; i++) {
			s = String.format("%1.3f", frequencyTable[i]);
			System.out.println((char)(i + 'a') + ": " + s);
		}
	}

}