package Schedule;

import java.util.Scanner;

public class Course extends Schedule implements ScheduleInput {
	
	public Course() {
		
	}
	
	public Course(ScheduleCategory category) {  //생성자(category 초기화)
		this.category = category;
	}
	
	public void printInfo() {  //필드값을 출력하는 메소드(abstract method 재정의)
		System.out.print("[Category: " + setget_s_category() + "]  <date>: " + date 
						 + "  <time>: " + time + "  <content>: " + content);
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
