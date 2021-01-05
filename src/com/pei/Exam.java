package com.pei;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exam {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("d1");
			BufferedReader br = new BufferedReader(fr);
			String data = br.readLine();
			System.out.println(data);
			String [] array = data.split(data);
			System.out.println(array[0]);
			System.out.println(array[1]);
			System.out.println(array[2]);
			int a = Integer.parseInt(array[0]);
			int b = Integer.parseInt(array[1]);
			int result = Integer.parseInt(array[2]);
			
			boolean matched = false;
			
			int and = ((a&b) > 0) ? 1 : 0;
			if (result == and) {
				System.out.println("AND");
				matched = true;
			}
			
			int or = ((a|b) > 0) ? 1 : 0;
			if (result == or) {
				System.out.println("OR");
				matched = true;
			}
			
			int xor = ((a^b) > 0) ? 1 : 0;
			if (result == xor) {
				System.out.println("XOR");
				matched = true;
			}
			if (!matched) {
				System.out.println("Impossible");
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
