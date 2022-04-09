package Schedule;

import java.util.Scanner;

public class Assignment extends Schedule {  //Schedule 클래스를 부모 클래스오 두는 Assignment 클래스
	
	public void printInfo() { //필드값을 출력하는 함수(date와 time을 due date와 due time으로 바꾸기 위해 새로 작성함)
		System.out.print("-due date: " + date + "  -due time: " + time + "  -content: " + content);
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
		System.out.println("The new schedule is added."); 
	}
}
