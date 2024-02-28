package mytimetask;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.zone.ZoneRulesException;
import ownexception.CustomException;
import taskrequirements.Utilities;

public class TimeTask {
	
	public LocalDateTime currentTimeDate() {
		LocalDateTime now = LocalDateTime.now();
		return now;
	}
	
	public long currentTimeInMilliseconds() {
        long currentTimeMillis = System.currentTimeMillis();
        return currentTimeMillis;
    }
	
	public ZonedDateTime zoneTimeDate(String myString) throws CustomException {
		ZonedDateTime now = ZonedDateTime.now(zoneId(myString));
		return now;		
	}
	
	public ZoneId zoneId(String myString) throws CustomException {
		Utilities.checkNull(myString, "enter the string ,it cant be null");
		try {
			ZoneId zone = ZoneId.of(myString);
			return zone;
		} catch (ZoneRulesException zex) {
			throw new ZoneRulesException("enter the crct zone "+ zex.getMessage());
		} 
	}
	
	public DayOfWeek day(long millis,String myString) throws CustomException {
		return zoneDetails(millis,myString).getDayOfWeek();
	}
	
	private ZonedDateTime zoneDetails(long millis,String myString) throws CustomException {
		return Instant.ofEpochMilli(millis).atZone(zoneId(myString));
	}
	
	public Month month(long millis,String myString) throws CustomException {
		return zoneDetails(millis,myString).getMonth();
	}
	
	public int year(long millis,String myString) throws CustomException {
		return zoneDetails(millis,myString).getYear();
	}

}
