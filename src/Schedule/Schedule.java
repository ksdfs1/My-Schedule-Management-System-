//Schedule 카테코리에서 course를 담당하는 Schedule 클래스
//기본 생성자와 category를 초기화하는 생성자, 그리고 date, time, content를 초기화하는 생성자가 있다.(method overloading)
//course를 기본 디폴트로 하여 변수로 category, date, time, content를 가지고 이에 해당하는 getter, setter 메소드가 있다.(category 제외)
//printInfo 메소드는 필드값을 출력하는 기능을 가지고 있는데 switch 문을 이용하여 카테고리에 따라 category 변수에 알맞은 String 값을 할당한다.
//getUserInput 메소드는 Schedule이 리스트에 추가될 때 실행되어 사용자가 입력한 값을 필드의 변수에 할당한다.
package Schedule;

import java.util.Scanner;

public class Schedule {  //Schedule 클래스
	protected ScheduleCategory category = ScheduleCategory.Course;  //course를 기본 디폴트로 함.
	protected int date;       //필드에 변수 선언
	protected String time;
	protected String content;
	
	public Schedule() {  //생성자
		
	}
	
	public Schedule(ScheduleCategory category) {  //생성자(category 초기화)
		this.category = category;
	}
	
	public Schedule(int date, String time, String content) {  //생성자(date, time, content 초기화)
		this.date = date;
		this.time = time;
		this.content = content;
	}
	
	public ScheduleCategory getCategory() {  //아래의 메소드들은 각 변수의 getter, setter 메소드이다
		return category;
	}

	public void setCategory(ScheduleCategory category) {
		this.category = category;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public String setget_s_category() {  //printInfo를 실행할 때 s_category를 set하여 리턴하는 함수(자식 클래스들도 printInfo 실행 시 접근한다.)
		String s_category = "none";
		switch(this.category) {
		case Course:
			s_category = "Course";
			break;
		case Assignment:
			s_category = "Assignment";
			break;
		case Exam:
			s_category = "Exam";
			break;
		case Promise:
			s_category = "Promise";
			break;
		}
		return s_category;
	}

	public void printInfo() {  //필드값을 출력하는 메소드
		System.out.print("[Category: " + setget_s_category() + "]  <date>: " + date + "  <time>: " + time + "  <content>: " + content);
	}
	
	public void getUserInput(Scanner input) {  //객체가 생성되고 사용자가 입력을 시작하면 입력받아 필드에 저장하는 메소드
		System.out.print("Input the date: ");  
		int date = input.nextInt();
		this.setDate(date);  //setDate 메소드를 통해 필드에 값 저장
		
		System.out.print("Input the time: ");
		String time = input.next();
		this.setTime(time);  //setTime 메소드를 통해 필드에 값 저장
		
		System.out.print("Schedule Content: ");
		input.nextLine();
		String content = input.nextLine();
		this.setContent(content);  //setContent 메소드를 통해 필드에 값 저장
	}
}
