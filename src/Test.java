
import myabstract.DateTimeUtils;

public class Test extends DateTimeUtils{
	public static void main(String[]args){
		System.out.println("Time: "+new Test().getTime("2016-11-16 06:43:19"));
		System.out.println("Date: "+new Test().getDate("2016-11-16 06:43:19"));
	}
}
