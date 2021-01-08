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
			//AND
			int and = ((a&b) > 0 ? 1 : 0);
			if (result == and) {
				System.out.println("AND");
				matched = true;
			}
			//OR
			int or = ((a|b) > 0 ? 1 : 0);
			if (result == or) {
				System.out.println("OR");
				matched = true;
			}
			//XOR
			int xor = ((a^b) > 0 ? 1 : 0);
			if (result == xor) {
				System.out.println("XOR");
				matched = true;
			}
			if (! matched) {
				System.out.println("IMPOSSIBLE");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
