package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String beginTime = "2018-07-28 14:42:32";
		String endTime = "2018-07-29 12:26:32";

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
		Date date1 = format.parse(beginTime);
		Date date2 = format.parse(endTime);

		int compareTo = date1.compareTo(date2);
		System.out.println(compareTo);
		//1
		compareTo = date2.compareTo(date1);
		System.out.println(compareTo);
		//-1
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
