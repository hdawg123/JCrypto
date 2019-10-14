package cryptography;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class INIT {

	public static void main(String[] args) {
		

		System.out.println(Encryptor.RotEncrypt("test code", 11));
		String[] str = Decryptor.RotDecrypt("epdenzop");
		for (int i = 0; i < str.length; i++){
			System.out.println(str[i]);
		}
	}

}
