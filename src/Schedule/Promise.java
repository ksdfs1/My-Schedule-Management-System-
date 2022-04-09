package Schedule;

import java.util.Scanner;

public class Promise extends Schedule {  //Schedule 클래스를 부모 클래스로 두는 Promise 클래스
	protected String who;  //약속 대상 변수
	protected String place;  //약속 장소 변수
	
	public String getWho() {  //아래 메소드들은 who와 place 값을 할당하고 리턴하는 setter, getter 메소드이다.
		return who;
	}
	
	public void setWho(String who) {
		this.who = who;
	}
	
	public String getPlace() {
		return place;
	}
	
	public void setPlace(String place) {
		this.place = place;
	}
	
	public void printInfo() {  //필드값을 출략하는 메소드(Promise는 who와 place까지 받기 때문에 부모 클래스와 같은 이름의 메소드를 새로 만들었다)
		System.out.print("-date: " + date + "  -time: " + time + "  -with: " + who
						 + "  -place: " + place + "  -content: " + content);
	}
	
	public void getUserInput(Scanner input) {  //필드에 입력받은 값을 할당하는 메소드
		System.out.print("Input the date: ");  
		int date = input.nextInt();
		this.setDate(date);
		
		System.out.print("Input the time: ");
		String time = input.next();
		this.setTime(time);
		
		System.out.print("with Whom?: ");
		input.nextLine();
		String who = input.nextLine();
		this.setWho(who);
		
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
