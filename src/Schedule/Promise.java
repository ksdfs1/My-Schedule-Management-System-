//약속 일정을 의미하는 Promise 클래스는 Schedule 클래스의 상속을 받는다. 
//기본 생성자와 부모 클래스의 생성자를 통해 카테고리를 초기화하는 생성자, 그리고 who와 place를 초기화 하는 생성자가 있다.(method overloading)
//필드에는 약속대상과 약속장소를 의미하는 who, place 변수가 있고 그에 따른 getter, setter 메소드가 있다.
//출력 내용이 부모 클래스와 다르기 때문에 printInfo 메소드를 재정의함.(method overriding)
//printInfo 메소드가 실행될 때는 부모 클래스에 있는 setget_s_category 메소드에 접근함.
//입력 내용이 부모 클래스와 다르기 때문에getUserInput 메소드도 재정의함.(method overriding)
package Schedule;

import java.util.Scanner;

public class Promise extends Schedule {  //Schedule 클래스를 부모 클래스로 두는 Promise 클래스
	protected String who;  //약속대상 변수
	protected String place;  //약속장소 변수
	
	public Promise() {  //생성자
		
	}
	
	public Promise(ScheduleCategory category) {  //생성자(super를 통해 category 초기화)
		super(category);
	}
	
	public Promise(String who, String place) {  //생성자(who, place 초기화)
		this.who = who;
		this.place = place;
	}
	
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
		System.out.print("[Category: " + setget_s_category() + "]  <date>: " + date + "  <time>: " + time 
						+ "  <with>: " + who + "  <place>: " + place + "  <content>: " + content);
	}
	
	public void getUserInput(Scanner input) {  //필드에 입력받은 값을 할당하는 메소드
		System.out.print("Input the date: ");  
		int date = input.nextInt();
		this.setDate(date);
		
		System.out.print("Input the time: ");
		String time = input.next();
		this.setTime(time);
		
		System.out.print("With whom?: ");
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
	}
}
