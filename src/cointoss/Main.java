package cointoss;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		boolean side;
		
		System.out.println("----- コイントスアプリ -----");
		Random rand = new Random();
		boolean tossAns = rand.nextBoolean();
		if(tossAns) {
			side = true;
		}else {
			side = false;
		}
		
		String str;
		
		if(side) {
			str = "表";
		}else {
			str = "裏";
		}
		
		System.out.println("コインは "+ str +"です。");
		System.out.println("--- アプリを終了します。 ---");

	}

}
