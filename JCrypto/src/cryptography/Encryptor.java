package cryptography;

import java.math.BigInteger;
import java.util.Map;

public class Encryptor {


	public static String RotEncrypt(String plainText, int rotation){
		
		String encryptedText = "";
		
		while (rotation < 0){
			rotation += 26;
		}
		
		for (int i = 0; i < plainText.length(); i++){
			if (Character.isUpperCase(plainText.charAt(i)) && Character.isAlphabetic(plainText.charAt(i))){
				char c = (char) (plainText.charAt(i) + (rotation % 26));
				while (c < 65){
					c += 26;
				}
				while (c > 90){
					c -= 26;
				}
				encryptedText += c;
			}
			else if (Character.isLowerCase(plainText.charAt(i)) && Character.isAlphabetic(plainText.charAt(i))){
				char c = (char) (plainText.charAt(i) + (rotation % 26));
				while (c < 97){
					c += 26;
				}
				while (c > 122){
					c -= 26;
				}
				encryptedText += c;
			}
		}
		
		return encryptedText;
	}

	public static String MonoAlphabeticEncrypt(String plainText, Map<Character, Character> mapping){
		
		String encryptedText = "";
		
		for (int i = 0; i < plainText.length(); i++){
			if (!(mapping.get(plainText.charAt(i)) == null)){
				encryptedText += mapping.get(plainText.charAt(i));
			}
			else{
				encryptedText += plainText.charAt(i);
			}
		}
		
		return encryptedText;
	}
	
	public static String XorEncrypt(String plainText, String key){
		
		String encryptedText = "";
		
		for (int i = 0; i < plainText.length(); i++){
			encryptedText += (char) (plainText.charAt(i) ^ (key.charAt(i%key.length())));
		}
		
		return encryptedText;
		
	}

	public static int[] XorEncrypt(String plainText, int[] key){

		
		
		int[] encryptedNums = new int[plainText.length()];
		for (int i = 0; i < plainText.length(); i++){
			encryptedNums[i] = (int) (plainText.charAt(i) ^ key[i%key.length]);
		}
		return encryptedNums;
	}

	public static BigInteger RSAEncrypt(BigInteger num, BigInteger p, BigInteger q){
		
		BigInteger result = num;
		result = result.pow((int) p.longValueExact());
		result = result.mod(q);
		
		return result;
	}
	
	//future methods: polyalphabetic encrypt, RSA key set generation, md5 hash, multiplicative cipher, AES
}

