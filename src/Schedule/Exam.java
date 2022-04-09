package Schedule;

import java.util.Scanner;

public class Exam extends Schedule {
	protected String place;  //시험 장소를 입력할 변수
	
	public String getPlace() {
		return place;
	}
	
	public void setPlace(String place) {
		this.place = place;
	}
	
	public void printInfo() { 
		System.out.print("-date: " + date + "  -time: " + time + "  -place: " + place + "  -content: " + content);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Input the date: ");  
		int date = input.nextInt();
		this.setDate(date);
		
		System.out.print("Input the time: ");
		String time = input.next();
		this.setTime(time);
		
		System.out.print("Input the place: ");
		String place = input.next();
		this.setPlace(place);
		
		System.out.print("Schedule Content: ");  
		input.nextLine();
		String content = input.nextLine();
		this.setContent(content);
		System.out.println("The new schedule is added."); 
	}
}
