package com.tom;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exam1 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("d1");
			BufferedReader br = new BufferedReader(fr);
			String data = br.readLine();
			System.out.println(data);
			String[] aa = data.split(" ");
			System.out.println(aa[0]);
			System.out.println(aa[1]);
			System.out.println(aa[2]);
			int a = Integer.parseInt(aa[0]);
			int b = Integer.parseInt(aa[1]);
			int result = Integer.parseInt(aa[1]);
			//System.out.println(a|b);
			boolean matched = false;
			//And
			int and = ((a&b) > 0 ? 1 : 0);
			if (result == and) {
				System.out.println("And");
				matched = true;
			}
			//Or
			//Xor
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
