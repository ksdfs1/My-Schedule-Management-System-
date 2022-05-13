//���� ������ �ǹ��ϴ� Exam Ŭ������ Schedule Ŭ������ ����� �޴´�. 
//�⺻ �����ڿ� �θ� Ŭ������ �����ڸ� ���� ī�װ��� �ʱ�ȭ�ϴ� ������, �׸��� place�� �ʱ�ȭ�ϴ� �����ڰ� �ִ�.(method overloading)
//�ʵ忡�� ���� ��Ҹ� �ǹ̶�� ���� place ������ �ְ� �׿� ���� getter, setter �޼ҵ尡 �ִ�.
//��� ������ �θ� Ŭ������ �ٸ��� ������ printInfo �޼ҵ带 ��������.(method overriding)
//printInfo �޼ҵ尡 ����� ���� �θ� Ŭ������ �ִ� setget_s_category �޼ҵ忡 ������.
//�Է� ������ �θ� Ŭ������ �ٸ��� ������getUserInput �޼ҵ嵵 ��������.(method overriding)
package Schedule;

import java.util.Scanner;

public class Exam extends Schedule {
	protected String place;
	
	public Exam() {
		
	}
	
	public Exam(ScheduleCategory category) {
		super(category);
	}
	
	public String getPlace() {
		return place;
	}
	
	public void setPlace(String place) {
		this.place = place;
	}
	
	public void printInfo() {
		System.out.print("[Category: " + getCategory() + "]  <date>: " + date + "  <time>: " + time 
						+ "  <place>: " + place + "  <content>: " + content);
	}
	
	public void getUserInput(Scanner input) {
		setScheduleDate(input);
		setScheduleTime(input);
		setSchedulePlace(input);
		setScheduleContent(input);
	}
	
	public void setSchedulePlace(Scanner input) {
		System.out.print("Input the place: ");
		String place = input.next();
		this.setPlace(place);
	}
}
