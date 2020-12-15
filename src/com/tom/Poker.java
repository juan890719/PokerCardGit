package com.tom;

public class Poker {

	public static void main(String[] args) {
		PokerCard card = new PokerCard(28);
		System.out.println(card.value);
		
//		int[] cards = new int[52];
//		char[] types = {'S','H','D','C'};
//		for(int i=0; i<52; i++) {
//			cards[i] = i;
//		}
//		for(int i=0; i<52; i++) {
//			if(i%13 == 0 && i != 0) {
//				System.out.println("");
//			}
//			char flower = types[i/13];
//			System.out.print(cards[i]%13+1 + "" + flower + " ");
//		}
	}

}
