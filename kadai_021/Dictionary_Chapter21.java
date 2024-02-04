package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
     public String dictionary(String word) {
    	String wordMeans = null;
		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウイ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
		
		for (String fruits: dictionary.keySet()) {
			if (word.equals(fruits)) {
				wordMeans = dictionary.get(fruits);
				break;
			}
		}
		
		return wordMeans;
	} 
}
