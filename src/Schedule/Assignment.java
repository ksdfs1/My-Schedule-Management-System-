package Schedule;

import java.util.Scanner;

public class Assignment extends Schedule {  //Schedule Ŭ������ �θ� Ŭ������ �δ� Assignment Ŭ����
	
	public void printInfo() { //�ʵ尪�� ����ϴ� �Լ�(date�� time�� due date�� due time���� �ٲٱ� ���� ���� �ۼ���)
		System.out.print("-due date: " + date + "  -due time: " + time + "  -content: " + content);
	}
	
	public void getUserInput(Scanner input) {  //���������� date�� time�� due date�� due time���� �ٲٱ� ���� ���� �ۼ���
		System.out.print("Input the due date: ");  //Assignmnet�� due date�� �Է��Ͽ� �θ� Ŭ���� �ʵ��� date�� �Ҵ�
		int duedate = input.nextInt();
		this.setDate(duedate);
		
		System.out.print("Input the due time: ");  //Assignmnet�� due time�� �Է��Ͽ� �θ� Ŭ���� �ʵ��� time�� �Ҵ�
		String duetime = input.next();
		this.setTime(duetime);
		
		System.out.print("Schedule Content: ");  
		input.nextLine();
		String content = input.nextLine();
		this.setContent(content);
		System.out.println("The new schedule is added."); 
	}
}
