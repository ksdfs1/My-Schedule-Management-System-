//���� ������ �ǹ��ϴ� Assignment Ŭ������ Schedule Ŭ������ ����� �޴´�. 
//�⺻ �����ڿ� �θ� Ŭ������ �����ڸ� ���� ī�װ��� �ʱ�ȭ�ϴ� �����ڰ� �ִ�.(method overloading)
//��� ������ �θ� Ŭ������ �ٸ��� ������ printInfo �޼ҵ带 ��������.(method overriding)
//printInfo �޼ҵ尡 ����� ���� �θ� Ŭ������ �ִ� setget_s_category �޼ҵ忡 ������.
//�Է� ������ �θ� Ŭ������ �ٸ��� ������getUserInput �޼ҵ嵵 ��������.(method overriding)
package Schedule;

import java.util.Scanner;

import exception.TimeFormatException;

public class Assignment extends Schedule {
	
	public Assignment() {
		
	}
	
	public Assignment(ScheduleCategory category) {
		super(category);
	}
	
	public void printInfo() {
		System.out.print("[Category: " + getCategory() + "]  <due date>: " + date 
						 + "  <due time>: " + time + "  <content>: " + content);
	}
	
	public void getUserInput(Scanner input) {
		setScheduleDate(input);
		setScheduleTime(input);
		setScheduleContent(input);
	}
	public void setScheduleDate(Scanner input) {
		System.out.print("Input the due date: ");
		int duedate = input.nextInt();
		this.setDate(duedate);
	 }
	    
	 public void setScheduleTime(Scanner input) {
		 String duetime = "";
		 while(!duetime.contains(":")) {
			 System.out.print("Input the due time: ");
			 duetime = input.next();
			 try {
				 this.setTime(duetime);
			 } catch (TimeFormatException e) {
				 System.out.println("Incorrect Time format. Put the time that contains ':'");
			 }
		 }
	 }
}
