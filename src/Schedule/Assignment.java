package Schedule;

import java.util.Scanner;

public class Assignment extends Schedule {
	
	public void printInfo() { 
		System.out.print("-due date: " + date + "  -due time: " + time + "  -content: " + content);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Input the due date: ");  //Assignmnet는 제출기한을 입력하여 부모 클래스 필드의 date에 할당
		int duedate = input.nextInt();
		this.setDate(duedate);
		
		System.out.print("Input the due time: ");  //Assignmnet는 제출기한을 입력하여 부모 클래스 필드의 time에 할당
		String duetime = input.next();
		this.setTime(duetime);
		
		System.out.print("Schedule Content: ");  
		input.nextLine();
		String content = input.nextLine();
		this.setContent(content);
		System.out.println("The new schedule is added."); 
	}
}
