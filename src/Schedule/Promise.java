//약속 일정을 의미하는 Promise 클래스는 Schedule 클래스의 상속을 받는다. 
//기본 생성자와 부모 클래스의 생성자를 통해 카테고리를 초기화하는 생성자, 그리고 who와 place를 초기화 하는 생성자가 있다.(method overloading)
//필드에는 약속대상과 약속장소를 의미하는 who, place 변수가 있고 그에 따른 getter, setter 메소드가 있다.
//출력 내용이 부모 클래스와 다르기 때문에 printInfo 메소드를 재정의함.(method overriding)
//printInfo 메소드가 실행될 때는 부모 클래스에 있는 setget_s_category 메소드에 접근함.
//입력 내용이 부모 클래스와 다르기 때문에getUserInput 메소드도 재정의함.(method overriding)
package Schedule;

import java.util.Scanner;

public class Promise extends Schedule {
	protected String who;
	protected String place;
	
	public Promise() {
		
	}
	
	public Promise(ScheduleCategory category) {  //생성자(super를 통해 category 초기화)
		super(category);
	}
	
	public String getWho() {
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
	
	public void printInfo() {
		System.out.print("[Category: " + getCategory() + "]  <date>: " + date + "  <time>: " + time 
						+ "  <with>: " + who + "  <place>: " + place + "  <content>: " + content);
	}
	
	public void getUserInput(Scanner input) {
		setScheduleDate(input);
		setScheduleTime(input);
		setSchedulePlace(input);
		setScheduleContent(input);
		setScheduleWho(input);
	}
	
	public void setSchedulePlace(Scanner input) {
		System.out.print("Input the place: ");
		String place = input.next();
		this.setPlace(place);
	}
	
	public void setScheduleWho(Scanner input) {
		System.out.print("With whom?: ");
		String who = input.nextLine();
		this.setWho(who);
	}
}
