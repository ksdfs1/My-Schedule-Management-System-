//시험 일정을 의미하는 Exam 클래스는 Schedule 클래스의 상속을 받는다. 
//기본 생성자와 부모 클래스의 생성자를 통해 카테고리를 초기화하는 생성자, 그리고 place를 초기화하는 생성자가 있다.(method overloading)
//필드에는 시험 장소를 의미라는 변수 place 변수가 있고 그에 따른 getter, setter 메소드가 있다.
//출력 내용이 부모 클래스와 다르기 때문에 printInfo 메소드를 재정의함.(method overriding)
//printInfo 메소드가 실행될 때는 부모 클래스에 있는 setget_s_category 메소드에 접근함.
//입력 내용이 부모 클래스와 다르기 때문에getUserInput 메소드도 재정의함.(method overriding)
package Schedule;

import java.util.Scanner;

public class Exam extends Schedule {
	protected String place;
	
	public Exam() {
		
	}
	
	public Exam(ScheduleCategory category) {
		super(category);
	}
	
	public String getPlace() {
		return place;
	}
	
	public void setPlace(String place) {
		this.place = place;
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
		this.setPlace(place);
	}
}
