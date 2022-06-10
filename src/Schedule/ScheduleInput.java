package Schedule;

import java.util.Scanner;

import exception.TimeFormatException;

//Schedule 클래스의 인터페이스.
public interface ScheduleInput {
	
	public ScheduleCategory getCategory();
	
	public void setCategory(ScheduleCategory category);
	
	public int getDate();
	
	public void setDate(int date);
	
	public String getTime();
	
	public void setTime(String time) throws TimeFormatException;
	
	public String getContent();
	
	public void setContent(String content);
	
	public void setPlace(String place);
	
	public String getPlace();
	
	public void setWho(String who);
	
	public String getWho();
	
	public void printInfo();
	
	public void getUserInput(Scanner input);
	
	public void setScheduleDate(Scanner input);
	
	public void setScheduleTime(Scanner input);
	
	public void setSchedulePlace(Scanner input);
	
	public void setScheduleWho(Scanner input);
	
	public void setScheduleContent(Scanner input);
}
