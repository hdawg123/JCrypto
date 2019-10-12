package cryptography;

import java.util.HashMap;
import java.util.Map;

public class Analyzer {

	public static double frequencyAnalysis(String data, char freqChar){
		
		double counter = 0;
		for (int i = 0; i < data.length(); i++){
			if (data.charAt(i) == freqChar){
				counter++;
			}
		}
		
		return counter/data.length();
	}

	public static Map<Character, Double> frequencyAnalysisMap(String data){
		
		Map<Character, Double> mapping = new HashMap<Character, Double>();
		
		for (int i = 0; i < data.length(); i++){
			if (!mapping.containsKey(data.charAt(i))){
				double counter = 0;
				for (int j = 0; j < data.length(); j++){
					if (data.charAt(i) == data.charAt(j)){
						counter++;
					}
				}
				mapping.put(data.charAt(i), counter/data.length());
			}
		}
		return mapping;
	}
}
