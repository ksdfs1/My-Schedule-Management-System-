package Schedule;

import java.util.Scanner;

public class Schedule {  //Schedule 클래스
	protected ScheduleCategory category = ScheduleCategory.Course;  //course를 기본 디폴트로 함.
	protected int date;       //필드에 변수 선언
	protected String time;
	protected String content;
	
	public Schedule() {  //생성자
		
	}
	
	public Schedule(int date, String time, String content) {  //생성자
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
	
	public void printInfo() {  //필드값을 출력하는 메소드
		System.out.print("-date: " + date + "  -time: " + time + "  -content: " + content);
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
		System.out.println("The new schedule is added."); 
	}
}
