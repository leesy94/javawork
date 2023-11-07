package io01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ch03_CharStream {

	public static void main(String[] args) {
		/*
		문자 기반 스트림
		- 문자 스트림 : 데이터를 2byte 단위로 전송하는 통로
		- 기반 스트림 : 외무매체와 직접적으로 연결되는 통로
		
		xxxReader : 입력용 스트림
		xxxWriter : 출력용 스트림
		*/
		fileSave();
		fileRead(); 
	}
	public static void fileSave() {
		FileWriter fw = null ;
		try {
			fw = new FileWriter("bchar.txt");
			fw.write("한글 가능");
			
			char[] arr = {'a','b','c','d','e','f','g'};
			fw.write(arr);
			fw.write("\n");
			
			char[] arrStr = {'애','드','인'};
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	} 
	
	public static void fileRead() throws IOException {
		FileReader fr = null;
		try {
			fr = new FileReader("bchar.txt");
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.println(value);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
