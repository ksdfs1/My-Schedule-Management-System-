//Schedule ī���ڸ����� course�� ����ϴ� Schedule abstract Ŭ���� 
//�⺻ �����ڿ� category�� �ʱ�ȭ�ϴ� ������, �׸��� date, time, content�� �ʱ�ȭ�ϴ� �����ڰ� �ִ�.(method overloading)
//�ʵ忡 ������ category, date, time, content�� ������ �̿� �ش��ϴ� getter, setter �޼ҵ尡 �ִ�.
//printInfo() �޼ҵ带 abstract�� ���� -> �ʵ��� ������ ������ ����ϴ� �޼ҵ���.
//getUserInput() �޼ҵ带 abstract�� ���� -> ����ڿ��� ���� ��¥, �ð� ���� �Է¹��� �� ���Ǵ� �޼ҵ���.
package Schedule;

import java.util.Scanner;

public abstract class Schedule {  //Schedule abstract Ŭ����(�� Ŭ������ ���� ��ü�� ������ �� ����.)
	protected ScheduleCategory category;  //���� Course�� ����Ʈ ������ Course Ŭ������ ��������Ƿ� ����
	protected int date;       //�ʵ忡 ���� ����
	protected String time;
	protected String content;
	
	public Schedule() {  //������
		
	}
	
	public Schedule(ScheduleCategory category) {  //������(category �ʱ�ȭ)
		this.category = category;
	}
	
	public Schedule(int date, String time, String content) {  //������(date, time, content �ʱ�ȭ)
		this.date = date;
		this.time = time;
		this.content = content;
	}
	
	public ScheduleCategory getCategory() {  //�Ʒ��� �޼ҵ���� �� ������ getter, setter �޼ҵ��̴�
		return category;
	}

	public void setCategory(ScheduleCategory category) {
		this.category = category;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public String setget_s_category() {  //printInfo�� ������ �� s_category�� set�Ͽ� �����ϴ� �Լ�(�ڽ� Ŭ�����鵵 printInfo ���� �� �����Ѵ�.)
		String s_category = "none";
		switch(this.category) {
		case Course:
			s_category = "Course";
			break;
		case Assignment:
			s_category = "Assignment";
			break;
		case Exam:
			s_category = "Exam";
			break;
		case Promise:
			s_category = "Promise";
			break;
		}
		return s_category;
	}

	public abstract void printInfo();
}
