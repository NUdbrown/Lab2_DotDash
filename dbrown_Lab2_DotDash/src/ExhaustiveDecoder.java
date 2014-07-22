import java.util.List;
import java.util.Set;

import edu.neumont.nlp.DecodingDictionary;


public class ExhaustiveDecoder {
	
	private DecodingDictionary dd; 
	
	public List<String> decode(String message){
		dd =new DecodingDictionary();
		
		Set<String> codes = dd.getCodes();
		
		//success case, returns true
		
		//failure case, returns false
		
		//for loop to try each option
		for(int i=0; i<message.length(); i++){
			String word = message.substring(i);
			Set<String> words = dd.getWordsForCode(word); 
			if(codes.contains(words)){
				
			}
			
		}
		
		
		
		
		
		
		
		
		return null;
		
	}

}
