package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	public void dictionary(String word){

		HashMap<String, String>  dictionaryList = new HashMap<String, String>();

		dictionaryList.put("apple","りんご");
		dictionaryList.put("peach","桃");
		dictionaryList.put("banana","バナナ");
		dictionaryList.put("lemon","レモン");
		dictionaryList.put("pear","梨");
		dictionaryList.put("kiwi","キウィ");
		dictionaryList.put("strawberry","いちご");
		dictionaryList.put("grape","ぶどう");
		dictionaryList.put("muscat","マスカット");
		dictionaryList.put("cherry","さくらんぼ");

		String meaning = dictionaryList.get(word);

		if(dictionaryList.containsKey(word)) {
			System.out.println(word + "の意味は" + meaning);
		}else {
			System.out.println(word + "は辞書に存在しません");
		}


	}
}
