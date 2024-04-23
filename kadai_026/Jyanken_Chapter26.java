package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	private final String R = "r";
	private final String S = "s";
	private final String P = "p";

	// 自分のじゃんけんの手を入力する
	public String getMyChoice(){
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		while (true) {
			Scanner scanner = new Scanner(System.in);
			String input = scanner.next();
			if(input.equals(R) || input.equals(S) || input.equals(P)) {
				scanner.close();
				return input;
			}else {
				System.out.println("不正な値です");
				System.out.println("「r,s,p」のいずれかを入力してください");
				continue;
			}
		}
	}

	// 対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom(){
		String[] partner = {R, S, P};
		int i = (int) Math.floor(Math.random()*3);

		return partner[i];

	}

	// じゃんけんを行う
	public void playGame(){
		String myHand = getMyChoice();
		String partner = getRandom();

		HashMap<String,String> hand = new HashMap<String,String>();
		hand.put(R,"グー");
		hand.put(S,"チョキ");
		hand.put(P,"パー");

		System.out.println("自分の手は" + hand.get(myHand) + ",対戦相手の手は" + hand.get(partner));

		if(myHand.equals(partner)) {
			System.out.println("あいこです");
		}else {
			switch(myHand) {
			case R -> {
				if(partner.equals(S)) {
					System.out.println("自分の勝ちです");
				}if(partner.equals(P)) {
					System.out.println("自分の負けです");
				}
			}
			case S -> {
				if(partner.equals(P)) {
					System.out.println("自分の勝ちです");
				}if(partner.equals(R)) {
					System.out.println("自分の負けです");
				}
			}
			case P -> {
				if(partner.equals(R)) {
					System.out.println("自分の勝ちです");
				}if(partner.equals(S)) {
					System.out.println("自分の負けです");
				}
			}
			}

		}
	}
}

