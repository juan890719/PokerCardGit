package com.tom;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Vending {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("data.txt");
			System.out.println("File opened");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		System.out.println("End");
	}
}
