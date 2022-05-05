//Schedule ����Ʈ�� �����ϰ� ���α׷��� ����� �� ����ڷκ��� �޴��� �Է¹����� �׿� ���� �� Ŭ������ �ִ� �޼ҵ尡 ����ȴ�. 
//�ʵ忡�� ������� �Է��� �޴� input, ����(��ü)�� �ּҸ� �Ҵ��� schedule, ��� ����(��ü)�� �ּҸ� ������ scheduleList(ArrayList) ������ �ִ�.
//�⺻ �����ڿ� input�� �ʱ�ȭ�ϴ� �����ڰ� �ִ�.(method overloading)
//����Ʈ�� ����(��ü)�� �ּҸ� �߰�, ����, ��ġ�ϴ� �޼ҵ� addScheduleList, deleteScheduleList, searchScheduleList�� �ִ�.
//MenuManager�� switch���� ���� ����Ǵ� �޼ҵ� addSchedule, deleteSchedule, editSchedule, viewSchedules�� �ִ�.
import java.util.ArrayList;
import java.util.Scanner;

import Schedule.Assignment;
import Schedule.Course;
import Schedule.Exam;
import Schedule.Promise;
import Schedule.Schedule;
import Schedule.ScheduleCategory;
import Schedule.ScheduleInput;

public class ScheduleManager {  //ScheduleManager Ŭ����
	private Scanner input;      //�ʵ��� ������
	private ScheduleInput scheduleInput;
	private ArrayList<ScheduleInput> scheduleList = new ArrayList<ScheduleInput>();  //schedule ��ü�� �ּҸ� �����ϴ� ����Ʈ
	
	ScheduleManager() {  //�⺻ ������
		
	}
	
	ScheduleManager(Scanner input) {  //�����ڸ� ���� ManuManager���� ���� input�� �״�� ���(method overloading)
		this.input = input;
	}
	
	public void addScheduleList(ScheduleInput scheduleInput) {  //����Ʈ�� scheduleInput ��ü�� �ּҸ� �߰��ϴ� �Լ�
		scheduleList.add(scheduleInput);
	}
	
	public void deleteScheduleList(ScheduleInput scheduleInput) {  //����Ʈ�� scheduleInput ��ü�� �ּҸ� �����ϴ� �Լ�
		scheduleList.remove(scheduleInput);
	}
	
	public void searchScheduleList(String content) {  //����Ʈ�� �ִ� scheduleInput ��ü�� �ּ� �� ���ϴ� �ּҸ� ã�� �Լ�
		for(int i = 0; i < scheduleList.size(); i++) {  //for������ ����Ʈ ��ü�� �� ���� �˻�
			if(scheduleList.get(i).getContent().equals(content)) {  //���� ����Ʈ �ε����� �ּҰ��� content�� ����ڰ� �Է��� content�� ������ 
				this.scheduleInput = scheduleList.get(i);     //���� �ʵ��� scheduleInput�� ���� �� �ε����� �ּҰ��� �Ҵ�
				break;
			}else {  //��ġ�ϴ� �� ������ null�� �Ҵ�
				this.scheduleInput = null;
			}
		}
	}
	
