package com.addinedu.run;

import com.addinedu.model.vo.Ch01_Product;

public class Ch01_ProductMainTest {

	public static void main(String[] args) {
		Ch01_Product pd = new Ch01_Product("pd111","텀블러","스타벅스",30000,3.3); 
		Ch01_Product pd1 = new Ch01_Product("pd222","하세요","반가워요",4400,5.5);
		Ch01_Product pd2 = new Ch01_Product("pd333","다시","만나요",550000,1.5);
		
		pd.setPrice(1200000);
		pd1.setPrice(1200000);
		pd2.setPrice(1200000);
		
		pd.setTax(0.05);
		pd2.setTax(0.05);
		pd2.setTax(0.05);
		
		System.out.println("부가세 포함 가격 = " + (pd.getPrice() + (pd.getPrice() * pd.getTax())));
		System.out.println("pd의 정보 : "+pd.info());
		System.out.println("pd1의 정보 : "+pd1.info());
		System.out.println("pd2의 정보 : "+pd2.info());
		
		
	}

}
