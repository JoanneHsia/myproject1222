package com.pei;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Vending {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("data.txt");
			System.out.println("File open");
		}catch (FileNotFoundException e) {
			System.out.println("File no found");
		}
		System.out.println("End");
		
		try {
			FileInputStream fis = new FileInputStream("data.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			String s = br.readLine();
			System.out.println(s);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			System.out.println("Error");
		}
		System.out.println("End");

	}

}
