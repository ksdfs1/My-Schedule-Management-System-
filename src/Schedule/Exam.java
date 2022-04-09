package Schedule;

import java.util.Scanner;

public class Exam extends Schedule {  //Schedule 클래스를 부모 클래스로 두는 Exam 클래스
	protected String place;  //시험 장소를 입력할 변수
	
	public String getPlace() {  //place의 값을 리턴하는 메소드
		return place;
	}
	
	public void setPlace(String place) {  //parameter로 받은 값을 필드에 할당하는 메소드
		this.place = place;
	}
	
	public void printInfo() {  //필드값을 출력하는 메소드(Exam은 장소까지 받기 때문에 부모 클래스와 같은 이름의 메소드를 새로 만들었다)
		System.out.print("-date: " + date + "  -time: " + time + "  -place: " + place + "  -content: " + content);
	}
	
	public void getUserInput(Scanner input) {  //장소 값을 받기 위해 새로 만들었다.
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
