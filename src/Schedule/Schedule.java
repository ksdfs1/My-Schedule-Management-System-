//Schedule 카테코리에서 course를 담당하는 Schedule abstract 클래스 
//기본 생성자와 category를 초기화하는 생성자, 그리고 date, time, content를 초기화하는 생성자가 있다.(method overloading)
//필드에 변수로 category, date, time, content를 가지고 이에 해당하는 getter, setter 메소드가 있다.
//printInfo() 메소드를 abstract로 선언 -> 필드의 변수로 일정을 출력하는 메소드임.
//getUserInput() 메소드를 abstract로 선언 -> 사용자에게 일정 날짜, 시간 등을 입력받을 때 사용되는 메소드임.
package Schedule;

import java.util.Scanner;

public abstract class Schedule {  //Schedule abstract 클래스(이 클래스는 직접 객체를 생성할 수 없다.)
	protected ScheduleCategory category;  //원래 Course가 디폴트 였으나 Course 클래스를 만들었으므로 제거
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

	public abstract void printInfo();
}