	public void addSchedule() {  //���� �߰� �Լ�
		int Category = 0;
		while(Category == 0) {
			System.out.println("1. for Course");  //ī�װ��� ����
			System.out.println("2. for Assignment");
			System.out.println("3. for Exam");
			System.out.println("4. for Promise");
			System.out.print("Select num for Schedule Category (1~4): ");
			Category = input.nextInt();  //ī�װ��� �Է¹ް� ���ǹ��� ���� if ����
			if(Category == 1) {
				this.scheduleInput = new Course(ScheduleCategory.Course);
				scheduleInput.getUserInput(input);
				addScheduleList(scheduleInput); //addScheduleList() �Լ��� ����Ʈ ���� scheduleInput ��ü�� �ּ� �߰�
				break;
			}else if(Category == 2) {
				this.scheduleInput = new Assignment(ScheduleCategory.Assignment);  //Assignment ��ü ����
				scheduleInput.getUserInput(input);
				addScheduleList(scheduleInput); //addScheduleList() �Լ��� ����Ʈ ���� scheduleInput ��ü�� �ּ� �߰�
				break;
			}else if(Category == 3) {
				this.scheduleInput = new Exam(ScheduleCategory.Exam);  //Exam ��ü ����
				scheduleInput.getUserInput(input); 
				addScheduleList(scheduleInput); //addScheduleList() �Լ��� ����Ʈ ���� scheduleInput ��ü�� �ּ� �߰�
				break;
			}else if(Category == 4) {
				this.scheduleInput = new Promise(ScheduleCategory.Promise);  //Promise ��ü ����
				scheduleInput.getUserInput(input);
				addScheduleList(scheduleInput); //addScheduleList() �Լ��� ����Ʈ ���� scheduleInput ��ü�� �ּ� �߰�
				break;
			}else {
				System.out.println("You input the wrong num.");
				continue;
			}
		}
		System.out.println("The new schedule is added."); //������ ����Ʈ�� �߰��Ǿ����� �˸�
	}
	public void deleteSchedule() {  //���� ���� �Լ�
		System.out.print("Input the Schedule content you want to delete: ");  //������ ������ content�� �Է¹���.
		input.nextLine();
		String content = input.nextLine();
		searchScheduleList(content);  //searchScheduleList() �Լ����� ���� ����ڰ� �Է��� content�� �޾Ƽ� ���ϴ� �ּ� ã�ƿ�.
		if(scheduleInput == null) { //schedule�� null�̸� �����Ͽ� �ٽ� �ϵ��� ��.
			System.out.println("The schedule doesn't exist.");
			return;
		}
		if(scheduleInput.getContent().equals(content)) {  //schedule ��ü�� content���� �Է¹��� content ���� ������ ����
			deleteScheduleList(scheduleInput);  //deleteScheduleList()�� ����Ʈ�� ����Ǿ� �ִ� �ش� �ּ� ����
			scheduleInput = null;               //���� schedule�� null�� ����
			System.out.println("The schedule" + content + "is deleted."); 
		}
	}
    public void editSchedule() {  //���� ���� �Լ�
    	if(scheduleList.isEmpty()) {  //scheduleList�� ����ִ��� �˻� �� ��������� ����
			System.out.println("The scheduleList is empty.");
			return;
    	}
		System.out.print("Input the Schedule content you want to edit: ");  //������ �������� content�� �Է¹���.
		input.nextLine();
		String content = input.nextLine();
		searchScheduleList(content);  //searchScheduleList() �Լ����� ���� ����ڰ� �Է��� content�� �޾Ƽ� ���ϴ� �ּ� ã�ƿ�.
		if(scheduleInput == null) {  //schedule�� null���� �˻�
			System.out.println("The schedule doesn't exist.");
		}else if(scheduleInput.getContent().equals(content)) {  //schedule(�ʵ�)�� content ���� �Է¹��� content ���� ������ ����(�ݺ�)
			int num = 0;
			while(num != 4) {  //����ڰ� ������ �����ϱ� �������� ��� �ݺ��Ѵ�.
				System.out.println();  //�Ʒ��� � ���� ������ ������ �Է¹޴� �ڵ��̴�
				System.out.println("The schedule to be edited is " + content);
				System.out.println("[Schedule Edit Menu]");
				System.out.println("1. Edit date");
				System.out.println("2. Edit time");
				System.out.println("3. Edit content");
				System.out.println("4. End editing");
				System.out.print("Input one of the numbers: ");
				num = input.nextInt();
				if(num == 1) {  //�Է¹��� num�� ���� if�� ����
					System.out.print("Input the new date: ");
					int newdate = input.nextInt();
					scheduleInput.setDate(newdate);
					System.out.print("Edit Complete.");
				}else if(num == 2) {
					System.out.print("Input the new time: ");
					String newtime = input.next();
					scheduleInput.setTime(newtime);
					System.out.print("Edit Complete.");
				}else if(num == 3) {
					System.out.print("Input the new content: ");
					input.nextLine();
					String newcontent = input.nextLine();
					scheduleInput.setContent(newcontent);
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
    	if(scheduleList.isEmpty()) {  //scheduleList�� ����ִ��� �˻�
			System.out.println("The scheduleList is empty.");
    	}else {  //�ƴϸ� ���
    		System.out.println("*** ScheduleList ***");
    		for(int i = 0; i < scheduleList.size(); i++) {  //for ������ ��� ������ ���
    			System.out.print(">> ");
    			scheduleList.get(i).printInfo();  //����Ʈ�� ����� �ּҸ��� �ִ� printInfo �޼ҵ� ����
    			System.out.println();
    		}
		}
	}
}
