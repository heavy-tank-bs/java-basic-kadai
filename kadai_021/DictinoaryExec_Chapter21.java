package kadai_021;

public class DictinoaryExec_Chapter21 {
	public static void main (String[] args) {
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		String[] fruits = {"apple", "banana", "grape", "orange"};
		String result = null;
		for (int i = 0; i < fruits.length; i++) {
			result = dictionary.dictionary(fruits[i]);
			if (result != null) {
				System.out.println(fruits[i] + "の意味は" +  result);
			} else {
				System.out.println(fruits[i] + "は辞書に存在しません");
			}
		}
	}
}
