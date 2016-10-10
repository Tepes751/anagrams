package anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {

	public String createAnagram(String line){
		
		if (line == null) throw new IllegalArgumentException();
		
		String result = "";
		String temp = "";
		
		char separatedLine[] = line.toCharArray();	
				
		for (int i = 0; i < separatedLine.length; i++){
			
			if (separatedLine[i] == ' '){
				
				if (!temp.isEmpty()){
					result += createWordAnagram(temp);
					temp = "";
				}		
				
				result += " ";	
				
			} else {
				temp += separatedLine[i];
			}	
			
		}	
		
		if (!temp.isEmpty()){
			result += createWordAnagram(temp);
		}
				
		return result;
	}
	
	
	private String createWordAnagram(String word) {
		String result = "";		
		List<Character> tempLetter = new ArrayList<>();
		Map<Integer, Character> tempNotLetter = new HashMap<>();
		
		for (int j = word.length() - 1; j >= 0; j--){			
			if (Character.isLetter(word.charAt(j))){
				tempLetter.add(word.charAt(j));
			} else {
				tempNotLetter.put(j, word.charAt(j));
			}							
		}
		
		for (Map.Entry<Integer, Character> e: tempNotLetter.entrySet()){
			tempLetter.add(e.getKey(), e.getValue());
		}
		
		for (Character ch: tempLetter){
			result += ch;
		}	
		
		return result;		
	}
		
}
