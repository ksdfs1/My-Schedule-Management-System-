package Schedule;

import java.util.Scanner;

//Exam 일정 클래스
public class Exam extends Schedule {
	
	public Exam() {
		
	}
	
	public Exam(ScheduleCategory category) {
		super(category);
	}
	
	public void printInfo() {
		System.out.print("[Category: " + getCategory() + "]  <date>: " + date + "  <time>: " + time 
						+ "  <place>: " + place + "  <content>: " + content);
	}
	
	public void getUserInput(Scanner input) {
		setScheduleDate(input);
		setScheduleTime(input);
		setSchedulePlace(input);
		setScheduleContent(input);
	}
	
	public void setSchedulePlace(Scanner input) {
		System.out.print("Input the place: ");
		String place = input.next();
		input.nextLine();
		this.setPlace(place);
	}

}
