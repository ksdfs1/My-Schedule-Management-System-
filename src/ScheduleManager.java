import java.util.ArrayList;
import java.util.Scanner;

import Schedule.Assignment;
import Schedule.Exam;
import Schedule.Promise;
import Schedule.Schedule;

public class ScheduleManager {  //ScheduleManager Ŭ����
	Scanner input;      //�ʵ��� ������
	Schedule schedule;
	ArrayList<Schedule> scheduleList = new ArrayList<Schedule>();  //schedule ��ü�� �ּҸ� �����ϴ� ����Ʈ
	
	ScheduleManager(Scanner input){  //�����ڸ� ���� Manumanager���� ���� input�� �״�� ���
		this.input = input;
	}
	
	public void addScheduleList(Schedule schedule) {  //����Ʈ�� schedule ��ü�� �ּҸ� �߰��ϴ� �Լ�
		scheduleList.add(schedule);
	}
	
	public void deleteScheduleList(Schedule schedule) {  //����Ʈ�� schedule ��ü�� �ּҸ� �����ϴ� �Լ�
		scheduleList.remove(schedule);
	}
	
	public void searchScheduleList(String content) {  //����Ʈ�� �ִ� schedule ��ü�� �ּ� �� ���ϴ� �ּҸ� ã�� �Լ�
		for(int i = 0; i < scheduleList.size(); i++) {  //for������ ����Ʈ ��ü�� �� ���� �˻�
			if(scheduleList.get(i).getContent().equals(content)) {  //���� ����Ʈ �ε����� �ּҰ��� name�� ����ڰ� �Է��� name�̶� ������ 
				this.schedule = scheduleList.get(i);     //���� �ʵ��� schedule�� ���� �� �ε����� �ּҰ��� �Ҵ�
				break;
			}else {  //��ġ�ϴ� �� ������ null�� �Ҵ�
				this.schedule = null;
			}
		}
	}
	
	public void addSchedule() {  //���� �߰� �Լ�
		int Category = 0;
		while(Category ==0) {
			System.out.println("1. for Course");
			System.out.println("2. for Assignment");
			System.out.println("3. for Exam");
			System.out.println("4. for Promise");
			System.out.print("Select num for Schedule Category (1~4): ");
			Category = input.nextInt();
			if(Category == 1) {
				this.schedule = new Schedule();
				schedule.getUserInput(input);
				addScheduleList(schedule); //addScheduleList() �Լ��� ����Ʈ ���� schedule ��ü�� �ּ� �߰�
				break;
			}else if(Category == 2) {
				this.schedule = new Assignment();
				schedule.getUserInput(input);
				addScheduleList(schedule); //addScheduleList() �Լ��� ����Ʈ ���� schedule ��ü�� �ּ� �߰�
				break;
			}else if(Category == 3) {
				this.schedule = new Exam();
				schedule.getUserInput(input);
				addScheduleList(schedule); //addScheduleList() �Լ��� ����Ʈ ���� schedule ��ü�� �ּ� �߰�
				break;
			}else if(Category == 4) {
				this.schedule = new Promise();
				schedule.getUserInput(input);
				addScheduleList(schedule); //addScheduleList() �Լ��� ����Ʈ ���� schedule ��ü�� �ּ� �߰�
				break;
			}else {
				System.out.println("You input the wrong num.");
				continue;
			}
		}        
	}
	public void deleteSchedule() {  //���� ���� �Լ�
		System.out.print("Input the Schedule content you want to delete: ");  //������ ������ �̸��� �Է¹���.
		input.nextLine();  //�Ʒ��� nextLine�� �����Ǵ� ���� ������
		String content = input.nextLine();
		searchScheduleList(content);  //searchScheduleList() �Լ����� ���� ����ڰ� �Է��� name�� �޾Ƽ� ���ϴ� �ּ� ã�ƿ�.
		if(schedule == null) { //schedule�� null�̸� �����Ͽ� �ٽ� �ϵ��� ��.
			System.out.println("The schedule doesn't exist.");
			return;
		}
		if(schedule.getContent().equals(content)) {  //schedule ��ü�� content���� �Է¹��� content ���� ������ ����
			deleteScheduleList(schedule);  //deleteScheduleList()�� ����Ʈ�� ����Ǿ� �ִ� �ش� �ּ� ����
			schedule = null;              //���� schedule�� null�� ����
			System.out.println("The schedule" + content + "is deleted."); 
		}
	}
    public void editSchedule() {  //���� ���� �Լ�
		System.out.print("Input the Schedule content you want to edit: ");
		input.nextLine();
		String content = input.nextLine();
		searchScheduleList(content);  //searchScheduleList() �Լ����� ���� ����ڰ� �Է��� name�� �޾Ƽ� ���ϴ� �ּ� ã�ƿ�.
		if(schedule == null) {  //schedule�� null�̸� �����Ͽ� �ٽ� �ϵ��� ��.
			System.out.println("The schedule doesn't exist.");
			return;
		}
		if(schedule.getContent().equals(content)) {  //schedule ��ü�� name���� �Է¹��� name ���� ������ ����(�ݺ�)
			int num = 0;
			while(num != 4) {
				System.out.println();
				System.out.println("The schedule to be edited is " + content);
				System.out.println("[Schedule Edit Menu]");
				System.out.println("1. Edit date");
				System.out.println("2. Edit time");
				System.out.println("3. Edit content");
				System.out.println("4. End editing");
				System.out.print("Input one of the numbers: ");
				num = input.nextInt();
				if(num == 1) {
					System.out.print("Input the new date: ");
					int newdate = input.nextInt();
					schedule.setDate(newdate);
					System.out.print("Edit Complete.");
				}else if(num == 2) {
					System.out.print("Input the new time: ");
					String newtime = input.next();
					schedule.setTime(newtime);
					System.out.print("Edit Complete.");
				}else if(num == 3) {
					System.out.print("Input the new content: ");
					input.nextLine();
					String newcontent = input.nextLine();
					schedule.setContent(newcontent);
					System.out.print("Edit Complete.");
				}else if(num == 4) {
					System.out.println("End editing.");
					break;
				}else {
					System.out.println("You input the wrong number.");
					System.out.println("Try again.");
				}
				System.out.println();
			}
		}
	}
    public void viewSchedules() {  //���� ���� �Լ�
    	if(scheduleList.isEmpty()) {  //schedule�� ��������� ����
			System.out.println("The scheduleList is empty.");
			return;
		}
    	System.out.println("[ScheduleList]");
		for(int i = 0; i < scheduleList.size(); i++) {  //for ������ ��� ������ ���
			System.out.print(">> ");
			scheduleList.get(i).printInfo();
			System.out.println();
		}
	}
}
