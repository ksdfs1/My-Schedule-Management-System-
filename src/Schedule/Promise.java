//��� ������ �ǹ��ϴ� Promise Ŭ������ Schedule Ŭ������ ����� �޴´�. 
//�⺻ �����ڿ� �θ� Ŭ������ �����ڸ� ���� ī�װ��� �ʱ�ȭ�ϴ� ������, �׸��� who�� place�� �ʱ�ȭ �ϴ� �����ڰ� �ִ�.(method overloading)
//�ʵ忡�� ��Ӵ��� �����Ҹ� �ǹ��ϴ� who, place ������ �ְ� �׿� ���� getter, setter �޼ҵ尡 �ִ�.
//��� ������ �θ� Ŭ������ �ٸ��� ������ printInfo �޼ҵ带 ��������.(method overriding)
//printInfo �޼ҵ尡 ����� ���� �θ� Ŭ������ �ִ� setget_s_category �޼ҵ忡 ������.
//�Է� ������ �θ� Ŭ������ �ٸ��� ������getUserInput �޼ҵ嵵 ��������.(method overriding)
package Schedule;

import java.util.Scanner;

public class Promise extends Schedule {
	protected String who;
	protected String place;
	
	public Promise() {
		
	}
	
	public Promise(ScheduleCategory category) {  //������(super�� ���� category �ʱ�ȭ)
		super(category);
	}
	
	public String getWho() {
		return who;
	}
	
	public void setWho(String who) {
		this.who = who;
	}
	
	public String getPlace() {
		return place;
	}
	
	public void setPlace(String place) {
		this.place = place;
	}
	
	public void printInfo() {
		System.out.print("[Category: " + getCategory() + "]  <date>: " + date + "  <time>: " + time 
						+ "  <with>: " + who + "  <place>: " + place + "  <content>: " + content);
	}
	
	public void getUserInput(Scanner input) {
		setScheduleDate(input);
		setScheduleTime(input);
		setSchedulePlace(input);
		setScheduleContent(input);
		setScheduleWho(input);
	}
	
	public void setSchedulePlace(Scanner input) {
		System.out.print("Input the place: ");
		String place = input.next();
		this.setPlace(place);
	}
	
	public void setScheduleWho(Scanner input) {
		System.out.print("With whom?: ");
		String who = input.nextLine();
		this.setWho(who);
	}
}
