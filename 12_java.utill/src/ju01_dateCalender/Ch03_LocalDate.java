package ju01_dateCalender;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ch03_LocalDate {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println(ld);
		
		//getMonthValue => int로 들고옴
		//getMonth => 영문 달이 나옴
		System.out.println(ld.getYear()+"년 "+ld.getMonthValue()+"월 "+ld.getDayOfMonth()+"일 ");
	
		ZonedDateTime seulDT = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		ZonedDateTime nyDT = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(seulDT);
		System.out.println(nyDT);
	
	}

}
