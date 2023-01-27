package DAO;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeInfo {

	public static String convertTimeZone(String str) {

		//Geeting Calendar Instance
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();

		//Getting DateFormat Instance
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss Z");

		//Setting Time
		dateFormat.setTimeZone(TimeZone.getTimeZone(str));
		String ans=dateFormat.format(date);

		return ans;
	}
	
}
