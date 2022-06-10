package Schedule;

import java.util.Scanner;

//Course ���� Ŭ����
public class Course extends Schedule {
	
	public Course() {
		
	}
	
	public Course(ScheduleCategory category) {
		super(category);
	}
	
	public void printInfo() {
		System.out.print("[Category: " + getCategory() + "]  <date>: " + date 
						 + "  <time>: " + time + "  <content>: " + content);
	}
	
	public void getUserInput(Scanner input) {
		setScheduleDate(input);
		setScheduleTime(input);
		setScheduleContent(input);
	}
}
