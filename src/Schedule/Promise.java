package Schedule;

import java.util.Scanner;

//Promise 일정 클래스
public class Promise extends Schedule {
	
	public Promise() {
		
	}
	
	public Promise(ScheduleCategory category) {  //생성자(super를 통해 category 초기화)
		super(category);
	}
	
	public void printInfo() {
		System.out.print("[Category: " + getCategory() + "]  <date>: " + date + "  <time>: " + time 
						+ "  <place>: " + place + "  <with>: " + who + "  <content>: " + content);
	}
	
	public void getUserInput(Scanner input) {
		setScheduleDate(input);
		setScheduleTime(input);
		setSchedulePlace(input);
		setScheduleWho(input);
		setScheduleContent(input);
	}
	
	public void setSchedulePlace(Scanner input) {
		System.out.print("Input the place: ");
		String place = input.next();
		this.setPlace(place);
	}
	
	public void setScheduleWho(Scanner input) {
		System.out.print("With who?: ");
		input.nextLine();
		String who = input.nextLine();
		this.setWho(who);
	}
}
