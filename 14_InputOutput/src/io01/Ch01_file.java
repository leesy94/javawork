package io01;

import java.io.File;
import java.io.IOException;

public class Ch01_file {

	public static void main(String[] args) {
		
		try {
			File f1 = new File("test.txt");
			f1.createNewFile();
			
			File f2 = new File("C:/Users/애드인에듀/test01.txt"); // 
			f2.createNewFile();
			
			File f3 = new File("C:/Users/애드인에듀/temp");
			f3.mkdir(); //폴더생성
			 
			System.out.println(f1.exists()); //존재하는지 여부
			System.out.println(new File("test03.txt"));
			
			System.out.println("f1은 파일?"+f1.isFile());
			System.out.println("f3는 파일?"+f3.isFile());
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
