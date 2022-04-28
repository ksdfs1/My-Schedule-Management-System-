//과제 일정을 의미하는 Assignment 클래스는 Schedule 클래스의 상속을 받는다. 
//기본 생성자와 부모 클래스의 생성자를 통해 카테고리를 초기화하는 생성자가 있다.(method overloading)
//출력 내용이 부모 클래스와 다르기 때문에 printInfo 메소드를 재정의함.(method overriding)
//printInfo 메소드가 실행될 때는 부모 클래스에 있는 setget_s_category 메소드에 접근함.
//입력 내용이 부모 클래스와 다르기 때문에getUserInput 메소드도 재정의함.(method overriding)
package Schedule;

import java.util.Scanner;

public class Assignment extends Schedule {  //Schedule 클래스를 부모 클래스오 두는 Assignment 클래스
	
	public Assignment() {  //기본 생성자
		
	}
	
	public Assignment(ScheduleCategory category) {  //생성자(super를 통해 category 초기화)
		super(category);
	}
	
	public void printInfo() { //필드값을 출력하는 함수(date와 time을 due date와 due time으로 바꾸기 위해 재정의)
		System.out.print("[Category: " + setget_s_category() + "]  <due date>: " + date + "  <due time>: " + time + "  <content>: " + content);
	}
	
	public void getUserInput(Scanner input) {  //마찬가지로 date와 time을 due date와 due time으로 바꾸기 위해 새로 작성함
		System.out.print("Input the due date: ");  //Assignmnet는 due date을 입력하여 부모 클래스 필드의 date에 할당
		int duedate = input.nextInt();
		this.setDate(duedate);
		
		System.out.print("Input the due time: ");  //Assignmnet는 due time을 입력하여 부모 클래스 필드의 time에 할당
		String duetime = input.next();
		this.setTime(duetime);
		
		System.out.print("Schedule Content: ");  
		input.nextLine();
		String content = input.nextLine();
		this.setContent(content);
	}
}
