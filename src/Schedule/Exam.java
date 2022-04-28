//시험 일정을 의미하는 Exam 클래스는 Schedule 클래스의 상속을 받는다.
//기본 생성자와 부모 클래스의 생성자를 통해 카테고리를 초기화하는 생성자, 그리고 place를 초기화하는 생성자가 있다.(method overloading)
//필드에는 시험 장소를 의미라는 변수 place 변수가 있고 그에 따른 getter, setter 메소드가 있다.
//출력 내용이 부모 클래스와 다르기 때문에 printInfo 메소드를 재정의함.(method overriding)
//printInfo 메소드가 실행될 때는 부모 클래스에 있는 setget_s_category 메소드에 접근함.
//입력 내용이 부모 클래스와 다르기 때문에getUserInput 메소드도 재정의함.(method overriding)
package Schedule;

import java.util.Scanner;

public class Exam extends Schedule {  //Schedule 클래스를 부모 클래스로 두는 Exam 클래스
	protected String place;  //시험 장소를 입력할 변수
	
	public Exam() {  //기본 생성자
		
	}
	
	public Exam(ScheduleCategory category) {  //생성자(super를 통해 category 초기화)
		super(category);
	}
	
	public Exam(String place) {  //생성자(place 초기화)
		this.place = place;
	}
	
	public String getPlace() {  //place의 값을 리턴하는 메소드
		return place;
	}
	
	public void setPlace(String place) {  //parameter로 받은 값을 필드에 할당하는 메소드
		this.place = place;
	}
	
	public void printInfo() {  //필드값을 출력하는 메소드(Exam은 장소까지 받기 때문에 부모 클래스와 같은 이름의 메소드를 새로 만들었다)
		System.out.print("[Category: " + setget_s_category() + "]  <date>: " + date + "  <time>: " + time 
						+ "  <place>: " + place + "  <content>: " + content);
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
	}
}
