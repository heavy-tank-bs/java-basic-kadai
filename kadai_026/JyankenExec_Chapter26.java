package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Jyanken_Chapter26 jc26 = new Jyanken_Chapter26();		
		jc26.getMyChoice();
		jc26.getRandom();
		jc26.playGame();
		
	}

}
