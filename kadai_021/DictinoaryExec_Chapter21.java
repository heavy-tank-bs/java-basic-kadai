package kadai_021;

public class DictinoaryExec_Chapter21 {
	public static void main (String[] args) {
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		String[] fruits = {"apple", "banana", "grape", "orange"};
		String result = null;
		for (int i = 0; i < fruits.length; i++) {
			result = dictionary.dictionary(fruits[i]);
			System.out.println(fruits[i] + result);
		}
	}
}
