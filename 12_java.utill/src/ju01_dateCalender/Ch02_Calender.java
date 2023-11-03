package ju01_dateCalender;

import java.util.Calendar;
import java.util.Date;

public class Ch02_Calender {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance() ;
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int day = today.get(Calendar.DATE);
		int week = today.get(Calendar.DAY_OF_WEEK); // 1 : 일요일
		int hour = today.get(Calendar.HOUR_OF_DAY);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		String week2 = null;
	
		switch(week) {
			case 1 : week2 = "일요일" ; break;
			case 2 : week2 = "월요일" ; break;
			case 3 : week2 = "화요일" ; break;
			case 4 : week2 = "수요일" ; break;
			case 5 : week2 = "목요일" ; break;
			case 6 : week2 = "금요일" ; break;
			case 7 : week2 = "토요일" ; break;
		}
		
		//or
		
		String[] weeks = {"일","월","화","수","목","금","토"};
		System.out.println(weeks[today.get(Calendar.DAY_OF_WEEK)-1]);
		
		System.out.println(year+"년 "+month+"월 "+day+"일 "+week2+" "+hour+"시 "+minute+"분 "+second+"초 ");
		
		Calendar date = Calendar.getInstance();
		date.set(year, month, day); // 데이트 세팅
		
		
		
	}

}
