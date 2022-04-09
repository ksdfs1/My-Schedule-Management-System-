package Schedule;

import java.util.Scanner;

public class Promise extends Schedule {  //Schedule Ŭ������ �θ� Ŭ������ �δ� Promise Ŭ����
	protected String who;  //��� ��� ����
	protected String place;  //��� ��� ����
	
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
		System.out.print("-date: " + date + "  -time: " + time + "  -with: " + who
						 + "  -place: " + place + "  -content: " + content);
	}
	
	public void getUserInput(Scanner input) {  //�ʵ忡 �Է¹��� ���� �Ҵ��ϴ� �޼ҵ�
		System.out.print("Input the date: ");  
		int date = input.nextInt();
		this.setDate(date);
		
		System.out.print("Input the time: ");
		String time = input.next();
		this.setTime(time);
		
		System.out.print("with Whom?: ");
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
		System.out.println("The new schedule is added."); 
	}
}
