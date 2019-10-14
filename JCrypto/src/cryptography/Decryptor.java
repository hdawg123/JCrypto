package cryptography;

public class Decryptor {

	public static String[] RotDecrypt(String cipherText) {
		
		String[] decryptedTexts = new String[26];
		for (int i = 0; i < 26; i++){
			
			String decryptedText = "";
			
			for (int j = 0; j < cipherText.length(); j++){
				
				if (Character.isUpperCase(cipherText.charAt(j)) && Character.isAlphabetic(cipherText.charAt(j))){
					
					int num = cipherText.charAt(j) + i;
					while (num < 65){
						num += 26;
					}
					while (num > 90){
						num -= 26;
					}
					decryptedText += (char) num;
				}
				else if (Character.isLowerCase(cipherText.charAt(j)) && Character.isAlphabetic(cipherText.charAt(j))){
					
					int num = cipherText.charAt(j) + i;
					while (num < 97){
						num += 26;
					}
					while (num > 122){
						num -= 26;
					}
					decryptedText += (char) num;
				}
			}
			decryptedTexts[i] = decryptedText;
			
		}
		
		return decryptedTexts;
	}
}
