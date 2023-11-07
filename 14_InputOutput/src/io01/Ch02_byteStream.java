package io01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ch02_byteStream {

	public static void main(String[] args) {
		//바이트 기반 스트림 : 1byte 전송(한글불가)
		//기반 스트립 : 외부매체와 직접적으로 연결되는 통로
		
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("abyte_txt",true);
			//false(default) : 파일에 데이터가 있으면 덮어쓰기
			//true(default) : 파일에 데이터가 있으면 이어쓰기
			
			byte[] arr = {100,33,24};
			fout.write(arr);
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			fout.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void fileRead() {
		//FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력하는 스트림
		/*	1.스트림 생성(통로만들기)
			2. 스트림 데이터를 입력받아옴(메소드활용)
			3. 다 사용한 수에 스트림 반납
		*/
		FileInputStream fi =  null;
		try {
			fi = new FileInputStream("abyte_txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		try {
			//while(조건문에서도 읽히고, 들어와서도 파일 읽음)
			/*System.out.println(fi.read());
			System.out.println(fi.read());
			System.out.println(fi.read());
			System.out.println(fi.read());
			System.out.println(fi.read());*/
			
			/*while(fi.read() != -1) {
				System.out.println(fi.read());
			}*/
			//권장
			int result = 0;
			while((result = fi.read()) != -1) {
				System.out.println(result);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		try {
			fi.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
