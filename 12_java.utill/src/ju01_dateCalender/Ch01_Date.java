package ju01_dateCalender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ch01_Date {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now); //now.toString() 같음
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E요일");
		System.out.println(sdf.format(now));
		//MM : 월 / mm : 분 / E : 요일 / a : 오전,오후
		
		String strDate = "20231103";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd"); //폼이 딱 맞아야됨, 안맞으면 오류남
		Date strNow; // string -> date로 바꿔야됨
		try {
			strNow = sdf2.parse(strDate);
			System.out.println(strNow);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
