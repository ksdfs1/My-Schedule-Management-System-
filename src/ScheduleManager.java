import java.util.ArrayList;
import java.util.Scanner;

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
	
	public void searchScheduleList(String name) {  //����Ʈ�� �ִ� schedule ��ü�� �ּ� �� ���ϴ� �ּҸ� ã�� �Լ�
		for(int i = 0; i < scheduleList.size(); i++) {  //for������ ����Ʈ ��ü�� �� ���� �˻�
			if(scheduleList.get(i).name.equals(name)) {  //���� ����Ʈ �ε����� �ּҰ��� name�� ����ڰ� �Է��� name�̶� ������ 
				this.schedule = scheduleList.get(i);     //���� �ʵ��� schedule�� ���� �� �ε����� �ּҰ��� �Ҵ�
				break;
			}else {  //��ġ�ϴ� �� ������ null�� �Ҵ�
				this.schedule = null;
			}
		}
	}
	
	public void addSchedules() {  //���� �߰� �Լ�
		this.schedule = new Schedule();  //���ο� Schedule Ÿ�� schedule ��ü ����
		System.out.print("Input the date: ");  //�Ʒ��� ����ڿ��� �ʵ尪�� ���� ���� �޴� �������
		schedule.date = input.nextInt();
		
		System.out.print("Input the time: ");
		schedule.time = input.next();
		                  
		System.out.print("Schedule Name: ");
		input.nextLine();  //�Ʒ��� nextLine�� �����Ǵ� ���� ������
		schedule.name = input.nextLine();
		
		System.out.print("Schedule Content: ");
		schedule.content = input.nextLine(); 
		
		addScheduleList(schedule);  //addScheduleList() �Լ��� ����Ʈ ���� schedule ��ü�� �ּ� �߰�
		System.out.println("The new schedule is added.");         
	}
	public void deleteSchedules() {  //���� ���� �Լ�
		System.out.print("Input the Schedule Name you want to delete: ");  //������ ������ �̸��� �Է¹���.
		input.nextLine();  //�Ʒ��� nextLine�� �����Ǵ� ���� ������
		String name = input.nextLine();
		searchScheduleList(name);  //searchScheduleList() �Լ����� ���� ����ڰ� �Է��� name�� �޾Ƽ� ���ϴ� �ּ� ã�ƿ�.
		if(schedule == null) { //schedule�� null�̸� �����Ͽ� �ٽ� �ϵ��� ��.
			System.out.println("The schedule doesn't exist.");
			return;
		}
		if(schedule.name.equals(name)) {  //schedule ��ü�� name���� �Է¹��� name ���� ������ ����
			deleteScheduleList(schedule);  //deleteScheduleList()�� ����Ʈ�� ����Ǿ� �ִ� �ش� �ּ� ����
			schedule = null;              //���� schedule�� null�� ����
			System.out.println("The schedule is deleted."); 
		}
	}
    public void editSchedules() {  //���� ���� �Լ�
		System.out.print("Input the Schedule Name you want to edit: ");
		input.nextLine();
		String name = input.nextLine();
		searchScheduleList(name);  //searchScheduleList() �Լ����� ���� ����ڰ� �Է��� name�� �޾Ƽ� ���ϴ� �ּ� ã�ƿ�.
		if(schedule == null) {  //schedule�� null�̸� �����Ͽ� �ٽ� �ϵ��� ��.
			System.out.println("The schedule doesn't exist.");
			return;
		}
		if(schedule.name.equals(name)) {  //schedule ��ü�� name���� �Է¹��� name ���� ������ ����
			System.out.println();                                        //�Ʒ��� ������ �ϴ� �ڵ���
			System.out.println("The schedule to be edited is " + name);
			System.out.println("[Schedule Edit Menu]");
			System.out.println("1. date");
			System.out.println("2. time");
			System.out.println("3. name");
			System.out.println("4. content");
			System.out.print("Input one of the numbers: ");
			int num = input.nextInt();
			if(num == 1) {
				System.out.print("Input the new date: ");
				int newdate = input.nextInt();
				schedule.date = newdate;
				System.out.print("Edit Complete.");
			}else if(num == 2) {
				System.out.print("Input the new time: ");
				String newtime = input.next();
				schedule.time = newtime;
				System.out.print("Edit Complete.");
			}else if(num == 3) {
				System.out.print("Input the new name: ");
				String newname = input.nextLine();
				schedule.name = newname;
				System.out.print("Edit Complete.");
			}else if(num == 4) {
				System.out.print("Input the new content: ");
				String newcontent = input.nextLine();
				schedule.content = newcontent;
				System.out.print("Edit Complete.");
			}
		}
	}
    public void viewSchedules() {  //���� ���� �Լ�
    	System.out.print("Input the Schedule Name you want to view: ");  //���� ���� ���� �̸� �Է¹���.
		input.nextLine();  //�Ʒ��� nextLine�� �����Ǵ� ���� ������
		String name = input.nextLine();
		searchScheduleList(name);  //searchScheduleList() �Լ����� ���� ����ڰ� �Է��� name�� �޾Ƽ� ���ϴ� �ּ� ã�ƿ�.
    	if(schedule == null) {  //schedule�� null�̸� �����Ͽ� �ٽ� �ϵ��� ��.
			System.out.println("The schedule doesn't exist.");
			return;
		}
		if(schedule.name.equals(name)) {  //schedule ��ü�� name���� �Է¹��� name ���� ������ ����
			 schedule.printInfo();        //�� schedule ��ü�� �ʵ尪���� printInfo() �Լ��� ���� ���
		}
	}
}
