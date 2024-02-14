package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	
	public String getMyChoice() {
		try (Scanner scanner = new Scanner(System.in)) {
		    String myChoice = scanner.next();
		    if (myChoice.equals("グー") && myChoice.equals("チョキ") && myChoice.equals("パー")) {
				throw new IllegalArgumentException("エラーです");
			}
			return myChoice;
		}
	}
	
	public String getRandom() {
		String[] random = {"r", "s", "p"};
		int i = (int)Math.floor(Math.random() * 3);
		return random[i];
	};
	
	public void playGame() {
		HashMap<String, String> jyankenMap = new HashMap<String, String>();
		jyankenMap.put("r", "グー");
		jyankenMap.put("s", "チョキ");
		jyankenMap.put("p", "パー");
		
		System.out.println("自分の手は" + jyankenMap.get(getMyChoice()) + "対戦相手の手は" + jyankenMap.get(getRandom()));
		
		if(jyankenMap.get(getMyChoice()).equals(jyankenMap.get(getRandom()))) {
			System.out.println("あいこです");
		} else if(jyankenMap.get(getMyChoice()).equals("チョキ")) {
			if(jyankenMap.get(getRandom()).equals("パー")) {
				System.out.println("自分の勝ちです");
			} else {
				System.out.println("自分の負けです");
			}
		} else if(jyankenMap.get(getMyChoice()).equals("パー")) {
			if(jyankenMap.get(getRandom()).equals("グー")) {
				System.out.println("自分の勝ちです");
			} else {
				System.out.println("自分の負けです");
			}
			
		} else if(jyankenMap.get(getMyChoice()).equals("グー")) {
			if(jyankenMap.get(getRandom()).equals("チョキ")) {
				System.out.println("自分の勝ちです");
			} else {
				System.out.println("自分の負けです");
			}
		}
		
		
	};
	
	
}
