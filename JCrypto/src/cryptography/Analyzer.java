package cryptography;

import java.util.HashMap;
import java.util.Map;

public class Analyzer {

	public static double CharFrequencyAnalysis(String data, char freqChar){
		
		double counter = 0;
		for (int i = 0; i < data.length(); i++){
			if (data.charAt(i) == freqChar){
				counter++;
			}
		}
		
		return counter/data.length();
	}

	public static Map<Character, Double> CharFrequencyAnalysisMap(String data){
		
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

	public static double StringFrequencyAnalysis(String data, String freqString, String delimiter){
		
		String[] dataArray = data.split(delimiter);
		double counter = 0;
		
		for (int i = 0; i < dataArray.length; i++){
			if (dataArray[i].equals(freqString)){
				counter++;
			}
		}
		
		return counter/dataArray.length;
	}

	public static Map<String, Double> StringFrequencyAnalysisMap(String data, String delimiter){
		
		//bug in this method returning blank values in the Map
		Map<String, Double> mapping = new HashMap<String, Double>();
		String[] dataArray = data.split(delimiter);
		
		for (int i = 0; i < dataArray.length; i++){
			if (!mapping.containsKey(dataArray[i])){
				double counter = 0;
				for (int j = 0; j < dataArray.length; j++){
					if (dataArray[i].equals(dataArray[j])){
						counter++;
					}
				}
				mapping.put(dataArray[i], counter/dataArray.length);
			}
		}
		
		return mapping;
	}
}
