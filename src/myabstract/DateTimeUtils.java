package myabstract;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@SuppressWarnings("all")
public abstract class DateTimeUtils {
	public String getTime(String temp){
		try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date parsedDate = dateFormat.parse(temp);
            Calendar cal = Calendar.getInstance();
            cal.setTime(parsedDate);
            String hour = new String(String.valueOf(cal.get(cal.HOUR))).length()==2 ? ""+cal.get(cal.HOUR) : "0"+cal.get(cal.HOUR);
            String minute = new String(String.valueOf(cal.get(cal.MINUTE))).length()==2 ? ""+cal.get(cal.MINUTE) : "0"+cal.get(cal.MINUTE);
            String second = new String(String.valueOf(cal.get(cal.SECOND))).length()==2 ? ""+cal.get(cal.SECOND) : "0"+cal.get(cal.SECOND);
            return hour+":"+minute+":"+second;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
	}
	
	public String getDate(String temp){
		try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date parsedDate = dateFormat.parse(temp);
            Calendar cal = Calendar.getInstance();
            cal.setTime(parsedDate);
            String date = new String(String.valueOf(cal.get(cal.DATE))).length()==2 ? ""+cal.get(cal.DATE) : "0"+cal.get(cal.DATE);
            String month = new String(String.valueOf(cal.get(cal.MONTH))).length()==2 ? ""+cal.get(cal.MONTH) : "0"+cal.get(cal.MONTH);
            String year = new String(String.valueOf(cal.get(cal.YEAR))).length()==4 ? ""+cal.get(cal.YEAR) : ""+cal.get(cal.YEAR);
            return date+"/"+String.valueOf(Integer.parseInt(month)+1)+"/"+year;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
	}
}
