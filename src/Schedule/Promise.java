//��� ������ �ǹ��ϴ� Promise Ŭ������ Schedule Ŭ������ ����� �޴´�. 
//�⺻ �����ڿ� �θ� Ŭ������ �����ڸ� ���� ī�װ��� �ʱ�ȭ�ϴ� ������, �׸��� who�� place�� �ʱ�ȭ �ϴ� �����ڰ� �ִ�.(method overloading)
//�ʵ忡�� ��Ӵ��� �����Ҹ� �ǹ��ϴ� who, place ������ �ְ� �׿� ���� getter, setter �޼ҵ尡 �ִ�.
//��� ������ �θ� Ŭ������ �ٸ��� ������ printInfo �޼ҵ带 ��������.(method overriding)
//printInfo �޼ҵ尡 ����� ���� �θ� Ŭ������ �ִ� setget_s_category �޼ҵ忡 ������.
//�Է� ������ �θ� Ŭ������ �ٸ��� ������getUserInput �޼ҵ嵵 ��������.(method overriding)
package Schedule;

import java.util.Scanner;

public class Promise extends Schedule {  //Schedule Ŭ������ �θ� Ŭ������ �δ� Promise Ŭ����
	protected String who;  //��Ӵ�� ����
	protected String place;  //������ ����
	
	public Promise() {  //������
		
	}
	
	public Promise(ScheduleCategory category) {  //������(super�� ���� category �ʱ�ȭ)
		super(category);
	}
	
	public Promise(String who, String place) {  //������(who, place �ʱ�ȭ)
		this.who = who;
		this.place = place;
	}
	
	public String getWho() {  //�Ʒ� �޼ҵ���� who�� place ���� �Ҵ��ϰ� �����ϴ� setter, getter �޼ҵ��̴�.
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
	
	public void printInfo() {  //�ʵ尪�� �ⷫ�ϴ� �޼ҵ�(Promise�� who�� place���� �ޱ� ������ �θ� Ŭ������ ���� �̸��� �޼ҵ带 ���� �������)
		System.out.print("[Category: " + setget_s_category() + "]  <date>: " + date + "  <time>: " + time 
						+ "  <with>: " + who + "  <place>: " + place + "  <content>: " + content);
	}
	
	public void getUserInput(Scanner input) {  //�ʵ忡 �Է¹��� ���� �Ҵ��ϴ� �޼ҵ�
		System.out.print("Input the date: ");  
		int date = input.nextInt();
		this.setDate(date);
		
		System.out.print("Input the time: ");
		String time = input.next();
		this.setTime(time);
		
		System.out.print("With whom?: ");
		input.nextLine();
		String who = input.nextLine();
		this.setWho(who);
		
		System.out.print("Input the place: ");
		String place = input.next();
		this.setPlace(place);
		
		System.out.print("Schedule Content: ");
		input.nextLine();
		String content = input.nextLine();
		this.setContent(content);
	}
}
