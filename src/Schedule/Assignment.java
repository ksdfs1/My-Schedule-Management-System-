//���� ������ �ǹ��ϴ� Assignment Ŭ������ Schedule Ŭ������ ����� �޴´�. 
//�⺻ �����ڿ� �θ� Ŭ������ �����ڸ� ���� ī�װ��� �ʱ�ȭ�ϴ� �����ڰ� �ִ�.(method overloading)
//��� ������ �θ� Ŭ������ �ٸ��� ������ printInfo �޼ҵ带 ��������.(method overriding)
//printInfo �޼ҵ尡 ����� ���� �θ� Ŭ������ �ִ� setget_s_category �޼ҵ忡 ������.
//�Է� ������ �θ� Ŭ������ �ٸ��� ������getUserInput �޼ҵ嵵 ��������.(method overriding)
package Schedule;

import java.util.Scanner;

public class Assignment extends Schedule {  //Schedule Ŭ������ �θ� Ŭ������ �δ� Assignment Ŭ����
	
	public Assignment() {  //�⺻ ������
		
	}
	
	public Assignment(ScheduleCategory category) {  //������(super�� ���� category �ʱ�ȭ)
		super(category);
	}
	
	public void printInfo() { //�ʵ尪�� ����ϴ� �Լ�(date�� time�� due date�� due time���� �ٲٱ� ���� ������)
		System.out.print("[Category: " + setget_s_category() + "]  <due date>: " + date + "  <due time>: " + time + "  <content>: " + content);
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
	}
}
