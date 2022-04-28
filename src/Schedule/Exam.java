//���� ������ �ǹ��ϴ� Exam Ŭ������ Schedule Ŭ������ ����� �޴´�.
//�⺻ �����ڿ� �θ� Ŭ������ �����ڸ� ���� ī�װ��� �ʱ�ȭ�ϴ� ������, �׸��� place�� �ʱ�ȭ�ϴ� �����ڰ� �ִ�.(method overloading)
//�ʵ忡�� ���� ��Ҹ� �ǹ̶�� ���� place ������ �ְ� �׿� ���� getter, setter �޼ҵ尡 �ִ�.
//��� ������ �θ� Ŭ������ �ٸ��� ������ printInfo �޼ҵ带 ��������.(method overriding)
//printInfo �޼ҵ尡 ����� ���� �θ� Ŭ������ �ִ� setget_s_category �޼ҵ忡 ������.
//�Է� ������ �θ� Ŭ������ �ٸ��� ������getUserInput �޼ҵ嵵 ��������.(method overriding)
package Schedule;

import java.util.Scanner;

public class Exam extends Schedule {  //Schedule Ŭ������ �θ� Ŭ������ �δ� Exam Ŭ����
	protected String place;  //���� ��Ҹ� �Է��� ����
	
	public Exam() {  //�⺻ ������
		
	}
	
	public Exam(ScheduleCategory category) {  //������(super�� ���� category �ʱ�ȭ)
		super(category);
	}
	
	public Exam(String place) {  //������(place �ʱ�ȭ)
		this.place = place;
	}
	
	public String getPlace() {  //place�� ���� �����ϴ� �޼ҵ�
		return place;
	}
	
	public void setPlace(String place) {  //parameter�� ���� ���� �ʵ忡 �Ҵ��ϴ� �޼ҵ�
		this.place = place;
	}
	
	public void printInfo() {  //�ʵ尪�� ����ϴ� �޼ҵ�(Exam�� ��ұ��� �ޱ� ������ �θ� Ŭ������ ���� �̸��� �޼ҵ带 ���� �������)
		System.out.print("[Category: " + setget_s_category() + "]  <date>: " + date + "  <time>: " + time 
						+ "  <place>: " + place + "  <content>: " + content);
	}
	
	public void getUserInput(Scanner input) {  //��� ���� �ޱ� ���� ���� �������.
		System.out.print("Input the date: ");  
		int date = input.nextInt();
		this.setDate(date);
		
		System.out.print("Input the time: ");
		String time = input.next();
		this.setTime(time);
		
		System.out.print("Input the place: ");
		String place = input.next();
		this.setPlace(place);
		
		System.out.print("Schedule Content: ");  
		input.nextLine();
		String content = input.nextLine();
		this.setContent(content);
	}
}
