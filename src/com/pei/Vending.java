package com.pei;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Vending {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("data.txt");
			System.out.println("File open");
		}catch (FileNotFoundException e) {
			System.out.println("File no found");
		}
		System.out.println("End");

	}

}
