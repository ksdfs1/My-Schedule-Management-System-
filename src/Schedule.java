
public class Schedule {  //Schedule Ŭ����
	int date;            //�ʵ忡 ���� ����
	String time;
	String name;
	String content;
	
	Schedule() {  //������
		
	}
	
	Schedule(int date, String time, String name) {  //������
		this.date = date;
		this.time = time;
		this.name = name;
	}
	
	Schedule(int date, String name) {  //������
		this.date = date;
		this.name = name;
	}
	
	public void printInfo() {  //�ʵ��� �������� ����ϴ� �Լ�
		System.out.println("date: " + date + "\ttime: " + time 
						+ "\tname: " + name + "\tcontent: " + content);
	}
}
